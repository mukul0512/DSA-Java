/*
Polymorphism -> 

Poly + morphism = many + forms

-> Same work is performed by different different ways.

2 types of polymorphism 

1. function overloading ->

-> When we creating different different types of function but having the same name with different parameters.

-> It's a compile time polymorphism.

2 function overriding ->

-> It's a run time polymorphism. 
Note -> Run time polymorphism is used in the concept of Inheritance.

*/

package Oops.Polymorphism;

// Ex 1 -> function overloading 
class Books {
    String title;
    int serialNum;
    double price;  

    public void printDetails(String title) {
        System.out.println(title);
        System.out.println();
    }

    public void printDetails(int serialNum) {
        System.out.println(serialNum);
        System.out.println();
    }

    public void printDetails(double price) {
        System.out.println(price);
        System.out.println();
    }

    public void printDetails(String title, int serialNum, double price) {
        System.out.println(title + " " + serialNum + " " + price);
        System.out.println();
    }
}

// Ex 2 -> function overloading 

class Company {
    String name;
    double share;
    int size;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(double share) {
        System.out.println(share);
    }

    public void printInfo(String name, double share, int size) {
        System.out.println(name);
        System.out.println(share);
        System.out.println(size);
    }
}

// Ex 3 -> Function overloading 

class Organization extends Company {

    @Override  
    public void printInfo(String name, double share, int size) {
        System.out.println(name + " " + share + " " + size);
    }
}

public class Polymorphism {
    public static void main(String args[]) {
        // ex 1 -> function overloading
        Books b1 = new Books();
        b1.title = "\nYou Can Win";

        b1.printDetails(b1.title);

        Books b2 = new Books();
        b2.serialNum = 21;

        b2.printDetails(b2.serialNum);

        Books b3 = new Books();
        b3.price = 99.9;

        b3.printDetails(b3.price);

        Books b4 = new Books();
        b4.title = "You Can Win";
        b4.serialNum = 21;
        b4.price = 99.9;

        b4.printDetails(b4.title, b4.serialNum, b4.price);

        // ex 2 -> function overloading 
        Company comp1 = new Company();
        comp1.name = "Kellton";

        comp1.printInfo(comp1.name);

        Company comp2 = new Company();
        comp2.share = 100.9;

        comp2.printInfo(comp2.share);

        Company comp3 = new Company();
        comp3.size = 5000;

        comp3.printInfo(comp1.name, comp2.share, comp3.size);
    }
}
