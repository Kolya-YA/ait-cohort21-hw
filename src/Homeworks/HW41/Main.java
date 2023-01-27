package Homeworks.HW41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(rndList(14, rnd).toString());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(rndSortList(14, rnd).toString());
        }
    }

    static ArrayList rndList(int n, Random rnd) {
        ArrayList<Integer> resultList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int min = i > 0 ? resultList.get(i - 1) : Integer.MIN_VALUE;
            int newRnd = rnd.nextInt(min + 1, Integer.MAX_VALUE - n + i);
            resultList.add(newRnd);
        }
        return resultList;
    }

    static ArrayList rndSortList( int n, Random rnd) {
        ArrayList<Integer> resultList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            resultList.add(rnd.nextInt());
            Collections.sort(resultList);
        }
        return resultList;
    }
}
