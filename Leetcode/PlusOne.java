import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int digits[]) {
        int n = digits.length - 1;
        for (int i = n; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int newNumber[] = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        int digits[] = { 1, 2, 3 };
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
