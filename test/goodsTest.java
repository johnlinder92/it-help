import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class goodsTest {

    @Test
    public void createGoods_Returnsgoodsobject_goodsobjectvaluessameaslocallycreatedgoodsobject() {
// i det här testet jämför jag en manuellt skapad vara med en vara skapad av min publika metod.
        InputStream inputStream = consolehandlerTest.class.getResourceAsStream("/testcreategoods.txt");
        Scanner scanner = new Scanner(inputStream);
        ConsoleHandler ch = new ConsoleHandler(scanner);
        Goods a = Goods.Creategoods(ch);

        Goods b = new Goods(5000,"heluu");

        assertEquals(b, a);






    }
    @Test
    public void createConsulting_Returnsconsultingobject_consultingsobjectvaluessameaslocallycreatedconsultingobject() {
// i det här testet jämför jag en manuellt skapad vara med en vara skapad av min publika metod.
        InputStream inputStream = consolehandlerTest.class.getResourceAsStream("/testcreategoods.txt");
        Scanner scanner = new Scanner(inputStream);
        ConsoleHandler ch = new ConsoleHandler(scanner);
        Consulting consulting = Goods.Createconsulting(ch);


        Name name = new Name("John", "Linder");

       Consulting b = new Consulting(5000, "heluu", name, "hej");


        assertEquals(b, consulting);

    }
    @Test
    public void createWebsites_Returnswebsitesobject_websiteobjectvaluessameaslocallycreatedwebsiteobject() {
// i det här testet jämför jag en manuellt skapad vara med en vara skapad av min publika metod.
        InputStream inputStream = consolehandlerTest.class.getResourceAsStream("/testcreategoods.txt");
        Scanner scanner = new Scanner(inputStream);
        ConsoleHandler ch = new ConsoleHandler(scanner);
       Websites a = Goods.Createwebsite(ch);

     Websites b = new Websites(5000,"heluu",  "John","Linder");

        assertEquals(b, a);

    }


}
