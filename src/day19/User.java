package day19;

public class User {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phoneNumber;
    private final String password;

    public User(String firstName, String lastName, String email, String phoneNumber, String password) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getEmail() {
        return email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public String getPassword() {
        return password;
    }
}
