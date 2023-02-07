package Homeworks.hw61;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MainTest {
    List<Integer> l1 = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // size = 11
    List<Integer> l2 = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12); // size = 13
    List<Integer> l3 = List.of(0, 1, 2, 3, 4, 5, 6); // size = 7
    List<Integer> l4 = List.of(-4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14); // 19
    //Total size = 50
    List<Integer> l5 = List.of(-2, 0, 2, 4, 6);
    List<Integer> l6 = List.of(Integer.MIN_VALUE, Integer.MAX_VALUE);
    List<Integer> l7 = List.of();

    @Test
    void testSizeOfMergeList() {
        List<List<Integer>> input = List.of(l1, l2, l3, l4);
        List<Integer> result = Main.mergeLists(input);
        Assertions.assertEquals(50, result.size());
    }

    @Test
    void testContentOfMergeList() {
        List<Integer> expect = List.of(Integer.MIN_VALUE, -2, 0, 0, 1, 2, 2, 3, 4, 4, 5, 6, 6, Integer.MAX_VALUE);
        List<List<Integer>> input = List.of(l3, l5, l6, l7);
        List<Integer> result = Main.mergeLists(input);
        Assertions.assertEquals(expect, result);
    }

}