package Square;
/*

    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5

 */

import java.util.Scanner;

public class NumSquare {
    public static void numSquare() {
        System.out.print("Enter the size of square: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String args[]) {
        numSquare();
    }
}
