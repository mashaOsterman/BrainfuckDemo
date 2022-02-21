package ua.nure.second.main;


import ua.nure.second.implOfCommand.Command;
import ua.nure.second.allCommand.Symbols;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Parser {
    private final Symbols symbols;

    public Parser(Symbols symbols) {
        this.symbols = symbols;
    }

    public List<Command> parse(String inputData) throws NoSuchMethodException {
        Stack<List<Command>> commandStack = new Stack<>();

        commandStack.push(new LinkedList<>());
        String[] symbols2 = inputData.split("");
        for (String symbol : symbols2) {
            symbols.getSymbolStrategy(symbol).execute(commandStack);
        }
        return commandStack.pop();
    }
}
