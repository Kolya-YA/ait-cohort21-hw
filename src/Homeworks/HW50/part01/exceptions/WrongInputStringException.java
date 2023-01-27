package Homeworks.HW50.part01.exceptions;

public class WrongInputStringException extends Exception {
    public WrongInputStringException(int length) {
        System.out.println("Wrong input string!");
        System.out.println("We require 4 parameters, and we got: " + length + ".");
    }
}
