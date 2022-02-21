package ua.nure.second.strategy;

import ua.nure.second.implOfCommand.Command;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StartLoopSymbol implements SymbolStrategy {
    @Override
    public void execute(Stack<List<Command>> commandStack) {
        commandStack.push(new LinkedList<>());
    }
}
