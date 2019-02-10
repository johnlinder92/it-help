import java.util.Objects;

public class Websites extends Goods {

    private int price;
    private String websiteName;
    private String websitedescription;

    public Websites(String productname, int price, String websiteName, String websitedescription) {
        super(productname);
        this.price = price;
        this.websiteName = websiteName;
        this.websitedescription = websitedescription;
    }

    @Override
    public String toString() {
        return "Websites{" +
                "price=" + price + "sek/website"+
                ", websiteName='" + websiteName + '\'' +
                ", websitedescription='" + websitedescription + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        if (!(o instanceof Websites)) return false;
        Websites that = (Websites)o;
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
                price, websiteName, websitedescription };

        return result;

    }
}