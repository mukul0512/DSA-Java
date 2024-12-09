/*
    *  *  *  *
    *  *  *  *
    *  *  *  *
    *  *  *  *
 */
package Square;

import java.util.Scanner;

public class SolidSquare {
    public static void solidSquare() {
        System.out.print("Enter the size of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("* " + " ");
            }
            System.out.println();
        }
        sc.close();
    }
   public static void main(String[] args) {
        solidSquare();
   } 
}
