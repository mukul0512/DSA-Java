package Oops;

class Pen {
    String color; // properties
    String type; // ballpoint; gel -> properties

    public void write() {
        System.out.println("Writing something ");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Student() {
    // System.out.println("Constructor called");
    // }

    // Student(String name, int age) {
    // this.name = name;
    // this.age = age;
    // }

    Student() {

    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class Oops {
    public static void main(String args[]) {
        Pen pen1 = new Pen(); // creating object of class Pen
        pen1.color = "blue"; // accessing property of object pen1
        pen1.type = "gel"; // accessing property of object pen1

        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "ballpoint";

        // Student s1 = new Student();
        // s1.name = "Mukul";
        // s1.age = 25;

        // Student s1 = new Student("Mukul", 25);
        Student s1 = new Student();
        s1.name = "Mukul";
        s1.age = 25;

        Student s2 = new Student(s1);

        pen1.write(); /// calling function write
        pen2.write(); // calling function write

        pen1.printColor(); // calling function printColor
        pen2.printColor(); // calling function printColor

        // s1.printInfo(); // calling function printInfo
        s2.printInfo(); // calling function printInfo
    }
}