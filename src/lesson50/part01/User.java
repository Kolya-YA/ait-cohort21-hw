package lesson50.part01;

import lesson50.part01.exceptions.WrongAgeException;
import lesson50.part01.exceptions.WrongEmailException;
import lesson50.part01.exceptions.WrongInputStringException;
import lesson50.part01.exceptions.WrongNameException;

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

    public User(String inputString) throws WrongNameException, WrongAgeException, WrongEmailException, WrongInputStringException {
        String[] inputData = inputDataValidator(inputString.split(";"));

        this.firstName = nameValidator(inputData[0]);
        this.lastName = nameValidator(inputData[1]);;
        this.age = ageValidator(inputData[2]);
        this.email = emailValidator(inputData[3]);
    }

    static String[] inputDataValidator (String[] inputData) throws WrongInputStringException {
        if (inputData.length != 4) {
            throw new WrongInputStringException(inputData.length);
        }
        return inputData;
    }

    static String nameValidator (String name) throws WrongNameException {
        if (name.length() < 1 || name.length() > 128) {
            throw new WrongNameException(name.length());
        }
        return name;
    }

    static int ageValidator (String strAge) throws WrongAgeException {
        int age = -1;

        try {
            age = Integer.parseInt(strAge);
        } catch (NumberFormatException e) {}

        if (age < 18 || age > 150) {
            throw new WrongAgeException(age);
        }
        return age;
    }

    static String emailValidator (String email) throws WrongEmailException {
        if (email.length() < 4 || email.length() > 256) {
            throw new WrongEmailException(email);
        }

        int symbolAtPosition = email.indexOf('@');
        if (symbolAtPosition == -1 || symbolAtPosition == 0 || symbolAtPosition == email.length() - 1) {
            throw new WrongEmailException(symbolAtPosition);
        }
        return email;
    }
}
