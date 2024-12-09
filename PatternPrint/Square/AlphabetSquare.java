package Square;
/*

    A B C D
    A B C D
    A B C D
    A B C D

 */
import java.util.Scanner;

public class AlphabetSquare {
    public static void alphabetSquare() {
        System.out.print("Enter the size of alphabet square: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            int res = 1;
            for(int j = 1; j <= n; j++) {
                int alpha  = res + 64; // alpha = 1 + 64 = 65
                char ch = (char)alpha; // ch = A
                System.out.print(ch + " ");
                res++;
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String args[]) {
        alphabetSquare();
    }
}
