package ua.nure.second.main;



import ua.nure.second.Memory;
import ua.nure.second.allCommand.CommandList;


public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        String str = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++" +
                ".>+.+++++++..+++.>++.<<+++++++++++++++.>.+++." +
                "------.--------.>+.>." ;

        Memory memory = new Memory();
        CommandList commandList = new CommandList();
        Parser parser = new Parser(commandList);
        parser.parse(str).forEach(command -> command.execute(memory));
    }
}
