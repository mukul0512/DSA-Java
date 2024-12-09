package Pyramid;

/*

* * * * * * *
* * * - * * *
* * - - - * *
* - - - - - *

---------------------------------------------------

1 2 3 4 5 6 7   ----> alag se loop lga do
1 2 3 - 5 6 7   ----> take n = 3
1 2 - - - 6 7
1 - - - - - 7

 */
import java.util.Scanner;

public class NumbPyramidMast2 {
    public static void numbPyramidMast2() {
        System.out.print("Enter the size of numbered pyramid: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numb = n;
        int space = 1;
        for (int m = 1; m <= 2 * n + 1; m++) { // for printing first row
            System.out.print(m + " ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            int res = 1;
            for (int j = 1; j <= numb; j++) {
                System.out.print(res + " ");
                res++;
            }
            for (int k = 1; k <= space; k++) {
                System.out.print("-" + " ");
                res++;
            }
            for (int l = 1; l <= numb; l++) {
                System.out.print(res + " ");
                res++;
            }
            numb--;
            space = space + 2;
            sc.close();
            System.out.println();
        }
        sc.close();
    }

    public static void main(String[] args) {
        numbPyramidMast2();
    }
}
