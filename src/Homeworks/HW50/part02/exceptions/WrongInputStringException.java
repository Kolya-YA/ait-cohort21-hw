package Homeworks.HW50.part02.exceptions;

public class WrongInputStringException extends CreateAccountsException {
    public WrongInputStringException() {
        super("Input string is null");
    }
    public WrongInputStringException(int wrongLength) {
        super("Wrong format of input string it contains " + wrongLength + " fields instead of 2.");
    }
}
