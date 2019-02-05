public class Address {

    private String street;
    private int postcode;
    private String city;

    public Address(String street, int postcode, String city) {
        this.street = street;
        this.postcode = postcode;
        this.city = city;
    }
    ConsoleHandler consoleHandler= new ConsoleHandler();

    public Address CreateAddress() {

        Address address = new Address(consoleHandler.getString("Fyll i gatunamn och nummer:"),consoleHandler.getInt("Fyll i postkod:"),consoleHandler.getString("Fyll i ort:"));

        return address;
    }
}
