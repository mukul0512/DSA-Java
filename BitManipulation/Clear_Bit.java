package BitManipulation;

public class Clear_Bit {
    public static void main(String[] args) {
        int n = 5; // 0101
        int position = 2;
        int bitMask = 1 << position; // 0100
        int notBitMask = ~(bitMask); // 1011
        int newNumber = notBitMask & n; // 1011 & 0101 = 0001 = 1
        System.out.println(newNumber);
    }
}
