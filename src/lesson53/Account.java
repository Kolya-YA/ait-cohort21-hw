package lesson53;

public class Account {
    private String label;
    private String iban;

    public Account(String label, String iban) {
        this.label = label;
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "Label: " + label + " IBAN: " + iban;
    }
}
