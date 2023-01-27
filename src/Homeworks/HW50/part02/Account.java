package Homeworks.HW50.part02;

import Homeworks.HW50.part02.exceptions.WrongIbanException;
import Homeworks.HW50.part02.exceptions.WrongInputStringException;
import Homeworks.HW50.part02.exceptions.WrongOwnerNameException;

public class Account {
    private final String iban;
    private final String owner;

    @Override
    public String toString() {
        return "{IBAN: " + iban + ", owner: " + owner + '}';
    }

    public Account(String inputStr) {
        String[] inputArr = inputStrParser(inputStr);
        this.iban = ibanValidator(inputArr[0]);
        this.owner = ownerNameValidator(inputArr[1]);
    }

    private static String[] inputStrParser(String inputStr) {
        if (inputStr == null) {
            throw new WrongInputStringException();
        }
        String[] inputArr = inputStr.split(";");
        if (inputArr.length == 2) {
            return inputArr;
        } else {
            throw new WrongInputStringException(inputArr.length);
        }
    }

    private String ibanValidator(String iban) {
        if (iban.matches("^DE[0-9]{13}$")) return iban;
        else throw new WrongIbanException(iban);
    }

    private String ownerNameValidator(String owner) {
        String trimmedOwner = owner.trim();
        if (trimmedOwner.length() > 2) return trimmedOwner;
        else {
            throw new WrongOwnerNameException(owner);
        }
    }
}
