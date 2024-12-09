package Inverted;
/*

    * * * * *
    * * * *
    * * *
    * *
    *

 */
import java.util.Scanner;

public class InverseRightTriangle {
    public static void inverseRightTriangle() {
        System.out.print("Enter the size of inverse triangle: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = n;
        for(int i = 1; i <= n; i++) {
            // for(int j = 1; j <= n + 1 - i; j++) { // without taking extra variable
            for(int j = 1; j <= res; j++) { // using extra variable
                System.out.print("* ");
            }
            res--;
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        inverseRightTriangle();
    }
}