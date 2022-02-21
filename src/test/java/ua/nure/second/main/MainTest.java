package ua.nure.second.main;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {
    private final PrintStream CASHED_OUTPUT_STREAM = System.out;
    private final InputStream CASHES_INPUT_STREAM = System.in;
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }


    @Test
    public void testMain() throws NoSuchMethodException {
        Main.main(null);
        assertEquals("Hello World!\n", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(CASHED_OUTPUT_STREAM);
        System.setIn(CASHES_INPUT_STREAM);
    }




}
