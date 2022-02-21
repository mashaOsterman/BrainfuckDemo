package ua.nure.second.main;

import ua.nure.second.implOfCommand.Command;
import ua.nure.second.Memory;

import java.util.List;

public class Executor {
    private final Memory memory;

    public Executor(Memory memory) {
        this.memory = memory;
    }

    public void execute(List<Command> commands) {
        commands.forEach(command -> command.execute(memory));
    }

}