package Day22;

import java.util.*;

public class AddressBookMain {
    private Map<String, Map> address_book_system = new HashMap<>();

    public Map<Integer, String[]> createContacts(){
        Map<Integer, String[]> map_address_book= new HashMap<>();
        return map_address_book;
    }

    public Map<Integer, String[]> addContact(Map<Integer, String[]> map_address_book){
        String[] contact = enterContactDetails();

        Set<Integer> keys = map_address_book.keySet();
        int max_key = -1;

        for (int key:keys){
            if (max_key<key){
                max_key = key;
            }
        }
        int new_key = max_key +1;

        map_address_book.put(new_key,contact);
        return map_address_book;
    }
    public String[] enterContactDetails(){
        System.out.println("Enter the first name: ");
        Scanner sc1 = new Scanner(System.in);
        String first_name = sc1.next();

        System.out.println("Enter the last name: ");
        Scanner sc2 = new Scanner(System.in);
        String last_name = sc2.next();

        System.out.println("Enter the address: ");
        Scanner sc3 = new Scanner(System.in);
        String address = sc3.next();

        System.out.println("Enter the city name: ");
        Scanner sc4 = new Scanner(System.in);
        String city = sc4.next();

        System.out.println("Enter the state's name: ");
        Scanner sc5 = new Scanner(System.in);
        String state = sc5.next();

        System.out.println("Enter the zip: ");
        Scanner sc6 = new Scanner(System.in);
        String zip = sc6.next();

        System.out.println("Enter the phone number: ");
        Scanner sc7 = new Scanner(System.in);
        String phone_num = sc7.next();

        System.out.println("Enter the email ID: ");
        Scanner sc8 = new Scanner(System.in);
        String email = sc8.next();

        String[] contact = new String[]{first_name,last_name,address,city,state,zip,phone_num,email};
        return contact;
    }

    public void editExistingContact(Map<Integer, String[]> map_address_book){
        System.out.println("Enter the name of the person whose details you "
                + "want to be changed");
        Scanner sc = new Scanner(System.in);
        String search_pers = sc.next();
        int key = searchExistingContact(search_pers, map_address_book);
        System.out.println("Found the name at key "+ key+ " Kindly enter new details ");

        String[] contact = enterContactDetails();

        map_address_book.replace(key,contact);


        String [] cntct1 = map_address_book.get(key);
        for (String s:cntct1){
            System.out.println(s);
        }
    }

    public Integer searchExistingContact(String search_pers, Map<Integer, String[]> map_address_book){
        int key = -1;
        for (Integer i: map_address_book.keySet()){

            if (map_address_book.get(i)[0].equals(search_pers)){

                key = i;
                break;
            }
        }
        return key;
    }

    public void deleteExistingContact(Map<Integer, String[]> map_address_book){
        System.out.println("Enter the name of the person whose details you "
                + "want to delete");
        Scanner sc = new Scanner(System.in);
        String search_pers = sc.next();

        int key = searchExistingContact(search_pers, map_address_book);

        if (map_address_book.remove(key,map_address_book.get(key))){
            System.out.println("Deleted successfully.");
        } else{
            System.out.println("Given contact not deleted.");
        }
    }


    public Map<Integer, String[]> addMultiplePerson(Map<Integer, String[]> map_address_book){
        System.out.println("Enter the number of persons whose details you want "
                + "to add to the address book");
        Scanner sc = new Scanner(System.in);
        int no_of_person = sc.nextInt();

        Map<Integer, String[]> address_book = new HashMap<>();
        for (int i=1;i<=no_of_person;i++){

            addContact(map_address_book);
        }
        return map_address_book;
    }

    public void addAddressBook() {
        System.out.println("Enter the number of address books you want to add to the address book system.");
        Scanner sc1 = new Scanner(System.in);
        int no_of_addr_books = sc1.nextInt();
        for (int i=0;i<no_of_addr_books;i++){
            System.out.println("Add the name of the new address book: ");
            Scanner sc = new Scanner(System.in);
            String addr_book_name = sc.next();


            Map<Integer, String[]> map_address_book = createContacts();
            addMultiplePerson(map_address_book);

            address_book_system.put(addr_book_name,map_address_book);
        }

        Set<String> addr_set = address_book_system.keySet();
        System.out.println("address_book_system length: "+address_book_system.size());
        for (String a:addr_set){
            Map<Integer,String[]> my_addr_book = address_book_system.get(a);
            System.out.println("address_book length: "+ my_addr_book.size());
            Set<Integer> contct_set = my_addr_book.keySet();

            for (int b:contct_set){
                String[] str_contact = my_addr_book.get(b);

                for (String element:str_contact){
                    System.out.print(element + " ");
                }
            }
        }
    }

