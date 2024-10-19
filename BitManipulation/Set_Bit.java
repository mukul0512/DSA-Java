package BitManipulation;

public class Set_Bit {
    public static void main(String args[]) {
        int n = 5; // 0101
        int position = 1;
        int bitMask = 1 << position; // 0010
        int newNumber = bitMask | n; // 0010 | 0101 = 0111 = 7
        System.out.println(newNumber);
    }
}
