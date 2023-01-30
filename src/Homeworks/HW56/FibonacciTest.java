package Homeworks.HW56;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciTest {
    @Test
    void nthFibonacciByLoop() {
        Assertions.assertArrayEquals(new int[] { 0 }, Fibonacci.getByLoop(0));
        Assertions.assertArrayEquals(new int[] { 0, 1 }, Fibonacci.getByLoop(1));
        Assertions.assertArrayEquals(new int[] { 0, 1, 1 }, Fibonacci.getByLoop(2));
        Assertions.assertArrayEquals(new int[] { 0, 1, 1, 2 }, Fibonacci.getByLoop(3));
        Assertions.assertArrayEquals(new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 }, Fibonacci.getByLoop(10));
        Assertions.assertArrayEquals(new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 }, Fibonacci.getByLoop(12));
        int[] fib40 = Fibonacci.getByLoop(40);
        Assertions.assertEquals(102334155, fib40[fib40.length - 1]);
    }

    @Test
    void nthFibonacciByRecursion() {
        Assertions.assertArrayEquals(new int[] { 0 }, Fibonacci.getByRecursion(0));
        Assertions.assertArrayEquals(new int[] { 0, 1 }, Fibonacci.getByRecursion(1));
        Assertions.assertArrayEquals(new int[] { 0, 1, 1 }, Fibonacci.getByRecursion(2));
        Assertions.assertArrayEquals(new int[] { 0, 1, 1, 2 }, Fibonacci.getByRecursion(3));
        Assertions.assertArrayEquals(new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 }, Fibonacci.getByRecursion(10));
        Assertions.assertArrayEquals(new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 }, Fibonacci.getByRecursion(12));
        int[] fib40 = Fibonacci.getByRecursion(40);
        Assertions.assertEquals(102334155, fib40[fib40.length - 1]);
    }
}