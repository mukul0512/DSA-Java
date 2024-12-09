package Star;

/*

- - - *
- - * * *
- * * * * *
* * * * * * *
- * * * * *
- - * * *
- - - *

----------------------------------------------------------

      *
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *

 */

import java.util.Scanner;

public class StarDiamond {
    public static void starDiamond() {
        System.out.print("Enter the size of star diamond: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = n / 2;
        int midline = n / 2 + 1;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*" + " ");
            }
            if(i < midline) {
                spaces--;
                star = star + 2;
            }
            else {
                spaces++;
                star = star - 2;
            }
            System.out.println();
        }
        sc.close();
    }

    public static void main(String[] args) {
        starDiamond();
    }
}
