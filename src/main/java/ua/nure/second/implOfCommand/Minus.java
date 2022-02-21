package ua.nure.second.implOfCommand;

import ua.nure.second.Memory;

public class Minus implements Command {
    @Override
    public void execute(Memory memory) {
        if (isPositiveCell(memory)) {
            memory.getMemory()[memory.getPosition()]--;
        }
    }

    private boolean isPositiveCell(Memory memory) {
        return memory.getMemory()[memory.getPosition()] > 0;
    }

}
