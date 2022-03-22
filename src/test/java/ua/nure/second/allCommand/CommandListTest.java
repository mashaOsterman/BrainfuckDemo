package ua.nure.second.allCommand;

import org.junit.Assert;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ua.nure.second.Memory;
import ua.nure.second.implOfCommand.Minus;
import ua.nure.second.implOfCommand.NextCell;
import ua.nure.second.implOfCommand.Plus;
import ua.nure.second.implOfCommand.PreviousCell;

import ua.nure.second.main.Parser;

//import org.junit.jupiter.api.*;


public class CommandListTest {
    CommandList commandList = new CommandList();


    @Test
    public void getCommandTest () throws NoSuchMethodException {
        Assert.assertTrue(commandList.getCommand(">") instanceof NextCell);
        Assert.assertTrue(commandList.getCommand("<") instanceof PreviousCell);
        Assert.assertTrue(commandList.getCommand("+") instanceof Plus);
        Assert.assertTrue(commandList.getCommand("-") instanceof Minus);
    }

    @Test(expected = NoSuchMethodException.class)
    public void getCommandTest2() throws NoSuchMethodException {
        String str = "++++++33++++[>+++++++>++++++++++>+++>+<<<<-]>++" +
                ".>+.+++++++..+++.>++.<<+++++++++++++++.>.+++." +
                "------.--------.>+.>." ;
        Memory memory = new Memory();
        CommandList commandList = new CommandList();
        Parser parser = new Parser(commandList);
        parser.parse(str).forEach(command -> command.execute(memory));
    }
    @Test
    public void testExpectedException() {
      NoSuchMethodException thrown = Assertions.assertThrows(NoSuchMethodException.class, () -> {
            String str = "++++++33++++[>+++++++>++++++++++>+++>+<<<<-]>++" +
                    ".>+.+++++++..+++.>++.<<+++++++++++++++.>.+++." +
                    "------.--------.>+.>." ;
          Memory memory = new Memory();
          CommandList commandList = new CommandList();
          Parser parser = new Parser(commandList);
          parser.parse(str).forEach(command -> command.execute(memory));
        });
        Assertions.assertEquals("Your symbol isn't correct 3", thrown.getMessage());
    }

}
