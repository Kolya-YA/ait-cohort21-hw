package lesson50.exceptions;

public class wrongAgeException extends Exception {
    public wrongAgeException(int age) {
        if (age < 18 ) System.out.println("User it too young!");
        else System.out.println("User is too old");
    }
}
