package Pyramid;
/*
 
# # # # 1
# # # 1 2 %
# # 1 2 3 % %
# 1 2 3 4 % % %
1 2 3 4 5 % % % %

-----------------------------------------

# # # # 1
# # # 1 2 3
# # 1 2 3 4 5
# 1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9

-----------------------------------------------------

        1
      1 2 3
    1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9

 */

import java.util.Scanner;

public class HiddenNumPyramid {
    public static void hiddenNumPyramid() {
        System.out.print("Enter the size of a Hidden numbered pyramid: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            int res = 1;
            for(int k = 1; k <= i; k++) {
                System.out.print(res + " ");
                res++;
            }
            for(int l = 1; l <= i - 1; l++) {
                System.out.print(res + " ");
                res++;
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        hiddenNumPyramid();
    }
}
