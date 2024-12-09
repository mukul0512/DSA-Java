

/*
    1
    0 1
    1 0 1
    0 1 0 1
    
 */
import java.util.Scanner;

public class ZeroOneTriangle2 {
    public static void zeroOneTriangle2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    public static void main(String arg[]) {
        zeroOneTriangle2();
    }
}
