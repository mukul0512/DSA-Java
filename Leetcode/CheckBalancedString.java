public class CheckBalancedString {
    public static boolean isBalancedString(String num) {
        int evenSumIndex = 0;
        int oddSumIndex = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i % 2 == 0) {
                evenSumIndex = evenSumIndex + num.charAt(i) - '0';
            } else {
                oddSumIndex = oddSumIndex + num.charAt(i) - '0';
            }
        }
        return oddSumIndex == evenSumIndex;
    }

    public static void main(String[] args) {
        String num = "24123";
        System.out.println(isBalancedString(num));
    }
}
