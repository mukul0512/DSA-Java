

/*
    1
    0 1
    1 0 1
    0 1 0 1
    
 */
import java.util.Scanner;

public class ZeroOneTriangle {
    public static void zeroOneTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int res;
            if (i % 2 != 0) {
                res = 1;
            } else {
                res = 0;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(res + " ");
                if (res == 0) {
                    res = 1;
                } else {
                    res = 0;
                }
            }
            System.out.println();
        }
        sc.close();
    }

    public static void main(String arg[]) {
        zeroOneTriangle();
    }
}
