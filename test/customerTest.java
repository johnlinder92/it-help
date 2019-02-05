import org.junit.Test;

public class customerTest {

    @Test

    void createCustomer_Returnscustomer_customerListincreases(){

        Customer customer= new Customer();

        Customerlist customerList = new Customerlist(null);

        int start = customerList.size();

        customerList.add(customer);

        assertEquals(start + 1, customerList.size());


    }


}
