package lesson37;

public class Account {
    private String IBAN;
    private double balance;
    private Person client;

    public Person getClient() {
        return client;
    }

    public Account(String IBAN, double balance, Person client) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.client = client;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public int getPersonAge() {
        return client.getAge();
    }

    @Override
    public String toString() {
        return "Account{" +
                "IBAN='" + IBAN + '\'' +
                ", balance=" + balance +
                ", client=\'" + client +
                "\'}";
    }
}
