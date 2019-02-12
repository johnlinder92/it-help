import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Name implements Serializable {
    private String förnamn;
    private String efternamn;

    public Name(String förnamn, String efternamn) {
        this.förnamn = förnamn;
        this.efternamn = efternamn;
    }

    public String getFörnamn() {
        return förnamn;
    }

    public void setFörnamn(String förnamn) {
        this.förnamn = förnamn;
    }

    public String getEfternamn() {
        return efternamn;
    }

    public void setEfternamn(String efternamn) {
        this.efternamn = efternamn;
    }

    public static Name Createname(ConsoleHandler ch) {

        //kollar att första värdet på förnamn och efternamn är skrivet med stor bokstav.

        String förnamn = "default";
        String efternamn = "default";
        boolean klar = true;
        while (klar) {
            förnamn = ch.getString("Fyll i ditt förnamn:");

            Character test = förnamn.charAt(0);
            if (test.isLowerCase(test)) {
                System.out.println("Förnamn och efternamn måste börja med stor bokstav. Försök igen");

            } else {
                efternamn = ch.getString("fyll i ditt efternamn");
                Character test2 = efternamn.charAt(0);
                if (test2.isLowerCase(test2)) {
                    System.out.println("Förnamn och efternamn måste börja med stor bokstav. Försök igen");

                } else {

                    break;
                }
            }
        }
        Name name = new Name(förnamn, efternamn);
        return name;



    }







    @Override
    public String toString() {
        return "Name{" +
                "förnamn='" + förnamn + '\'' +
                ", efternamn='" + efternamn + '\'' +
                '}';
    }

    public boolean equals(Object o) {


        if (this == o) return true;
        if (!(o instanceof Name)) return false;
        Name that = (Name)o;
        for(int i = 0; i < this.getSigFields().length; ++i){
            if (!Objects.equals(this.getSigFields()[i], that.getSigFields()[i])){
                return false;
            }
        }
        return true;
    }


    private Object[] getSigFields(){
        Object[] result = {
                förnamn, efternamn };

        return result;
}}
