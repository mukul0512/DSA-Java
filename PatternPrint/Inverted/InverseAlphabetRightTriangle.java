package Inverted;
/*

A B C D 
A B C 
A B
A

 */

import java.util.Scanner;

public class InverseAlphabetRightTriangle {
    public static void inverseAlphabetRightTriangle() {
        System.out.print("Enter the size of Inverse triangle: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int res = 1;
            for (int j = 1; j <= n + 1 - i; j++) {
                int alpha = res + 64;
                char ch = (char) alpha;
                System.out.print(ch + " ");
                res++;
            }
            System.out.println();
        }
        sc.close();
    }

    public static void main(String args[]) {
        inverseAlphabetRightTriangle();
    }
}
