package Pyramid;
/*
for n = 4

1 1 1 1
1 2 2 2
1 2 3 3
1 2 3 4

------------------------------------
                     j = 1 2 3 4 5 6 7
                    j1 = 1 2 3 4 3 2 1

i = i1 = 1 -> 1   ->     1 1 1 1 1 1 1
i = i1 = 2 -> 2   ->     1 2 2 2 2 2 1
i = i1 = 3 -> 3   ->     1 2 3 3 3 2 1
i = i1 = 4 -> 4   ->     1 2 3 4 3 2 1
i = i1 = 5 -> 3   ->     1 2 3 3 3 2 1
i = i1 = 6 -> 2   ->     1 2 2 2 2 2 1
i = i1 = 7 -> 1   ->     1 1 1 1 1 1 1

---------------------------------------------------------

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

 */

 import java.util.Scanner;

 public class SquareNumbPyramidMast {
     public static void squareNumbPyramidMast() {
         System.out.print("Enter the size of n: ");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int min = 0;
         int lines = 2 * n - 1; // for both rows and columns
         for (int i = 1; i <= lines; i++) {
             for (int j = 1; j <= lines; j++) {
                 int i1 = i; // i1 = 1 2 3 4 3 2 1 = i = 1 2 3 4 5 6 7
                 int j1 = j; // j1 = 1 2 3 4 3 2 1 = j = 1 2 3 4 5 6 7
                 if(i1 > n) {
                     i1 = 2 * n - i;
                 }
                 if(j1 > n) {
                     j1 = 2 * n - j;
                 }
                 if (i1 < j1) {
                     min = i1;
                 } else {
                     min = j1;
                 }
                 System.out.print(n + 1 - min + " ");
             }
             System.out.println();
         }
         sc.close();
     }
 
     public static void main(String[] args) {
         squareNumbPyramidMast();
     }
 }
 