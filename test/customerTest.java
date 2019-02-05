import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

 class customerTest {


     @Test
     public void createCustomer_Returnscustomer_customerListincreases(){

            Customerlist customerList = new Customerlist(null);
            Customer customertest = new Customer(null,null,null);

        int start = customerList.acustomerList.size();

        customerList.addCustomer(customertest.Createcustomer());
        
        assertEquals(start + 1, customerList.acustomerList.size());


    }


}
