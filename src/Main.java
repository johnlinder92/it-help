import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleHandler ch = new ConsoleHandler(scanner);
        ArrayList<Customer> Customerlist= new ArrayList();
        Customerlist.add(Customer.Createcustomer(ch));

        Name name = new Name("John", "Linder");
        Consulting consulting = new Consulting(5000,"Test",name, "Test" );
        Consulting consulting2 = new Consulting(10000,"Test",name, "Test" );

        Customerlist.get(0).Addgoodstocustomer(Customerlist.get(0), consulting );
        Customerlist.get(0).Addgoodstocustomer(Customerlist.get(0), consulting2 );

        System.out.println(Customerlist);


    }
}
