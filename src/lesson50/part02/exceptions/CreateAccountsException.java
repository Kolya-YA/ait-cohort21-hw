package lesson50.part02.exceptions;

public abstract class CreateAccountsException extends RuntimeException {
    public CreateAccountsException(String message) {
        super(message);
    }
}
