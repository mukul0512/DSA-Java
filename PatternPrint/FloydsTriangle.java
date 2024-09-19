import java.util.*;

public class FloydsTriangle {
    public static void main(String[] args) {
        int num = 1;
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        // inner loop 
        for (int i = 1; i <= n; i++) {
            // outer loop 
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}