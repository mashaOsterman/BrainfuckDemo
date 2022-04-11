package ua.nure.second.main;

import ua.nure.second.Memory;

import ua.nure.second.implOfCommand.Command;

import java.util.List;

public class BrainfuckCommandsExecutor {
    void execute(List<Command> commands){
        Memory memory = new Memory();
        commands.forEach(command -> command.execute(memory));

    }
}
