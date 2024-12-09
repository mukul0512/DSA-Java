package Square;
/*

    1 3 5 7 9 
    1 3 5 7 9 
    1 3 5 7 9 
    1 3 5 7 9
    1 3 5 7 9

 */
import java.util.Scanner;

public class OddNumSquare {
    public static void oddNumSquare() {
        System.out.print("Enter the size of num square ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            int res = 1;
            for(int j = 1; j <= n; j++) {
                System.out.print(res + " "); // using extra variable
                res = res + 2;
            // for(int j = 1; j <= 2 * n - 1; j = j + 2) { // without taking extra variable
                // System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String args[]) {
        oddNumSquare();
    }
}
