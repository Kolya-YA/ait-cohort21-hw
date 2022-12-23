package lesson35;

public class Main {

    public static void main(String[] args) {
        Account[] accounts = Misc.createAcc(Data.personData, Data.accData);
        Person onePerson = accounts[2].getClient();

//    Print all accounts
        System.out.println("List of all accounts (" + accounts.length + ")");
        Misc.printAccounts(accounts);

//    Print account for one Person
        System.out.println("\n" + onePerson + "'s list of  accounts");
        Misc.printAccounts(Misc.findAccountByPerson(accounts, onePerson));

//    Print IBANs for one Person
        System.out.println("\n" + onePerson + "'s List of IBANs");
        for (String oneIBAN : Misc.findIBANsByUser(accounts, onePerson)) {
            System.out.println(oneIBAN);
        }
    }
}
