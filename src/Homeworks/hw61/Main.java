package Homeworks.hw61;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("HW61");
    }
    static List<Integer> mergeLists(List<List<Integer>> input) {
        int finalSize = 0;
        for (List<Integer> arr : input) {
            finalSize += arr.size();
        }

        List<Integer> output = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>(Collections.nCopies(input.size(), 0));

        for (int i = 0; i < finalSize; i++) {
            List<Integer> valToAdd = new ArrayList<>();
            for (int j = 0; j < input.size(); j++) {
                if (indexes.get(j) + 1 <= input.get(j).size()) {
                    valToAdd.add(input.get(j).get(indexes.get(j)));
                } else {
                    valToAdd.add(Integer.MAX_VALUE);
                }
            }
            Integer minVal = Collections.min(valToAdd);
            int idxOfMin = valToAdd.indexOf(minVal);
            indexes.set(idxOfMin, indexes.get(idxOfMin) + 1);
            output.add(i, minVal);
        }

        return output;
    }
}
