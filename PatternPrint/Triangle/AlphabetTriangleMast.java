/*

        A
      A B
    A B C
  A B C D
A B C D E

 */

import java.util.Scanner;

public class AlphabetTriangleMast {
    public static void alphabetTriangleMast() {
        System.out.print("Enter the size of alphabet triangle mast wallah: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            int res = 1;
            for(int k = 1; k <= i; k++) {
                int alpha = res + 64;
                char ch = (char)alpha;
                System.out.print(ch + " ");
                res++;
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        alphabetTriangleMast();
    }
}
