package ua.nure.second.main;


import ua.nure.second.implOfCommand.Command;

import java.util.List;


public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        String brainfuckProgram = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++" +
                ".>+.+++++++..+++.>++.<<+++++++++++++++.>.+++." +
                "------.--------.>+.>." ;
        List<Command> compiledCommands = new BrainfuckCompiler().compile(brainfuckProgram);
        new BrainfuckCommandsExecutor().execute(compiledCommands);





    }
}
