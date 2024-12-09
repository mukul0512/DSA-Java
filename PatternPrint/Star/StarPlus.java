package Star;
/*

    #  #  *  #  #
    #  #  *  #  #
    *  *  *  *  *
    #  #  *  #  #
    #  #  *  #  #

 */

import java.util.Scanner;

public class StarPlus {
    public static void starPlus() {
        System.out.print("Enter the size of star plus: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == n / 2 + 1 || i == n / 2 + 1) {
                    System.out.print("* " + " ");
                } else {
                    System.out.print("# " + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    public static void main(String[] args) {
        starPlus();
    }
}
