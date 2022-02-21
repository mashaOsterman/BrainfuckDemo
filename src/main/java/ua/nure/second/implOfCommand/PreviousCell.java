package ua.nure.second.implOfCommand;

import ua.nure.second.Memory;

public class PreviousCell  implements Command {
    @Override
    public void execute(Memory memory) {
        if (isEmptyCell(memory)) {
            memory.setPosition(memory.getMemory().length - 1);
        } else {
            memory.setPosition(memory.getPosition() - 1);
        }
    }

    private boolean isEmptyCell(Memory memory) {
        return memory.getPosition() == 0;
    }

}
