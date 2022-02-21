package ua.nure.second.implOfCommand;

import ua.nure.second.Memory;

public class Plus implements Command {
    @Override
    public void execute(Memory memory) {
        memory.getMemory()[memory.getPosition()]++;
    }
}
