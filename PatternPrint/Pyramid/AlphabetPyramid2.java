package Pyramid;
/*
 
- - - - A
- - - A B A
- - A B C B A
- A B C D C B A
A B C D E D C B A

 */

import java.util.Scanner;

public class AlphabetPyramid2 {
    public static void alphabetNumPyramid2() {
        System.out.print("Enter the size of Alpha num pyramid: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = n - 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= spaces; j++) {
                System.out.print("-" + " ");
            }
            spaces--;
            for(int k = 1; k <= i; k++) {
                int alpha = k + 64;
                char ch = (char)alpha;
                System.out.print(ch + " ");
            }
            int res = i - 1;
            for(int l = 1; l <= i - 1; l++) {
                int ans = res + 64;
                char ch2 = (char)ans;
                System.out.print(ch2 + " ");
                res--;
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        alphabetNumPyramid2();
    }
}
