package ua.nure.second.implOfCommand;

import ua.nure.second.Memory;

public class NextCell implements Command {

    @Override
    public void execute(Memory memory) {
        if (FullMemory(memory)) {
            memory.setPosition(0);
        } else {
            memory.setPosition(memory.getPosition() + 1);
        }
    }

    private boolean FullMemory(Memory memory) {
        return memory.getPosition() == memory.getMemory().length - 1;
    }
}