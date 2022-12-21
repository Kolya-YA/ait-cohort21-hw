package lesson37;

import java.util.Arrays;

public class Utils {
    public static Account[] findAccountByPerson(Account[] accounts, Person person) {
        Account[] resAcc = new Account[accounts.length];
        for (int i = 0; i < resAcc.length; i++) {
            if (accounts[i].getClient().equals(person)) {
                resAcc[i] = accounts[i];
            }
        }

        int resLength = 0;
        for (Account acc : resAcc) {
            if (acc != null) resLength++;
        }

        Account[] finalRes = new Account[resLength];
        for (int i = 0, j = 0; i < resAcc.length; i++) {
            if (resAcc[i] != null) {
                finalRes[j] = resAcc[i];
                j++;
            }
        }

        return finalRes;
    }

    public static String[] findIBANsByUser(Account[] accounts, Person person) {
        Account[] filteredAcc = findAccountByPerson(accounts, person);
        String[] strOfIBANs = new String[filteredAcc.length];
        for (int i = 0; i < filteredAcc.length; i++) {
            strOfIBANs[i] = filteredAcc[i].getIBAN();
        }

        return strOfIBANs;
    }

    public static Account[] copySortedByBalance(Account[] accounts) {
        Account[] copiedAccounts = Arrays.copyOf(accounts, accounts.length);
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < copiedAccounts.length - 1; i++) {
                if (copiedAccounts[i].getBalance() < copiedAccounts[i + 1].getBalance()) {
                    Account tmpAcc = copiedAccounts[i];
                    copiedAccounts[i] = copiedAccounts[i + 1];
                    copiedAccounts[i + 1] = tmpAcc;
                    swapped = true;
                }
            }
        } while (swapped);

        return copiedAccounts;
    }

    public static Account[] copySortedByPersonAge(Account[] accounts) {
        Account[] copiedAccounts = Arrays.copyOf(accounts, accounts.length);
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < copiedAccounts.length - 1; i++) {
                if (copiedAccounts[i].getPersonAge() > copiedAccounts[i + 1].getPersonAge()) {
                    Account tmpAcc = copiedAccounts[i];
                    copiedAccounts[i] = copiedAccounts[i + 1];
                    copiedAccounts[i + 1] = tmpAcc;
                    swapped = true;
                }
            }
        } while (swapped);

        return copiedAccounts;
    }
}
