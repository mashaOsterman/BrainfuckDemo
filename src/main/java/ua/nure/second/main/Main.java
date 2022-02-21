package ua.nure.second.main;



import ua.nure.second.Memory;
import ua.nure.second.allCommand.CommandList;
import ua.nure.second.allCommand.Symbols;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        String str = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++" +
                ".>+.+++++++..+++.>++.<<+++++++++++++++.>.+++." +
                "------.--------.>+.>." ;

        /*Memory memory = new Memory();
        String [] arr = str.split("");
        CommandList commandList = new CommandList();
        for(String tmp : arr){
            commandList.getCommand(tmp).execute(memory);
        }*/

        Memory memory = new Memory();
        CommandList commandList = new CommandList();

        Symbols symbols = new Symbols(commandList);
        Parser parser = new Parser(symbols);
        Executor executor = new Executor(memory);

        executor.execute(parser.parse(str));
    }
}
