/*

A
A B
A B C
A B C D

 */

import java.util.Scanner;

public class AlphabetRightTriangle {
    public static void alphabetRightTriangle() {
        System.out.print("Enter the size of alphabet triangle: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int res = 1;
            for (int j = 1; j <= i; j++) {
                int alpha = res + 64;
                char ch = (char) alpha;
                System.out.print(ch + " ");
                res++;
            }
            System.out.println();
        }
        sc.close();
    }

    public static void main(String[] args) {
        alphabetRightTriangle();
    }
}
