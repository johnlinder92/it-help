import java.io.Serializable;
import java.util.Objects;

public class Goods implements Serializable {
    private int price;
    private String productname;


    public Goods(int price, String productname) {
        this.price = price;
        this.productname = productname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public static Goods Creategoods(ConsoleHandler ch) {

        Goods goods = new Goods(ch.getInt("Fyll i produktens pris"), ch.getString("Ange produktnamn:"));
        return goods;
    }
    public static Consulting Createconsulting(ConsoleHandler ch) {

        Consulting consulting = new Consulting(ch.getInt("Fyll i priset per timma på konsultarbetet:"),ch.getString("Fyll i produktens namn:"), Name.Createname(ch), ch.getString("Fyll i konsultens styrkor:"));

        return consulting;
    }

    public static Websites Createwebsite(ConsoleHandler ch) {

        Websites website = new Websites( ch.getInt("Ange pris för ett exemplar av denna hemsida:"), ch.getString("Skriv in produktens namn:"), ch.getString("Skriv in hemsidans namn:"),ch.getString("Fyll i information om hemsidan:"));

        return website;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                ", productname='" + productname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        if (!(o instanceof Goods)) return false;
        Goods that = (Goods)o;
        for(int i = 0; i < this.getSigFields().length; ++i){
            if (!Objects.equals(this.getSigFields()[i], that.getSigFields()[i])){
                return false;
            }
        }
        return true;
    }


    private Object[] getSigFields(){
        Object[] result = {
                price, productname, };

        return result;

    }


}
