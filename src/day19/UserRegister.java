package day19;


import java.util.PriorityQueue;
import java.util.regex.Pattern;

public class UserRegister {
    private static final String FIRST_NAME = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    private static final String PHONE_NUMBER ="^[0-9]{2}[0-9]{10}";
    private static final String PASSWORD = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";
    static boolean isFirstNameValid, isLastNameValid, isMailValid, isNumberValid, isPasswordValid;

    public boolean validateFirstName(String firstName) {
        isFirstNameValid = Pattern.matches(FIRST_NAME, firstName);
        if (!isFirstNameValid) {
            System.out.println("First Name is invalid...Please enter proper first name");
            System.exit(0);
        }
        return Pattern.matches(FIRST_NAME, firstName);
    }

    public boolean validateLastName(String lastName) {
        isLastNameValid = Pattern.matches(LAST_NAME, lastName);
        if (!isLastNameValid) {
            System.out.println("Last Name is invalid...Please enter proper last name");
            System.exit(0);
        }
        return Pattern.matches(LAST_NAME, lastName);
    }

    public boolean validateEmail(String mail) {
        isMailValid = Pattern.matches(EMAIL, mail);
        if (!isMailValid) {
            System.out.println("E-mail is invalid...Please enter e-mail");
            System.exit(0);
        }
        return Pattern.matches(EMAIL, mail);
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        isNumberValid = Pattern.matches(PHONE_NUMBER, phoneNumber);
        if (!isNumberValid) {
            System.out.println("Phone Number is invalid...Please enter proper phone-number");
            System.exit(0);
        }
        return Pattern.matches(PHONE_NUMBER, phoneNumber);
    }

    public boolean validatePassword(String password) {
        isPasswordValid = Pattern.matches(PASSWORD, password);
        if (!isPasswordValid) {
            System.out.println("Password is invalid...Please enter proper password");
            System.exit(0);
        }
        return Pattern.matches(PASSWORD, password);
    }

    public void register() {
        if (isFirstNameValid && isLastNameValid && isMailValid && isNumberValid & isPasswordValid) {
            System.out.println("You are registered!!!");
            System.out.println("Welcome");
        }
    }
}

