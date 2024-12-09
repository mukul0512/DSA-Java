package Inverted;
/*

    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1

 */
import java.util.Scanner;

public class InverseNumRightTriangle {
    public static void invertRightTriangle() {
        System.out.print("Enter the size of triangle: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n + 1 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String args[]) {
        invertRightTriangle();
    }
}
