package ua.nure.second.implOfCommand;

import ua.nure.second.Memory;

public class Print implements Command {
    @Override
    public void execute(Memory memory) {
        char result = (char) memory.getMemory()[memory.getPosition()];
        System.out.print(result);

    }
}
