package Pyramid;

/*

1 2 3 4 5 6 7
1 2 3 - 5 6 7
1 2 - - - 6 7
1 - - - - - 7

----------------------------------------------

1 2 3 4 5 4 3 2 1
1 2 3 4 - 4 3 2 1
1 2 3 - - - 3 2 1
1 2 - - - - - 2 1
1 - - - - - - - 1

--------------------------------------------------------------



 */
import java.util.Scanner;

public class NumbPyramidMast3 {
    public static void numbPyramidMast3() {
        System.out.print("Enter the size of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numb = n;
        int space = 1;
        for(int m = 1; m <= n + 1; m++) {
            System.out.print(m + " ");
        }
        for(int p = n; p >= 1; p--) {
            System.out.print(p + " ");
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
            }
            res = numb;
                for (int l = 1; l <= numb; l++) {
                    System.out.print(res + " ");
                    res--;
                }
            numb--;
            space = space + 2;
            System.out.println();
        }
        sc.close();
    }

    public static void main(String[] args) {
        numbPyramidMast3();
    }
}
