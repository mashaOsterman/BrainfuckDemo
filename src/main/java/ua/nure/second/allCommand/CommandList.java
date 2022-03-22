package ua.nure.second.allCommand;


import ua.nure.second.implOfCommand.Command;
import ua.nure.second.implOfCommand.*;

import java.util.*;

public class CommandList {
    private final Map<String, Command> commands;


    public CommandList() {
        commands = new HashMap<>();
        addCommands();
    }

    public Command getCommand(String symbol) throws NoSuchMethodException {
        return Optional.ofNullable(commands.get(symbol))
                .orElseThrow(() ->  new NoSuchMethodException ("Your symbol isn't correct " + symbol));
    }

    private void addCommands() {
        commands.put(">", new NextCell());
        commands.put("<", new PreviousCell());
        commands.put("+", new Plus());
        commands.put("-", new Minus());
        commands.put(".", new Print());
    }
    public void run(String symbol, Deque<List<Command>> commandStack) throws NoSuchMethodException {
        switch (symbol){
            case "[":
                commandStack.push(new LinkedList<>());
                break;
            case "]":
                List<Command> innerCommands = commandStack.pop();
                commandStack.peek().add(new Loop(innerCommands));
                break;
            default:
                commandStack.peek().add(Optional.ofNullable(commands.get(symbol))
                        .orElseThrow(() ->  new NoSuchMethodException ("Your symbol isn't correct " + symbol)));
        }
    }
}