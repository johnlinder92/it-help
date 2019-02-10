import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class nameTest {
    @Test
   public void createName_Checksifonlycreatesnameswithcapitalfirstletter_returnsTrue()
   {
       InputStream inputStream = consolehandlerTest.class.getResourceAsStream("/testcreatename.txt");
       Scanner scanner = new Scanner(inputStream);
       ConsoleHandler ch = new ConsoleHandler(scanner);

      Name namnet = Name.Createname(ch);

       String efternamn = "Linder";
        String förnamn = "John";
      Name namnetb = new Name(förnamn,efternamn);


       assertEquals(namnet, namnetb);



     }



}
