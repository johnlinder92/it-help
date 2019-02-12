import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Customer {
    private int CustomerID;
    private static int counter;
    private Name name;
    private String email;
    private Address address;
    private ArrayList<Goods> cart;

    public Customer(int customerID, Name name, String email, Address address, ArrayList<Goods> cart) {
        CustomerID = counter++;
        this.name = name;
        this.email = email;
        this.address = address;
        this.cart = cart;
    }

    public static ArrayList<Goods> CreatecustomerCart(){
        ArrayList<Goods> specificCart = new ArrayList();

        return specificCart;
    }

    public static int calculateTotalcartprice( ArrayList<Goods> customercart){
        int i;
        int total = 0;
        for(i=0;i<customercart.size();i++ ){
            total += customercart.get(i).getPrice();

        }

return total;

    }

    public static Customer Createcustomer(ConsoleHandler ch) {

        Customer customer = new Customer(Customer.getCounter(),Name.Createname(ch), ch.getString("Skriv in din email:"), Address.CreateAddress(ch), CreatecustomerCart());

        return customer;
    }


    public Customer Addgoodstocustomer(Customer customer, Goods goods){
        customer.cart.add(goods);
        return customer;
        }


    @Override
    public String toString() {
        return "Customer{" +
                "CustomerID=" + CustomerID +
                ", name=" + name +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", cart=" + cart +
                '}';
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Customer.counter = counter;
    }

    public ArrayList<Goods> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Goods> cart) {
        this.cart = cart;
    }

    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer that = (Customer)o;
        for(int i = 0; i < this.getSigFields().length; ++i){
            if (!Objects.equals(this.getSigFields()[i], that.getSigFields()[i])){
                return false;
            }
        }
        return true;
    }


        private Object[] getSigFields(){
            Object[] result = {
                    name, email, address, cart };

            return result;

    }
}


