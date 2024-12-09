package Rectangle;

/*

Solid Rectangle Pattern

* * * * *
* * * * *
* * * * *
* * * * *

rows    -> 4 -> no of lines
columns -> 5 -> no of stars/numbers/alphabet etc 

*/
// import java.util.*;
import java.util.Scanner;

public class SolidRect {
    public static void solidRect() {
        System.out.println("Enter number of rows: ");
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        int n = sc.nextInt();
        System.out.println("Enter number of columns: ");
        Scanner sc1 = new Scanner(System.in); // System.in is a standard input stream
        int m = sc1.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
        sc1.close();
    }

    public static void main(String args[]) {
        solidRect();
    }
}
