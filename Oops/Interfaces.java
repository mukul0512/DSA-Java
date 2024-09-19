/*

Interfaces -> We can only implements the interfaces but not extends.

Note -> Interfaces doesn't have constructor.

     -> Doesn't contain any non abstract function under interface.

     -> Doesn't contain any implementation of function under interface.

     -> Doesn't extends the interfaces.

Properties of interfaces -> 

1. All the fields in interfaces are public, static and final by default.

2. All method are public and abstract by default 

3. A class that implements an interface must implement all the methods declared in the interface.

4. Interfaces support the functionality of multiple inheritance.

-----------------------------------------------------------------------------------------------------------------

Static Keyword ->

-> Those properties which are common towards class. 
-> Can be access by all the objects but not like public.

*/

package Oops;

class Student {
    String name;
    static String school; // because school name is common for all the students so it is static.

    public static void changeSchool() {
        school = "\nNew School";
    }
}

interface Animal {
    int eyes = 2; // static
    // public void walk();

    void walk(); // by default this method is both public as well as abstract even you remove public keyword from their.

    // Animal() { // Not possible to create constructor of interface.

    // }

    // void eat() { // Not possible to create constructor of interface.

    // }
}

interface Herbivore {

}
// Multiple inheritance ->   example are as follows : Animal and Herbivore properties can be taken together.
class Horse implements Animal, Herbivore { // dono classes ki properties ko ek sath le sakte hai. Like Animal and Herbivore
    public void walk() {
        System.out.println("\nWalks on 4 legs ");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Student.school = "\nSRVM"; // Can be access by all the objects but not like public.
        Student student1 = new Student();
        student1.name = "Mukul Karnwal";
        System.out.println();
        System.out.println(student1.school);

        Horse horse = new Horse();
        horse.walk();
    }
}
