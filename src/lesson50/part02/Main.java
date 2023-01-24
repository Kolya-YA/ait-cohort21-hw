package lesson50.part02;

import lesson50.part02.exceptions.CreateAccountsException;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] inputAccStrings = {
            "DE1613321892788;Jack Johnson",    // 1. Ok
            "DE1234567890123; ",               // 2. no (empty) name
            "DE1613324427567;   W    ",        // 3. Short name
            "DE161332442—Ignatius Pupkine",    // 4. wrong in string format
            "DE161332442;Vasilus Pupkine",     // 5. iban too short
            "DE1612324427565;Ann Smith",       // 6.
            "AT1234567890123;   Adam Smith ",      // 7. wrong iban format (no DE at start)
            null                               // 8. null
        };

        List<Account> accounts = new ArrayList<>();

        for (int i = 0; i < inputAccStrings.length; i++) {
            try {
                accounts.add(new Account(inputAccStrings[i]));
            } catch (CreateAccountsException e) {
                System.err.println("Error at line#" + (i + 1) + " — " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Some unknown exception");
                e.printStackTrace();
            }
        }

        System.out.println(accounts);
        System.out.println("Total created accounts: " + accounts.size());
    }
}
