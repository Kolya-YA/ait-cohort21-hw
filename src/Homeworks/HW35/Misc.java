package Homeworks.HW35;

public class Misc {
    static Account[] findAccountByPerson(Account[] accounts, Person person) {
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

    static String[] findIBANsByUser(Account[] accounts, Person person) {
        Account[] filteredAcc = findAccountByPerson(accounts,person);
        String[] strOfIBANs = new String[filteredAcc.length];
        for (int i = 0; i < filteredAcc.length; i++) {
            strOfIBANs[i] = filteredAcc[i].getIBAN();
        }

        return strOfIBANs;
    }

    static Account[] createAcc(String[][] personData, String[][] accData) {
        Account[] accounts;
        accounts = new Account[accData.length];

        for (int i = 0; i < accounts.length; i++) {
            int personIdx = Integer.parseInt(accData[i][2]);
            accounts[i] = new Account(
                    accData[i][0],
                    Double.parseDouble(accData[i][1]),
                    new Person(personData[personIdx][0], personData[personIdx][1]));
        }
        return accounts;
    }

    static void printAccounts(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println((i + 1) + ".\t" + accounts[i]);
        }
    }
}
