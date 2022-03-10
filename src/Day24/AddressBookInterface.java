package Day24;

import java.util.List;

public interface AddressBookInterface {

    public void operation();

    public void addContact();

    public void displayContents();

    public void editPerson();

    public void deletePerson();

    public void addPersonToCity(ContactInfo contact);

    public void addPersonToState(ContactInfo contact);

    public void printSortedList(List<ContactInfo> sortedContactList);

    public void sortAddressBook(int sortingChoice);

    public void writeToAddressBookFile();

    public List<String> readDataFromFile();
}