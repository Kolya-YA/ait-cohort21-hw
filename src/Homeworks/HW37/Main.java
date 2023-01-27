package Homeworks.HW37;

public class Main {

    public static void main(String[] args) {
        Account[] accounts = Misc.createAcc(Data.personData, Data.accData);
        Person onePerson = accounts[2].getClient();

//    Print all accounts
        System.out.println("List of all accounts (" + accounts.length + ")");
        Misc.printAccounts(accounts);

//    Print account for one Person
        System.out.println("\n" + onePerson + "'s list of  accounts");
        Misc.printAccounts(Utils.findAccountByPerson(accounts, onePerson));

//    Print IBANs for one Person
        System.out.println("\n" + onePerson + "'s List of IBANs");
        for (String oneIBAN: Utils.findIBANsByUser(accounts, onePerson)) {
            System.out.println(oneIBAN);
        }

//    Print sorted by balance accounts (decrease)
        System.out.println("\nList of all sorted by balance accounts (" + accounts.length + ')' + " (decrease)");
        Misc.printAccounts(Utils.copySortedByBalance(accounts));

//    Print sorted by client age accounts (increase)
        System.out.println("\nList of all sorted by client age accounts (" + accounts.length + ')' + "  (increase)");
        Misc.printAccounts(Utils.copySortedByPersonAge(accounts));
    }
}
