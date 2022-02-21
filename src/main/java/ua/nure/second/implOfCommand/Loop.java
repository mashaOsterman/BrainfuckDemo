package ua.nure.second.implOfCommand;

import ua.nure.second.Memory;

import java.util.List;

public class Loop implements Command {
    private List<Command> allCommands;

    public Loop(List<Command> innerCommands) {
        this.allCommands = innerCommands;
    }

    @Override
    public void execute(Memory memory) {
        while ( memory.getMemory()[memory.getPosition()] != 0) {
            allCommands.forEach(command -> command.execute(memory));
        }
    }



}