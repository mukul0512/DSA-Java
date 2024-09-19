package Recursion;

public class Fibonacci {
    public static void printFibonacci(int secLastTerm, int lastTerm, int nextTerm) {
        if (nextTerm == 0) {
            return;
        }
        int thirdTerm = secLastTerm + lastTerm;
        System.out.print(thirdTerm + " ");
        printFibonacci(lastTerm, thirdTerm, nextTerm - 1);
    }

    public static void main(String args[]) {
        int secLastTerm = 0, lastTerm = 1;
        System.out.print(secLastTerm + " ");
        System.out.print(lastTerm + " ");
        int nextTerm = 7;
        printFibonacci(secLastTerm, lastTerm, nextTerm - 2);
    }
}
