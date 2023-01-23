package lesson50.exceptions;

public class wrongNameException extends Exception {
    public wrongNameException(int length) {
        System.out.println("Wrong length of name! Current length: " + length + " symbols.");
        System.out.println("The name should be more than 1 and less than 128 characters in length.");
    }
}
