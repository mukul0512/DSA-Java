package Pyramid;
/*

# # # # +
# # # + + *
# # + + + * *
# + + + + * * *
+ + + + + * * * *

-----------------------------------------------

# # # # A
# # # A B *
# # A B C * *
# A B C D * * *
A B C D E * * * *

------------------------------------------------

# # # # A
# # # A B C
# # A B C D E
# A B C D E F G
A B C D E F G H I

-----------------------------------------------------------

        A
      A B C
    A B C D E
  A B C D E F G
A B C D E F G H I

 */

import java.util.Scanner;

public class HiddenAlphabetPyramid {
    public static void hiddenAlphabetPyramid() {
        System.out.print("Enter the size of hidden Alphabet pyramid: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            int res = 1;
            for(int k = 1; k <= i; k++) {
                int alpha = res + 64;
                char ch = (char)alpha;
                System.out.print(ch + " ");
                res++;
            }
            for(int l = 1; l <= i - 1; l++) {
                int ans = res + 64;
                char ch2 = (char)ans;
                System.out.print(ch2 + " ");
                res++;
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        hiddenAlphabetPyramid();
    }
}
