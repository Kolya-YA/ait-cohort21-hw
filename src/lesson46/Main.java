package lesson46;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> simpleResult = addToArray(new ArrayList<>(), 100000);
        ArrayList<Integer> rndResult = addRndToArray(new ArrayList<>(), 100000);

        printResult(simpleResult, 0, 16);
        printResult(rndResult, 0, 12);
    }

    static ArrayList<Integer> addToArray(ArrayList<Integer> initList, int size) {

        ArrayList<Integer> addList = new ArrayList<>(size);
        for (int i = 0; i < size;  i++) {
            addList.add(i);
        }
        initList.addAll(addList);
        return initList;
    }

    static ArrayList<Integer> addRndToArray(ArrayList<Integer> initList, int size) {
        Random rnd = new Random();
        ArrayList<Integer> sourceList = new ArrayList<>(size);
        ArrayList<Integer> addList = new ArrayList<>(size);

        for (int i = 0; i < size;  i++) {
            sourceList.add(i);
            addList.add(-1);
        }

        System.out.println("Source size " + sourceList.size());
        System.out.println("Add list size " + addList.size());

        for (int i = 0; i < size;  i++) {
            int rndIdx = rnd.nextInt(size - i);
            int rndFromList = sourceList.remove(rndIdx);
            addList.set(rndFromList, i);
        }

        initList.addAll(addList);
        return initList;
    }

    static void printResult(ArrayList<Integer> result, int fromIdx, int toIdx) {
        System.out.println("\nSize of final array: " + result.size());
        for (int i = fromIdx; i < toIdx; i++) {
            System.out.println(result.get(i));
        }
    }
}
