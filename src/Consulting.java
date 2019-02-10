import java.util.Objects;

public class Consulting extends Goods {

    private int price;
    private Name consultantName;
    private String consultantStrenghts;


    public Consulting(String productname, int price, Name consultantName, String consultantStrenghts) {
        super(productname);
        this.price = price;
        this.consultantName = consultantName;
        this.consultantStrenghts = consultantStrenghts;
    }

    @Override
    public String toString() {
        return "Consulting{" +
                "consultantName='" + consultantName + '\'' +
                ", consultantStrenghts='" + consultantStrenghts + '\'' +
                ", price=" + price +"Sek/hour"+
                '}';
    }

    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        if (!(o instanceof Consulting)) return false;
        Consulting that = (Consulting)o;
        for(int i =

            0; i < this.getSigFields().length; ++i){
            if (!Objects.equals(this.getSigFields()[i], that.getSigFields()[i])){
                return false;
            }
        }
        return true;
    }


    private Object[] getSigFields(){
        Object[] result = {
                price, consultantName, consultantStrenghts };

        return result;

    }
}
