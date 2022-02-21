package ua.nure.second.strategy;

import ua.nure.second.implOfCommand.Command;

import java.util.List;
import java.util.Stack;

public interface SymbolStrategy {
    void execute(Stack<List<Command>> commandStack) throws NoSuchMethodException;
}
