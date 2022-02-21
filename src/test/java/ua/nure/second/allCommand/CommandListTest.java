package ua.nure.second.allCommand;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ua.nure.second.Memory;
import ua.nure.second.implOfCommand.Minus;
import ua.nure.second.implOfCommand.NextCell;
import ua.nure.second.implOfCommand.Plus;
import ua.nure.second.implOfCommand.PreviousCell;
import ua.nure.second.main.Executor;
import ua.nure.second.main.Main;
import ua.nure.second.main.Parser;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class CommandListTest {
    CommandList commandList = new CommandList();


    @Test
    public void getCommandTest () throws NoSuchMethodException {
        Assert.assertTrue(commandList.getCommand(">") instanceof NextCell);
        Assert.assertTrue(commandList.getCommand("<") instanceof PreviousCell);
        Assert.assertTrue(commandList.getCommand("+") instanceof Plus);
        Assert.assertTrue(commandList.getCommand("-") instanceof Minus);
    }

    /*@Test(expected = NoSuchMethodException.class)
    public void getCommandTest2() {
        String str = "++++++33++++[>+++++++>++++++++++>+++>+<<<<-]>++" +
                ".>+.+++++++..+++.>++.<<+++++++++++++++.>.+++." +
                "------.--------.>+.>." ;
        Memory memory = new Memory();
        CommandList commandList = new CommandList();
        Symbols symbols = new Symbols(commandList);
        Parser parser = new Parser(symbols);
        Executor executor = new Executor(memory);
        executor.execute(parser.parse(str));
    }*/
    @Test
    public void testExpectedException() {
       /* NoSuchMethodException thrown = Assertions.assertThrows(NoSuchMethodException.class, () -> {
            String str = "++++++33++++[>+++++++>++++++++++>+++>+<<<<-]>++" +
                    ".>+.+++++++..+++.>++.<<+++++++++++++++.>.+++." +
                    "------.--------.>+.>." ;
            Memory memory = new Memory();
            CommandList commandList = new CommandList();
            Symbols symbols = new Symbols(commandList);
            Parser parser = new Parser(symbols);
            Executor executor = new Executor(memory);
            executor.execute(parser.parse(str));
        });
        Assertions.assertEquals("did't find this symbol. Your symbol is 3", thrown.getMessage());*/




    }

}
