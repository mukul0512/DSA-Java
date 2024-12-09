package Pyramid;
/*

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

 */

 import java.util.Scanner;

 public class StarPyramid {
     public static void starPyramid() {
         System.out.print("Enter the size of star pyramid: ");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         for(int i = 1; i <= n; i++) {
             for(int j = 1; j <= n - i; j++) {
                 System.out.print(" " + " ");
             }
             for(int k = 1; k <= i; k++) {
                 System.out.print("*" + " ");
             }
             for(int l = 1; l <= i - 1; l++) {
                 System.out.print("*" + " ");
             }
             System.out.println();
         }
         sc.close();
     }
     public static void main(String[] args) {
         starPyramid();
     }
 }
 