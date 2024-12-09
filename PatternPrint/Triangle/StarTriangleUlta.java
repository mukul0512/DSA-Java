/*

- - - - - * 
- - - - * * 
- - - * * * 
- - * * * * 
- * * * * * 

 */
import java.util.Scanner;

public class StarTriangleUlta {
    public static void starTriangleUlta() {
        System.out.print("Enter the size of star triangle ulta wallah: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            int space = n + 1 - i;
            for(int j = 1; j <= space; j++) {
                System.out.print("-" + " ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        starTriangleUlta();
    }
}
