package Homeworks.HW46;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> simpleResult = addToArray(new ArrayList<>(), 100000);
        List<Integer> rndResult = addRndToArray(new ArrayList<>(), 100000);

        printResult(simpleResult, 0, 16);
        printResult(rndResult, 0, 12);
    }

    static List<Integer> addToArray(List<Integer> initList, int size) {

        List<Integer> addList = new ArrayList<>(size);
        for (int i = 0; i < size;  i++) {
            addList.add(i);
        }
        initList.addAll(addList);
        return initList;
    }

    static List<Integer> addRndToArray(List<Integer> initList, int size) {
        Random rnd = new Random();
        List<Integer> sourceList = new ArrayList<>(size);
        List<Integer> addList = new ArrayList<>(size);

        for (int i = 0; i < size;  i++) {
            sourceList.add(i);
            addList.add(null);
        }

        for (int i = 0; i < size;  i++) {
            int rndIdx = rnd.nextInt(size - i);
            int rndFromList = sourceList.remove(rndIdx);
            addList.set(rndFromList, i);
        }

        initList.addAll(addList);
        return initList;
    }

    static void printResult(List<Integer> result, int fromIdx, int toIdx) {
        System.out.println("\nSize of final array: " + result.size());
        System.out.println("List of elements form " + fromIdx + " to " + toIdx);
        System.out.println("—————===***===—————");

        for (int i = fromIdx; i < toIdx; i++) {
            System.out.println(result.get(i));
        }
    }
}
