/*

1
A B
1 2 3
A B C D
1 2 3 4 5

 */

import java.util.Scanner;

public class AlphabetNumTriangle {
    public static void alphabetNumTriangle() {
        System.out.print("Enter the size of triangle: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) { // run for odd number of line
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            } else { // run for even number of line
                int res = 1;
                for (int k = 1; k <= i; k++) {
                    int alpha = res + 64;
                    char ch = (char) alpha;
                    System.out.print(ch + " ");
                    res++;
                }
                System.out.println();
            }
            sc.close();
        }
    }

    public static void main(String[] args) {
        alphabetNumTriangle();
    }
}