public class FibonacciSeriesUsingRecursion {
    static int n1 = 0, n2 = 1, count = 10;

    public static void fibonacciSeriesUsingRecursion(int num) {
        if (num == 0) {
            return; // Base case: stop when count reaches 0
        }

        int n3 = n1 + n2;
        System.out.print(" " + n3);

        // Update n1 and n2 for the next recursive call
        n1 = n2;
        n2 = n3;

        fibonacciSeriesUsingRecursion(num - 1);
    }

    public static void main(String[] args) {
        System.out.print(n1 + " " + n2);
        fibonacciSeriesUsingRecursion(count - 2); // First two numbers are already printed
    }
}
