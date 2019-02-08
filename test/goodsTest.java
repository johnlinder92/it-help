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

        Goods b = new Goods("heluu", "halaa");

        assertEquals(b, a);



    }
}
