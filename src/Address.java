import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Address implements Serializable {

    private String street;
    private int postcode;
    private String city;

    public Address(String street, int postcode, String city) {
        this.street = street;
        this.postcode = postcode;
        this.city = city;
    }

    public static Address CreateAddress(ConsoleHandler ch) {


        Address address = new Address(ch.getString("Fyll i gatunamn och nummer:"),ch.getInt("Fyll i postkod:"),ch.getString("Fyll i ort:"));

        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postcode=" + postcode +
                ", city='" + city + '\'' +
                '}';
    }

    public boolean equals(Object o) {


        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address that = (Address)o;
        for(int i = 0; i < this.getSigFields().length; ++i){
            if (!Objects.equals(this.getSigFields()[i], that.getSigFields()[i])){
                return false;
            }
        }
        return true;
    }


    private Object[] getSigFields(){
        Object[] result = {
                street, postcode,city };

        return result;
}}

