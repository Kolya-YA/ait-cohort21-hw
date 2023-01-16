package lesson41;

import java.util.ArrayList;
import java.util.List;

public class subSum {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(List.of(10, 2, 3, 5));
        System.out.println("List: "+ intList + " Result: " + checkSubSum(intList));

        intList = new ArrayList<>();
        System.out.println("List: "+ intList + " Result: " + checkSubSum(intList));

        intList = new ArrayList<>(List.of(10, 2, 3, 66));
        System.out.println("List: "+ intList + " Result: " + checkSubSum(intList));
    }

    static boolean checkSubSum(ArrayList<Integer> intList) {
        if (intList.size() < 3) {
            return false;
        }

        for (int i = 2; i < intList.size(); i++) {
            if (intList.get(i) == intList.get(i - 1) + intList.get(i - 2)) {
                return true;
            }
        }

        return false;
    }
}
