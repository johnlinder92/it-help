import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class customerTest {


    @Test
    public void createCustomer_Returnscustomer_returnedCustomervaluesarethesameaslocallycreatedcustomer() {
// i det här testet jämför jag en manuellt skapad kund med en kund skapad av min publika metod.
        InputStream inputStream = consolehandlerTest.class.getResourceAsStream("/testcreatecustomer.txt");
        Scanner scanner = new Scanner(inputStream);
        ConsoleHandler ch = new ConsoleHandler(scanner);
        Customer a = Customer.Createcustomer(ch);

        Name name = new Name("Hej", "Hej");
        Address address = new Address("Hej", 5, "Hej");
        ArrayList<Goods> specificCart = new ArrayList();
        Customer b = new Customer(name, "Hej",specificCart, address);

        assertEquals(b, a);


    }


    @Test
    public void addgoodstoCustomer_Returnscustomerwithgoodsobject_returnedCustomervaluesarethesameaslocallycreatedcustomer() {
// i det här testet jämför jag en kund med varor tillagda manuellt i varukorgen med en kund som fått sin vara tillagd av min publika metod.
        InputStream inputStream = consolehandlerTest.class.getResourceAsStream("/testcreatecustomer.txt");
        Scanner scanner = new Scanner(inputStream);
        ConsoleHandler ch = new ConsoleHandler(scanner);

        Customer a = Customer.Createcustomer(ch);
        Goods vara = new Goods(5000,"Hemsida");
        a.Addgoodstocustomer(a, vara);

        Name name = new Name("Hej", "Hej");
        Address address = new Address("Hej", 5, "Hej");
        ArrayList<Goods> specificCart = new ArrayList();
        Customer b = new Customer(name, "Hej",specificCart, address);


        Goods varab = new Goods(5000,"Hemsida");
        b.getCart().add(varab);


        assertEquals(b, a);


    }
    /*@Test
    public void CustomerhasuniqueID_ReturnscustomerwithuniqueID_ReturnedcustomerhasIDonemorethanpreviousaddedcustomer() {
// i det här testet jämför jag två kunders ID och se att det ökat med 1 per skapad kund.
        InputStream inputStream = consolehandlerTest.class.getResourceAsStream("/testcreatecustomer.txt");
        Scanner scanner = new Scanner(inputStream);
        ConsoleHandler ch = new ConsoleHandler(scanner);
        Customer a = Customer.Createcustomer(ch);
        Customer b = Customer.Createcustomer(ch);


        assertEquals(a.getCustomerID()+1, b.getCustomerID());
    }*/

    @Test
    public void calculatetotalCartprice_returnstotalcartprice_manuallYcalculatedcartpricesameasmethodcalculatedcartprice(){
        // i det här testet jämför jag manuellt uträknad totalavarukorgspris med varukorgspris uträknat av min publika metod.
        InputStream inputStream = consolehandlerTest.class.getResourceAsStream("/testcreatecustomer.txt");
        Scanner scanner = new Scanner(inputStream);
        ConsoleHandler ch = new ConsoleHandler(scanner);
        Customer a = Customer.Createcustomer(ch);

        Websites b = new Websites(5000,"heluu",  "John","Linder");
        Name name = new Name("John", "Linder");
        Consulting ba = new Consulting(900, "Test","test","test" );
        a.Addgoodstocustomer(a,b);
        a.Addgoodstocustomer(a,ba);

        int methodcreated = Customer.calculateTotalcartprice(a.getCart());
        int locallycreated = b.getPrice()+ba.getPrice();

        assertEquals(methodcreated, locallycreated);

    }
}