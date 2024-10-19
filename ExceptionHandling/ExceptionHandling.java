/*
    Que - Write a Java program to explain exception handling with a finally block, including two simple examples—one with and one without the finally block.
*/

public class ExceptionHandling {

    // Example 1: Exception handling without finally block
    public static void withoutFinally() {
        System.out.println("Without finally block:");
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println("Result: " + result); // This line won't be executed
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        System.out.println("After try-catch block (no finally).\n");
    }

    // Example 2: Exception handling with finally block
    public static void withFinally() {
        System.out.println("With finally block:");
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println("Result: " + result); // This line won't be executed
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes, even if an exception occurs.");
        }
        System.out.println("After try-catch-finally block.\n");
    }

    public static void main(String[] args) {
        // Running without the finally block
        withoutFinally();
        
        // Running with the finally block
        withFinally();
    }
}
