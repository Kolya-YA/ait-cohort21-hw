package Homeworks.HW50.part01.exceptions;

public class WrongNameException extends Exception {
    public WrongNameException(int length) {
        System.out.println("Wrong length of name! Current length: " + length + " symbols.");
        System.out.println("The name should be more than 1 and less than 128 characters in length.");
    }
}
