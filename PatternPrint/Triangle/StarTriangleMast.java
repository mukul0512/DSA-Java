/*

    # # # # # *
    # # # # * *
    # # # * * *
    # # * * * *
    # * * * * *

 */
import java.util.Scanner;

public class StarTriangleMast {
    public static void starTriangleMast() {
        System.out.print("Enter the size of star triangle: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n + 1 - i; j++) {
                System.out.print("#" + " ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        starTriangleMast();
    }
}
