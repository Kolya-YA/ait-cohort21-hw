package lesson50.part01.exceptions;

public class WrongEmailException extends Exception {
    public WrongEmailException(String email) {
        System.out.println("Length of email is wrong");
    }

    public WrongEmailException(int symbolAtPosition) {
        if (symbolAtPosition == -1) {
            System.out.println("Symbol \"@\" is not exist!");
        } else {
            System.out.println("Symbol \"@\" on wrong place!");
        }
    }
}
