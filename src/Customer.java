import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Customer {

    private Name name;
    private String email;
    private Address address;
    private ArrayList<Goods> cart;

    public Customer(Name name, String email, Address address, ArrayList<Goods> cart) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.cart = cart;
    }

    public static ArrayList<Goods> CreatecustomerCart(){
        ArrayList<Goods> specificCart = new ArrayList();

        return specificCart;
    }


    public static Customer Createcustomer(ConsoleHandler ch) {

        Customer customer = new Customer(Name.Createname(ch), ch.getString("Skriv in din email:"), Address.CreateAddress(ch), CreatecustomerCart());

        return customer;
    }


    public Customer Addgoodstocustomer(Customer customer, Goods goods){
        customer.cart.add(goods);
        return customer;
        }






    @Override
    public String toString() {
        return "Customer{" +
                "name=" + name +
                ", email='" + email + '\'' +
                ", address=" + address +
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
                    name, email, address };

            return result;

    }
}


