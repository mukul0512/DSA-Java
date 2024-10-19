/*
Update the 2nd bit (position = 1) of a number n to 1. (n = 0101)

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

public class Update_Bit_For1 {
    public static void main(String args[]) {
        int n = 5; // 0101
        int position = 1;
        int bitMask = 1 << position; // 0010 
        int newNumber = bitMask | n; /// 0010 | 0101 = 0111 = 7
        System.out.println(newNumber);
    }
}
