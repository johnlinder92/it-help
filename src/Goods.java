import java.util.Objects;

public class Goods {

    private String productname;


    public Goods(String productname) {
        this.productname = productname;

    }



    public static Goods Creategoods(ConsoleHandler ch) {

        Goods goods = new Goods(ch.getString("Ange produktnamn:"));
        return goods;
    }
    public static Consulting Createconsulting(ConsoleHandler ch) {

        Consulting consulting = new Consulting(ch.getString("Fyll i produktnamn till konsultarbete"),ch.getInt("Fyll i pris per timma på konsultarbetet:"), Name.Createname(ch), ch.getString("Fyll i konsultens färdigheter:") );

        return consulting;
    }

    public static Websites Createwebsite(ConsoleHandler ch) {

        Websites website = new Websites(ch.getString("Skriv in produktens namn:"), ch.getInt("Ange pris för ett exemplar av denna hemsida:"), ch.getString("Skriv in hemsidans namn:"),ch.getString("Fyll i information om hemsidan:"));

        return website;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "productname='" + productname + '\'' +

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
                productname, };

        return result;

    }


}
