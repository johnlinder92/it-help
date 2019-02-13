public interface Storage{

    void addCustomer(Customer customer);

    Customer findFirstCustomer(String name);

    void close();
}