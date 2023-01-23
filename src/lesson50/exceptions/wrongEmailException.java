package lesson50.exceptions;

public class wrongEmailException extends Exception {
    public wrongEmailException(String email) {
        System.out.println("Length of email is wrong");
    }

    public wrongEmailException(int symbolAtPosition) {
        if (symbolAtPosition == -1) {
            System.out.println("Symbol \"@\" is not exist!");
        } else {
            System.out.println("Symbol \"@\" on wrong place!");
        }
    }
}
