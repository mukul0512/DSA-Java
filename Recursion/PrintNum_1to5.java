package Recursion;

public class PrintNum_1to5 {
    public static void printNum(int n) {
        if(n == 6) {
            return;
        }
        System.out.print(n + " ");
        printNum(n + 1);
    }
    public static void main(String args[]) {
        int n = 1;
        printNum(n);
    }
}
