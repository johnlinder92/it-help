import java.util.Objects;

public class Goods {

    private String productname;
    private String price;

    public Goods(String productname, String price) {
        this.productname = productname;
        this.price = price;
    }


    public static Goods Creategoods(ConsoleHandler ch) {

        Goods goods = new Goods(ch.getString("Ange produktnamn:"),ch.getString("ange pris:"));
        return goods;
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
                productname, price };

        return result;

    }


}
