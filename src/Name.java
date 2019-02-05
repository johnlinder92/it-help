public class Name {
    private String förnamn;
    private String efternamn;

    public Name(String förnamn, String efternamn) {
        this.förnamn = förnamn;
        this.efternamn = efternamn;
    }
    ConsoleHandler consoleHandler= new ConsoleHandler();
    public Name Createname() {

        Name name = new Name(consoleHandler.getString("Fyll i ditt förnamn:"),consoleHandler.getString("Fyll i dit efternamn:"));

        return name;
    }
}
