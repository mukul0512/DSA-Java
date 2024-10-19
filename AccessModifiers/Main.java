package AccessModifiers;

// Class with different access specifiers
class AccessModifiersDemo {
    // Public variable
    public String publicVariable = "Public Variable";
    
    // Protected variable
    protected String protectedVariable = "Protected Variable";
    
    // Default variable
    String defaultVariable = "Default Variable";  // No modifier, default access
    
    // Private variable
    private String privateVariable = "Private Variable";

    // Method to display all variables
    public void display() {
        System.out.println(publicVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
        System.out.println(privateVariable);
    }
}

// Subclass in the same package to demonstrate protected access
class SubClass extends AccessModifiersDemo {
    public void displayProtected() {
        // Accessing protected variable from superclass
        System.out.println("Accessing from SubClass: " + protectedVariable);
    }
}

public class Main {
    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        
        // Accessing public variable
        System.out.println("Accessing from Main: " + demo.publicVariable);
        
        // Accessing protected variable (accessible here because of subclass)
        SubClass subClass = new SubClass();
        subClass.displayProtected(); // Output: Accessing from SubClass: Protected Variable
        
        // Accessing default variable (accessible in the same package)
        System.out.println("Accessing from Main: " + demo.defaultVariable);
        
        // Accessing private variable (not accessible outside the class)
        // Uncommenting the following line will cause a compile-time error
        // System.out.println("Accessing from Main: " + demo.privateVariable);
        
        // Displaying all variables using the display method
        demo.display();
    }
}

