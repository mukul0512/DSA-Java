package Pyramid;

/*

* * * - * * *
* * - - - * *
* - - - - - *

--------------------------------------------

* * * * * * *
* * * - * * *
* * - - - * *
* - - - - - *

------------------------------------------

* * * * * * *
* * *   * * *
* *       * *
*           *

 */
import java.util.Scanner;

public class StarPyramidMast3 {
    public static void numbPyramidMast3() {
        System.out.print("Enter the size of star pyramid mast wallah: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int space = 1;
        for (int m = 1; m <= 2 * n + 1; m++) { // for printing first row
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*" + " ");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print("-" + " ");
            }
            for (int l = 1; l <= star; l++) {
                System.out.print("*" + " ");
            }
            star--;
            space = space + 2;
            sc.close();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numbPyramidMast3();
    }
}
