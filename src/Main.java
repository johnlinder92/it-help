import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleHandler ch = new ConsoleHandler(scanner);
        ListStorage storage = new ListStorage();

        System.out.println(storage.varulager);
        System.out.println(storage.kundlista);

        storage.addCustomer(Customer.Createcustomer(ch));
        storage.addGoods(Goods.Createwebsite(ch));

        System.out.println(storage.varulager);
        System.out.println(storage.kundlista);

    }
}
