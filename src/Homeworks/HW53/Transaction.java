package Homeworks.HW53;

public class Transaction {
    private static long idCounter = 1000;
    private long id;
    private Account debit;
    private Account credit;
    private double amount;

    public Transaction(Account debit, Account credit, double amount) {
        this.debit = debit;
        this.credit = credit;
        this.amount = amount;
        this.id = ++idCounter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return false;
    }

    public Account getDebit() {
        return debit;
    }

    public Account getCredit() {
        return credit;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", debit=" + debit +
                ", credit=" + credit +
                ", amount=" + amount +
                '}';
    }
}
