import java.util.ArrayList;

public class Customerlist {
    public ArrayList<Customer> acustomerList;

    public Customerlist(ArrayList<Customer> acustomerList) {
        this.acustomerList = acustomerList;
    }

    public void addCustomer(Customer createcustomer) {

        acustomerList.add(createcustomer);


    }
}
