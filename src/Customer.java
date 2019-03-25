import java.io.Serializable;
import java.lang.reflect.Array;
import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.UUID;

public class Customer implements Serializable {

    private UUID CustomerID;
    private Name name;
    private String email;
    private ArrayList<Goods> cart;
    private Address address;

    public Customer(Name name, String email, ArrayList<Goods> cart, Address address) {
        this.CustomerID = CustomerID.randomUUID();
        this.name = name;
        this.email = email;
        this.cart = cart;
        this.address = address;
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

        Customer customer = new Customer(Name.Createname(ch), ch.getString("Skriv in din email:"), CreatecustomerCart(),Address.CreateAddress(ch));

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

    //<editor-fold desc="getters and setters">
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

    public UUID getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(UUID customerID) {
        CustomerID = customerID;
    }

    public ArrayList<Goods> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Goods> cart) {
        this.cart = cart;
    }
    //</editor-fold>

    //<editor-fold desc="equals override">
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
    //</editor-fold>
}


