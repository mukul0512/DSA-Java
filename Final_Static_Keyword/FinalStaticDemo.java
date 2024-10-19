package Final_Static_Keyword;

// Class to demonstrate the 'final' keyword
class FinalExample {
    // A final variable
    final int FINAL_VARIABLE = 100;

    // A final method
    final void display() {
        System.out.println("This is a final method.");
    }
}

// Subclass attempting to override a final method (will cause a compile-time
// error)
class AttemptToOverride extends FinalExample {
    // Uncommenting the below method will cause a compile-time error
    // void display() {
    // System.out.println("Attempting to override a final method.");
    // }
}

// Class to demonstrate the 'static' keyword
class StaticExample {
    // A static variable
    static int staticVariable = 0;

    // A static method
    static void increment() {
        staticVariable++;
        System.out.println("Static Variable: " + staticVariable);
    }
}

public class FinalStaticDemo {
    public static void main(String[] args) {
        // Demonstrating final keyword
        FinalExample finalExample = new FinalExample();
        System.out.println("Final Variable: " + finalExample.FINAL_VARIABLE); // Output: 100
        finalExample.display(); // Output: This is a final method.

        // Attempting to override final method (will cause an error if uncommented)
        // AttemptToOverride attempt = new AttemptToOverride();
        // attempt.display(); // This will cause a compile-time error if uncommented.

        // Demonstrating static keyword
        StaticExample.increment(); // Output: Static Variable: 1
        StaticExample.increment(); // Output: Static Variable: 2
        StaticExample.increment(); // Output: Static Variable: 3
    }
}