    public void preventDuplicateEntry(Map<Integer, String[]> map_address_book){
        String [] contact = enterContactDetails();

        if (searchExistingContact(contact[0], map_address_book) == -1){
            System.out.println("The name "+ contact[0] +" doesn't exist in the address book. " +
                    "So it is added to the address book.");
            createContacts();
        }else if (searchExistingContact(contact[0], map_address_book) != -1){
            System.out.println("The name "+ contact[0]+" is already present in the address book. So it cannot be added again!");
        }
    }

    public void searchPersonAcrossAddressBooks(){
        System.out.println("Enter the name of the person whom you want to search: ");
        Scanner sc = new Scanner(System.in);
        String person_name = sc.next();

        System.out.println("Enter the name of the city in which you want to search for the person: ");
        Scanner sc1 = new Scanner(System.in);
        String city_name = sc.next();

        int  contct_key = -1;
        String addr_book_name = "";
        Set<String> addr_set = address_book_system.keySet();

        for (String a:addr_set) {
            Map<Integer, String[]> my_addr_book = address_book_system.get(a);
            for (Integer i : my_addr_book.keySet()) {


                if (my_addr_book.get(i)[3].equals(city_name)) {


                    if (my_addr_book.get(i)[0].equals(person_name)) {
                        contct_key = i;
                        addr_book_name = a;
                        break;
                    }
                }
            }
        }
        if ((addr_book_name.equals("")) && (contct_key==-1)){
            System.out.println("The person named "+person_name+ "has not been found in "+ city_name+
                    " in any address book");
        }else {
            System.out.println("The person named " + person_name + " has been found in " + city_name + "" +
                    " in address book " + addr_book_name + " with key of contact: " + contct_key);
        }
    }

    public void viewPersonsByCityOrState(){
        Map<String, ArrayList<String>> city_state_person_dict = new HashMap<>();


        for (int j=3;j<5;j++){
            city_state_person_dict = storePersonsByCityOrState(j);


            Set <String> city_state_names = city_state_person_dict.keySet();

            for (String city_stat_name: city_state_names){
                System.out.println("The persons present in "+ city_stat_name + " are: ");
                ArrayList<String> person_names = city_state_person_dict.get(city_stat_name);

                for (int i=0;i<person_names.size();i++){
                    System.out.print(person_names.get(i)+ " ");
                }
                System.out.println(" ");
            }
        }
    }


    public Map<String, ArrayList<String>> storePersonsByCityOrState(int indexCityOrState) {


        Map<String, ArrayList<String>> city_state_person_dict = new HashMap<>();
        Set<String> addr_set = address_book_system.keySet();


        for (String a : addr_set) {
            Map<Integer, String[]> my_addr_book = address_book_system.get(a);


            for (Integer i : my_addr_book.keySet()) {
                String city_name = my_addr_book.get(i)[indexCityOrState];
                String person_name = my_addr_book.get(i)[0];
                ArrayList<String> pers_name_arr = new ArrayList<>();


                if (city_state_person_dict.get(city_name) == null){
                    pers_name_arr.add(person_name);
                    city_state_person_dict.put(city_name,pers_name_arr);
                }

                else{
                    pers_name_arr = city_state_person_dict.get(city_name);
                    pers_name_arr.add(person_name);
                    city_state_person_dict.replace(city_name,city_state_person_dict.get(city_name),pers_name_arr);
                }
            }
        }
        return city_state_person_dict;
    }

    public void getNumOfPersons(){

        Map<String, ArrayList<String>> city_state_person_dict = new HashMap<>();


        for (int j =4;j>2;j--) {
            city_state_person_dict = storePersonsByCityOrState(j);


            Set<String> city_state_names = city_state_person_dict.keySet();

            for (String city_stat_name : city_state_names) {
                int contact_persons = city_state_person_dict.get(city_stat_name).size();
                System.out.println("The number of contact persons in " + city_stat_name + " are: "+ contact_persons);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");
        AddressBookMain abm = new AddressBookMain();
        Map<Integer, String[]> map_address_book= abm.createContacts();

        abm.addAddressBook();

        abm.getNumOfPersons();
    }
}