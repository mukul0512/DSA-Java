/*
 
Abstraction -> Data hiding is the process of protecting members of class from unintended changes whereas,

abstraction is hiding the implementation details and showing only important / useful parts to the user.

Properties of abstract class ->

1. An abstract class must be declared with an abstract keyword.

2. It can have abstract and non abstract methods.

3. It can not be instantiated.

4. It can have constructors and static methods also.

5. It can have final methods which will force the subclass not to change the body of the methods.

*/

package Oops.Abstraction;

abstract class Animal {
    abstract void walk();

    Animal() {   // creating a constructor whose name is Animal
        System.out.println("\nYou are creating a new Animal");
    }

    public void eats() {
        System.out.println("\nAnimal eats ");
        System.out.println();
    }
}

class Horse extends Animal {
    Horse() { // creating a constructor whose name is Horse
        System.out.println("\nCreating a Horse ");
    }

    public void walk() {
        System.out.println("\nWalk on 4 legs ");
    }
}

class Chicken extends Animal {
    Chicken() {  // creating a constructor whose name is Chicken
        System.out.println("\nCreating a Chicken ");
    }

    public void walk() {
        System.out.println("\nWalks on 2 legs ");
        System.out.println();
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eats();

        Chicken chicken = new Chicken();
        chicken.walk();
        chicken.eats();

        // Run time error occur

        // Animal animal = new Animal(); // error: Animal is abstract; cannot be instantiated
        // animal.walk();
        // animal.eats();
    }
}
