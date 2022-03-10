package Day24;

import java.util.ArrayList;
import java.util.HashMap;

public interface AddressBookDirectoryInterface {

    public void addAddressBook();

    public void operationDirectory();

    public void displayDirectoryContents();

    public void editAddressBook();

    public void searchByCity();

    public void searchByState();

    public void displayPeopleByRegion(HashMap<String, ArrayList<ContactInfo>> listToDisplay);

    public void countPeopleByRegion(HashMap<String, ArrayList<ContactInfo>> listToDisplay);
}
