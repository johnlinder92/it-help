import java.io.Serializable;
import java.util.Objects;

public class Websites extends Goods implements Serializable {


    private String websiteName;
    private String websitedescription;


    public Websites(int price, String productname, String websiteName, String websitedescription) {
        super(price, productname);
        this.websiteName = websiteName;
        this.websitedescription = websitedescription;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public String getWebsitedescription() {
        return websitedescription;
    }

    public void setWebsitedescription(String websitedescription) {
        this.websitedescription = websitedescription;
    }

    @Override
    public String toString() {
        return "Websites{" +"Produktnamn" +super.getProductname()+ "Price:"+ super.getPrice()+ "per hemsida"+
                "websiteName='" + websiteName + '\'' +
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
                 websiteName, websitedescription };

        return result;

    }
}