package Star;
/*

*       *
  *   *
    *
  *   *
*       *

 */

import java.util.Scanner;

public class StarCross {
    public static void starCross() {
        System.out.print("Enter the size of star cross: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == j || i + j == n + 1) {
                System.out.print("*" + " ");
                }
                else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        starCross();
    }
}
