package lesson50.part02.exceptions;

public class WrongOwnerNameException extends CreateAccountsException {
    public WrongOwnerNameException(String owner) {
        super("Wrong owner name format. Please check it : \"" + owner + "\"");
    }
}
