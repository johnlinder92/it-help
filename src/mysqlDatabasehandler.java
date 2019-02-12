import java.sql.*;
import java.util.ArrayList;


public class mysqlDatabasehandler implements Storage {



    String path = "jdbc:mysql://35.189.87.92:3306/ithelpdatabase";

    mysqlDatabasehandler() {
        try {

            Connection sqliteConnection = DriverManager.getConnection(path,"root", "qaPAgTcP5q" );

            //Skapa tabell för Customers om den inte finns
            String sql_create_tabel = "CREATE TABLE IF NOT EXISTS Customers(" +
                    "ID integer PRIMARY KEY," +
                    "Name String );";

            Statement stmt = sqliteConnection.createStatement();
            stmt.execute(sql_create_tabel);
            stmt.close();
            sqliteConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {

        }
    }
    public void addCustomer(Customer customer) {
        try {

            Connection sqliteConnection = DriverManager.getConnection(path,"root", "qaPAgTcP5q");

            //Lägg till en kund i tabellen Customers
            String sql_insert_customer = "INSERT INTO Customers(Name)" +
                    " VALUES('"+ customer.getName() +  "');";


            Statement stmt = sqliteConnection.createStatement();
            stmt.execute(sql_insert_customer);
            stmt.close();
            sqliteConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close(){

    }

    public Customer findFirstCustomer(String name) {
        Name name1 = new Name("Noone", "Noone");
        Address daddress = new Address("Defaultstreet", 18160,"Defaultcity");
        ArrayList<Goods> listan = new ArrayList();
        Customer customer = new Customer(-1, name1, "Defaultemail",daddress, listan);

        try {

            Connection sqliteConnection = DriverManager.getConnection(path,"root", "qaPAgTcP5q");

            //Hämta alla kunder med matchande namn
            String sql_select_customer = "SELECT * FROM Customers WHERE NAME ='"+name+"'";

            Statement stmt = sqliteConnection.createStatement();

            ResultSet rs = stmt.executeQuery(sql_select_customer);


            if (rs.next()) {
                Name name4 = new Name(rs.getString("firstname"),rs.getString("lastname"));
                Address address2 = new Address(rs.getString("street"), rs.getInt("postcode"),rs.getString("city"));
                ArrayList<Goods> lista = new ArrayList();
                customer = new Customer(rs.getInt("customerID"),name4, rs.getString("email"),address2, lista);
            }
            rs.close();
            stmt.close();
            sqliteConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customer;
    }
}


