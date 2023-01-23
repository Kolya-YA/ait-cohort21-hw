package lesson50;

import lesson50.exceptions.wrongAgeException;
import lesson50.exceptions.wrongEmailException;
import lesson50.exceptions.wrongInputStringException;
import lesson50.exceptions.wrongNameException;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    @Override
    public String toString() {
        return "Name='" + firstName + ' ' + lastName + '\'' +
               ", age=" + age +
               ", email='" + email + '\'';
    }

    public User(String inputString) throws wrongNameException, wrongAgeException, wrongEmailException, wrongInputStringException {
        String[] inputData = inputDataValidator(inputString.split(";"));

        this.firstName = nameValidator(inputData[0]);
        this.lastName = nameValidator(inputData[1]);;
        this.age = ageValidator(inputData[2]);
        this.email = emailValidator(inputData[3]);
    }

    static String[] inputDataValidator (String[] inputData) throws wrongInputStringException {
        if (inputData.length != 4) {
            throw new wrongInputStringException(inputData.length);
        }
        return inputData;
    }

    static String nameValidator (String name) throws wrongNameException {
        if (name.length() < 1 || name.length() > 128) {
            throw new wrongNameException(name.length());
        }
        return name;
    }

    static int ageValidator (String strAge) throws wrongAgeException {
        int age = -1;

        try {
            age = Integer.parseInt(strAge);
        } catch (NumberFormatException e) {}

        if (age < 18 || age > 150) {
            throw new wrongAgeException(age);
        }
        return age;
    }

    static String emailValidator (String email) throws wrongEmailException {
        if (email.length() < 4 || email.length() > 256) {
            throw new wrongEmailException(email);
        }

        int symbolAtPosition = email.indexOf('@');
        if (symbolAtPosition == -1 || symbolAtPosition == 0 || symbolAtPosition == email.length() - 1) {
            throw new wrongEmailException(symbolAtPosition);
        }
        return email;
    }
}
