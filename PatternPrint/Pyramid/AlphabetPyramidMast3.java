package Pyramid;
/*

A B C D E F G
A B C - E F G
A B - - - F G
A - - - - - G

 */
import java.util.Scanner;

public class AlphabetPyramidMast3 {
    public static void alphabetPyramidMast3() {
        System.out.print("Enter the size of alphabet pyramid mast wallah: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alphaChar = n;
        int space = 1;
        int res2 = 1;
        for (int m = 1; m <= 2 * n + 1; m++) {
            int alpha3 = res2 + 64;
            char ch = (char)alpha3;
            System.out.print(ch + " ");
            res2++;
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            int res = 1;
            for (int j = 1; j <= alphaChar; j++) {
                int alpha = res + 64;
                char ch = (char)alpha;
                System.out.print(ch + " ");
                res++;
            }
            for (int k = 1; k <= space; k++) {
                System.out.print("-" + " ");
                res++;
            }
            for (int l = 1; l <= alphaChar; l++) {
                int alpha2 = res + 64;
                char ch2 = (char)alpha2;
                System.out.print(ch2 + " ");
                res++;
            }
            alphaChar--;
            space = space + 2;
            System.out.println();
        }
        sc.close();
    }

    public static void main(String[] args) {
        alphabetPyramidMast3();
    }
}
