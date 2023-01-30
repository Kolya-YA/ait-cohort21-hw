package Homeworks.HW56;

public class Fibonacci {
    static int[] getByLoop(int n) {
        int[] fibSeq = new int[n + 1];

        fibSeq[0] = 0;
        if (n < 1) return fibSeq;

        fibSeq[1] = 1;
        if (n < 2) return fibSeq;

        for (int i = 2; i <= n; i++) {
            fibSeq[i] = fibSeq[i - 1] + fibSeq[i - 2];
//            System.out.println("i: " + i + ' ' + fibSeq[i]);
        }

        return fibSeq;
    }

    static int[] getByRecursion(int n) {
        int[] fibArr = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            fibArr[i] = fibCalc(i);
        }
        return fibArr;
    }

    private static int fibCalc(int n) {
        if (n < 2) return n;
        return fibCalc(n - 1) + fibCalc( n - 2);
    }
}
