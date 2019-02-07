import java.util.Objects;
import java.util.Scanner;

public class Name {
    private String förnamn;
    private String efternamn;

    public Name(String förnamn, String efternamn) {
        this.förnamn = förnamn;
        this.efternamn = efternamn;
    }

    public static Name Createname(ConsoleHandler ch) {

        Name name = new Name(ch.getString("Fyll i ditt förnamn:"),ch.getString("Fyll i dit efternamn:"));

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
