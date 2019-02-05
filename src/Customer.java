

public class Customer {

    private Name name;
    private String email;
    private Address address;

    public Customer(Name name, String email, Address address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Customer Createcustomer() {
        ConsoleHandler consoleHandler= new ConsoleHandler();


        Customer customer = new Customer(name.Createname(),consoleHandler.getString("Skriv in din email:"),address.CreateAddress());

        return customer;
    }
}
