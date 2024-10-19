/*
Update the 2nd bit (position = 1) of a number n to 0. (n = 0101)

Case 1 -> For 0 
       -> Also called as clear operation
          bitMask = 1 << i
          operation = AND with NOT

Case 2 -> For 1 
       -> Also called as set operation
          bitMask = 1 << i
          operation = OR

 */

package BitManipulation;

import java.util.Scanner;

public class Update_Bit_ForZeroOrOne {
    public static void main(String args[]) {
        System.out.println("Enter the value for update 0 or 1 : ");
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        int n = 5; // 0101
        int position = 1;
        int bitMask = 1 << position; // 0010
        if (operation == 1) {
            // set operation for 1
            int newNumber = bitMask | n; // 0010 | 0101 = 0111 = 7
            System.out.println("The updated value is : " + newNumber);
        }
        else {
            // clear operation for 0
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n; // 1101 & 0101 = 0101 = 5
            System.out.println("The updated value is : " + newNumber);
        }
    }
}
