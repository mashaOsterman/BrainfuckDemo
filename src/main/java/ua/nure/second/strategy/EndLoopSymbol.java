package ua.nure.second.strategy;

import ua.nure.second.implOfCommand.Command;
import ua.nure.second.implOfCommand.Loop;

import java.util.List;
import java.util.Stack;

public class EndLoopSymbol implements SymbolStrategy {
    @Override
    public void execute(Stack<List<Command>> commandStack) {
        List<Command> innerCommands = commandStack.pop();
        commandStack.peek().add(new Loop(innerCommands));
    }

}
