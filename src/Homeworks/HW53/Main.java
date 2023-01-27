package Homeworks.HW53;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        final int accQty = 10;  // Number of accounts
        final int trQty = 8;    // Number of transactions

        Account[] accArr = new Account[accQty]; // Accounts generator
        for (int i = 0; i < accArr.length; i++) {
            accArr[i] = new Account(("Account#" + (i + 10)), ("DE44 9876 8765 6543 2244 " + (10 + i)));
        }

        List<Transaction> transactions = new ArrayList<>(); // Transactions generator
        for (int i = 0; i < trQty; i++) {
            int acc1, acc2;
            do {
                acc1 = rnd.nextInt(accQty);
                acc2 = rnd.nextInt(accQty);
            } while (acc1 == acc2);
            Transaction newTr = new Transaction(accArr[acc1], accArr[acc2] , rnd.nextDouble(10000000));
            transactions.add(newTr);
            if (rnd.nextInt(10) < 3) {
                transactions.add(newTr);
            }
        }

        List<Transaction> corTransactions = corrector(transactions); // Main action

        // Result printing
        System.out.println("———===* List of accounts *===———");
        for (Account acc : accArr ) {
            System.out.println(acc);
        }

        System.out.println("———===* Original transactions *===———");
        for (Transaction tr : transactions) {
            System.out.println(tr);
        }

        System.out.println("———===* Corrective transactions *===———");
        for (Transaction tr : corTransactions) {
            System.out.println(tr);
        }

    }

    static List<Transaction> corrector(List<Transaction> inputTr) {
        List<Transaction> corTr = new ArrayList<>();
        for (int i = 0; i < inputTr.size(); i++) {
            boolean isDuplicate = inputTr.lastIndexOf(inputTr.get(i)) != i;
            if (isDuplicate) {
                Transaction curTr = inputTr.get(i);
                corTr.add(new Transaction(curTr.getCredit(), curTr.getDebit(), curTr.getAmount()));
            }
        }
        return corTr;
    }
}
