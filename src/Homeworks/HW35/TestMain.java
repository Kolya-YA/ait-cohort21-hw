package Homeworks.HW35;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {
    @Test
    void test_lengthOfListOfAccounts() {
        String[][] personData = {
            {"John", "Doe"},
            {"James", "Bond"},
            {"Ronald", "Reagan"},
            {"Luisa", "Ciccone"},
            {"Richard", "Nixon"},
            {"Helen", "Mirren"},
            {"Amadeus", "Mozart"},
            {"Mata", "Hari"},
        };

        String[][] accData = {
            {"DE 1111 3333 2222 3333", "100500", "0"},
            {"DE 2222 3333 2222 3333", "200500", "1"},
            {"DE 3333 3333 2222 3333", "300500", "1"},
            {"DE 4444 3333 2222 3333", "400500", "2"},
            {"DE 5555 3333 2222 3333", "500500", "3"},
            {"DE 6666 3333 2222 3333", "600500", "4"},
            {"DE 7777 3333 2222 3333", "700500", "5"},
            {"DE 8888 3333 2222 3333", "800500", "5"},
            {"DE 9999 3333 2222 3333", "900500", "6"},
            {"DE 0000 3333 2222 3333", "1000500","7"},
        };

        int expectRes = 10;
        int realRes = Misc.createAcc(personData, accData).length;

        Assertions.assertEquals(expectRes, realRes);

    }
}
