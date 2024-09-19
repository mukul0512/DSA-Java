/*
Inheritance ->

one class properties or methods takes/ extends properties or methods of another class.

4 types of Inheritance      ->

1. Single Level Inheritance ->

2. Multi Level Inheritance  ->

3. Hierarchial Inheritance  ->

4. Hybrid Inheritance       -> different different types of inheritance in the same place.

5. Multiple Inheritance     -> doesn't in the form of class in java but can be seen in c++

Note -> We are using interfaces in java to implement multiple inheritance


*/

package Oops;

class Shape { // Parent or base class
    String color;

    public void area() {
        System.out.println("\nDisplays area : ");
    }
}

// Single Level Inheritance
class Triangle extends Shape { // child or sub class. Here Triangle is a derived class
    public void area(int l, int h) {
        System.out.println((0.5) * l * h);
    }
    
}

// Multi Level Inheritance
class EquilateralTriangle extends Triangle {
    public void area(int a) {
        System.out.println(( 1.73 * a * a ) / 4);
    }
}

// Hierarchial Inheritance
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Shape s1 = new Shape();
        s1.color = "\nred";
        System.out.println(s1.color);

        Triangle t = new Triangle();
        System.out.println(s1.color);
        t.area(3, 5);

        EquilateralTriangle eq = new EquilateralTriangle();
        System.out.println(s1.color);
        eq.area(5);

        Circle c = new Circle();
        System.out.println(s1.color);
        c.area(2);
        System.out.println();
    }

}
