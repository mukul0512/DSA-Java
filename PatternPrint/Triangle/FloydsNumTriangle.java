/*
 
    1
    2 3
    4 5 6
    7 8 9 10

 */

import java.util.Scanner;

public class FloydsNumTriangle {
    public static void floydsNumTriangle() {
        System.out.print("Enter tbe size of Floyds Odd Triangle: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(res + " ");
                res++;
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        floydsNumTriangle();
    }
}
