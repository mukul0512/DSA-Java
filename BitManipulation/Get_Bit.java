package BitManipulation;

public class Get_Bit {
    public static void main(String args[]) {
        int n = 5; //0101
        // int position = 2;
        int position = 3;
        // int bitMask = 1<<position; // 0100
        int bitMask = 1<<position; // 1000
        // if((bitMask & n) == 0) { // 0100 & 0101 = 0100
        if((bitMask & n) == 0) { // 1000 & 0101 = 0000
            System.out.println("Bit was zero");
        }
        else {
            System.out.println("Bit was one");
        }
    }
}
