public class SwapTwoNumbersWithoutThirdVariable {
    public static void swapTwoNumbersWithoutThirdVariable(int a, int b) {
        a = a + b; // 10+20=30
        b = a - b; // 30-20=10
        a = a - b; // 30-10=20
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        swapTwoNumbersWithoutThirdVariable(a, b);
    }

}