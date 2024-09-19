/*

Solid Rectangle Pattern

* * * * *
* * * * *
* * * * *
* * * * *

rows    -> 4
columns -> 5  

*/

// import java.util.*;
import java.util.Scanner;

public class SolidRect {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

}