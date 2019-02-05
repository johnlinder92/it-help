import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleHandler {
    Scanner scanner = new Scanner(System.in);


    public int getInt(String s) {
        System.out.println(s);
        int tal = 0;


        try {

            tal = Integer.parseInt(scanner.nextLine());

        } catch (InputMismatchException e) {

            System.out.println("Felaktig inmatning!");

        }

        return tal;

    }

    public String getString(String s) {
        System.out.println(s);
        String text = "";

        try {
            text = scanner.nextLine();

        } catch (InputMismatchException e) {

            System.out.println("Felaktig inmatning!");

        }
        return text;

    }


}
