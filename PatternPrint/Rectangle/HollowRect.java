package Rectangle;
/*

* * * * * *
*         *
*         *
* * * * * *

 */
import java.util.Scanner;

public class HollowRect {
    public static void hollowRect() {
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        Scanner sc1 = new Scanner(System.in);
        int m = sc1.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print(" " + " ");
                }   
            }
            System.out.println();
        }
        sc.close();
        sc1.close();
    }
    public static void main(String[] args) {
        hollowRect();
    }
}