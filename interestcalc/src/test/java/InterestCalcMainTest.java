package main;

import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InterestCalcMainTest {
    @Test
    public void testMainValidInput() {
        // Input test data
        // Use principal = 1000, rate = 5, time = 5
        String simulatedInput = "1000\n5\n5\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes());
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();

        try {
            System.setIn(testIn);
            System.setOut(new PrintStream(testOut));

            // Call the main method
            InterestCalc.main(new String[]{});

            String output = testOut.toString();

            // Verify test result
            assertTrue(output.contains("Simple Interest") && output.contains("250.0"),
                    "Output should contain correct interest result");

        } finally {
            // Restore original streams
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }
}