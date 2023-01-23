package lesson50.exceptions;

public class wrongInputStringException extends Exception {
    public wrongInputStringException(int length) {
        System.out.println("Wrong input string!");
        System.out.println("We require 4 parameters, and we got: " + length + ".");
    }
}
