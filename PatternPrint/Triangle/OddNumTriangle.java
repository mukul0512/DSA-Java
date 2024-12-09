/*

    1
    1 3
    1 3 5
    1 3 5 7

 */
import java.util.Scanner;

public class OddNumTriangle {
    public static void oddNumTriangle() {
        System.out.print("Enter the size of triangle: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int res = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(res + " ");
                res = res + 2;
            }
            System.out.println();
        }
        sc.close();
    }

    public static void main(String args[]) {
        oddNumTriangle();
    }
}
