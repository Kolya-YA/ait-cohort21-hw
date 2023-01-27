package Homeworks.HW37;

public class Misc {
    static Account[] createAcc(String[][] personData, String[][] accData) {
        Account[] accounts;
        accounts = new Account[accData.length];

        for (int i = 0; i < accounts.length; i++) {
            int personIdx = Integer.parseInt(accData[i][2]);
            accounts[i] = new Account(
                    accData[i][0],
                    Double.parseDouble(accData[i][1]),
                    new Person(
                            personData[personIdx][0],
                            personData[personIdx][1],
                            Integer.parseInt(personData[personIdx][2])
                    )
            );
        }
        return accounts;
    }

    static void printAccounts(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println((i + 1) + ".\t" + accounts[i]);
        }
    }
}
