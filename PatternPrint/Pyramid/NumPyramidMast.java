package Pyramid;
/*
 
# # # # +
# # # + + @
# # + + + @ @
# + + + + @ @ @
+ + + + + @ @ @ @

-----------------------------------------------

# # # # 1
# # # 1 2 @
# # 1 2 3 @ @
# 1 2 3 4 @ @ @
1 2 3 4 5 @ @ @ @

-------------------------------------------------------------

# # # # 1
# # # 1 2 1
# # 1 2 3 1 2
# 1 2 3 4 1 2 3
1 2 3 4 5 1 2 3 4

-----------------------------------------------------------------

        1
      1 2 1
    1 2 3 1 2
  1 2 3 4 1 2 3
1 2 3 4 5 1 2 3 4

------------------------------------------------------------------------------

        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

 */

import java.util.Scanner;

public class NumPyramidMast {
    public static void numPyramidMast() {
        System.out.print("Enter the size of number pyramid: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = n - 1;
        for(int i = 1; i <= n; i++) {
          int res = i - 1;
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" " + " ");
            }
            spaces--;
            for(int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            for(int l = 1; l <= i - 1; l++) {
                System.out.print(res + " ");
                res--;
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        numPyramidMast();
    }
}
