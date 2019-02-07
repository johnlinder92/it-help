import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class customerTest {


     @Test
     public void createCustomer_Returnscustomer_returnedCustomervaluesarethesameaslocallycreatedcustomer(){

         InputStream inputStream = consolehandlerTest.class.getResourceAsStream("/input2.txt");
         Scanner scanner = new Scanner(inputStream);
        ConsoleHandler ch = new ConsoleHandler(scanner);
        Customer a = Customer.Createcustomer(ch);

        Name name = new Name("Hej","Hej");
        Address address= new Address("Hej", 5, "Hej");

        Customer b = new Customer(name,"Hej", address);

        assertEquals(b, a);


    }


}
