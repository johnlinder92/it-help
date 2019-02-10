import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleHandler ch = new ConsoleHandler(scanner);
        ArrayList<Customer> Customerlist= new ArrayList();
        Customerlist.add(Customer.Createcustomer(ch));
        Customerlist.add(Customer.Createcustomer(ch));
        System.out.println(Customerlist);
    }
}
