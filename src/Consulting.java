import java.io.Serializable;
import java.util.Objects;

public class Consulting extends Goods implements Serializable {

    private String consultantName;
    private String consultantStrenghts;


    public Consulting(int price, String productname, String consultantName, String consultantStrenghts) {
        super(price, productname);
        this.consultantName = consultantName;
        this.consultantStrenghts = consultantStrenghts;
    }

    public String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }

    public String getConsultantStrenghts() {
        return consultantStrenghts;
    }

    public void setConsultantStrenghts(String consultantStrenghts) {
        this.consultantStrenghts = consultantStrenghts;
    }

    @Override
    public String toString() {
        return "Consulting{" +"Produktnamn"+" : " +super.getProductname()+ " "+ "Price:"+ super.getPrice()+ "per timme"+
                "consultantName=" + consultantName +
                ", consultantStrenghts='" + consultantStrenghts + '\''+
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
                 consultantName, consultantStrenghts };

        return result;

    }
}
