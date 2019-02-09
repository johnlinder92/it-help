import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class consolehandlerTest {

    @Test
    void getInt_ReturnIntValueFromScanner_IntValue10() throws IOException {

        //testar att metoden getInt returnerar en Int (10) från en textfil

        try (InputStream inputStream = consolehandlerTest.class.getResourceAsStream("/testconsolehandler.txt")) {

            Scanner scanner = new Scanner(inputStream);


            ConsoleHandler ch = new ConsoleHandler(scanner);

            int i = ch.getInt("");


            assertEquals(10, i);

        }

    }

    @Test
    void getString_ReturnStringValueFromScanner_StringvalueHej() throws IOException {

// testar att metoden getString returnerar en string ("10") från en textfil
        try (InputStream inputStream = consolehandlerTest.class.getResourceAsStream("/testconsolehandler.txt")) {

            Scanner scanner = new Scanner(inputStream);


            ConsoleHandler ch = new ConsoleHandler(scanner);

            String i = ch.getString("");


            assertEquals("10", i);

        }

    }
}
