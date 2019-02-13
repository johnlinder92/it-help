import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleHandler ch = new ConsoleHandler(scanner);
        ListStorage storage = new ListStorage();


            boolean backup = true;
        while (backup) {
            backup = false;
            int val = ch.getInt("Skriv in 1 för att lägga till varor i varuregistret,\n" + "2 för att skapa en ny kund, 3 för att lägga till vara till en kund, 4 för " +
                    "att skriva ut alla befintliga kunder, 5 för att skriva ut varulagret, \n" + "6 för att skriva ut en specifik kund, 7 för att avsluta och spara ner kunder och varor, 8 för att avsluta utan att spara");


            switch (val) {
                case 0: backup=true; break;
                case 1:
                    int val2 = ch.getInt("Skriv in 1 för att lägga till konsultarbete, skriv in 2 för att lägga till hemsida");
                    switch (val2) {
                        case 0:backup=true; break;
                        case 1:
                           storage.addGoods(Goods.Createconsulting(ch));
                            System.out.println("Vara tillagd!");
                           backup=true;
                           break;

                        case 2:
                           storage.addGoods(Goods.Createwebsite(ch));
                            System.out.println("Vara tillagd!");
                            backup=true;

                    }
                    break;
                case 2:
                    storage.addCustomer(Customer.Createcustomer(ch));
                    System.out.println("Kund tillagd!");
                    backup=true;
                    break;
                case 3:
                    System.out.println(storage.kundlista);
                    String idx = ch.getString("Skriv in förnamnet på den kund du vill lägga till varor till:");
                    System.out.println(storage.varulager);
                    String idv = ch.getString("Skriv in produktnamnet på den vara du vill lägga till:");

                    for (int i = 0; i < storage.kundlista.size(); i++) {

                        if (storage.kundlista.get(i).getName().getFörnamn().equals(idx)) {

                            for (int r = 0; r < storage.varulager.size(); r++) {

                                if (storage.varulager.get(r).getProductname().equals(idv)) {

                                    storage.kundlista.get(i).Addgoodstocustomer(storage.kundlista.get(i), storage.varulager.get(r));
                                    System.out.println("Vara:" + storage.varulager.get(r) + " tillagd till kund: " + storage.kundlista.get(i));
                                    backup = true;


                                }

                            }
                        }
break;
                    }
                case 4: System.out.println(storage.kundlista);
                backup=true;
                break;

                case 5: System.out.println(storage.varulager);
                backup=true;
                break;

                case 6:
                    System.out.println(storage.kundlista);
                    Customer local = storage.findFirstCustomer(ch.getString("Skriv in förnamnet på den Kund du önskar skriva ut"));
                    int localint= Customer.calculateTotalcartprice(local.getCart());
                    System.out.println(local);
                    System.out.print("Varukorgens totala kostnad:");
                    System.out.print(localint);
                    backup=true;
                    break;
                case 7:
                    System.out.println("Sparat i databasen");
                    storage.close();
                    break;
                case 8: break;
                default:
                    System.out.println("fel val, försök igen");
                    backup = true;
                    break;

            }
        }
    }
}


