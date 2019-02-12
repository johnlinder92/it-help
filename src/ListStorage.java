import java.io.*;
import java.util.ArrayList;

    public class ListStorage implements Serializable{


        ArrayList<Customer> kundlista = new ArrayList();
        ArrayList<Goods> varulager = new ArrayList();

        ListStorage(){
            //Läs in sparade kunder från fil
            loadFromFile();
        }

        public Customer findFirstCustomer(String name){
            for (Customer c : kundlista ) {
                if( c.getName().getFörnamn().equals(name))
                    return c;
            }
            ArrayList<Goods> nocart= new ArrayList();
            return new Customer(new Name("ingen", "alls"),"ingenemail",nocart,new Address("ingengata", 00000, "ingenstad"));
        }

        public void addCustomer(Customer customer){
            kundlista.add(customer);
            //saveToFile();
        }
        public void addGoods(Goods goods){
           varulager.add(goods);
            //saveToFile();
        }

        public void close(){
            saveToFile();
        }

       private void loadFromFile() {
            String path = System.getProperty("user.home")
                    + File.separator + "IdeaProjects"
                    + File.separator + "it-help"
                    + File.separator + "resources"
                    + File.separator + "customersandgoods.bin";
            File file = new File(path);

            //Load from file, run this code first in your program on start.
            try (ObjectInputStream in =
                         new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
                kundlista = (ArrayList<Customer>) in.readObject();
                varulager = (ArrayList<Goods>) in.readObject();

            } catch (FileNotFoundException e) {
                //On first start you will end up here. No file available.
            } catch (IOException e) {

            } catch (ClassNotFoundException e) {

            }
        }

        private void saveToFile() {
            String path = System.getProperty("user.home")
                    + File.separator + "IdeaProjects"
                    + File.separator + "it-help"
                    + File.separator + "resources"
                    + File.separator + "customersandgoods.bin";
            File file = new File(path);

            //Save object to file, run before closing the program
            try (ObjectOutputStream out =
                         new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
                out.writeObject(kundlista);
                out.writeObject(varulager);



            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }




