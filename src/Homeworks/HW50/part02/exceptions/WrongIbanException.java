package Homeworks.HW50.part02.exceptions;

public class WrongIbanException extends CreateAccountsException {
    public WrongIbanException(String iban) {
        super("Wrong IBAN format. Please check it : " + iban);
    }
}
