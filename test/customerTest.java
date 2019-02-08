import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class customerTest {


     @Test
     public void createCustomer_Returnscustomer_returnedCustomervaluesarethesameaslocallycreatedcustomer(){
// i det här testet jämför jag en manuellt skapad kund med en kund skapad av min publika metod.
         InputStream inputStream = consolehandlerTest.class.getResourceAsStream("/testcreatecustomer.txt");
         Scanner scanner = new Scanner(inputStream);
        ConsoleHandler ch = new ConsoleHandler(scanner);
        Customer a = Customer.Createcustomer(ch);

        Name name = new Name("Hej","Hej");
        Address address= new Address("Hej", 5, "Hej");

        Customer b = new Customer(name,"Hej", address);

        assertEquals(b, a);


    }


}
