package ua.nure.second.strategy;

import ua.nure.second.implOfCommand.Command;
import ua.nure.second.allCommand.CommandList;

import java.util.List;
import java.util.Stack;

public class StandardSymbol implements SymbolStrategy {
    private final String symbol;
    private final CommandList commandList;

    public StandardSymbol(String symbol, CommandList commandList) {
        this.symbol = symbol;
        this.commandList = commandList;
    }


    @Override
    public void execute(Stack<List<Command>> commandStack) throws NoSuchMethodException {
        commandStack.peek().add(commandList.getCommand(symbol));
    }
}

