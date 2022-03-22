package ua.nure.second.main;


import ua.nure.second.allCommand.CommandList;
import ua.nure.second.implOfCommand.Command;


import java.util.*;

public class Parser {

    private CommandList commandList;
    public Parser(CommandList commandList) {

        this.commandList = commandList;
    }

    public List<Command> parse(String inputData) throws NoSuchMethodException {
        Deque<List<Command>> commandStack = new ArrayDeque<>();

        commandStack.push(new LinkedList<>());
        String[] symbols2 = inputData.split("");
        for (String symbol : symbols2) {
            commandList.run(symbol, commandStack);
        }
        return commandStack.pop();
    }
}
