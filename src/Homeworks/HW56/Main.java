package Homeworks.HW56;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci");

        printIntArr(Fibonacci.getByLoop(10));
        printIntArr(Fibonacci.getByRecursion(10));
    }

    static void printIntArr(int[] intArr) {
        System.out.println("\n———===*** Array with " + (intArr.length) + " elements ***===————");
        printIntArr(intArr, 0);
    }

    static void printIntArr(int[] intArr, int index) {
        if (intArr.length == index) return;
        System.out.print(intArr[index] + ", ");
        printIntArr(intArr, index + 1);
    }
}
