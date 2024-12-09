
/*

    *
    * *
    * * *
    * * * *

 */
import java.util.Scanner;

public class RightTriangle {
    public static void rightTriangle() {
        System.out.print("Enter the size of triangle ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void main(String args[]) {
        rightTriangle();
    }
}
