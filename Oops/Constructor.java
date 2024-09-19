/*
 -> Constructor : 

 Properties of constructor : 3 major properties are --

 1. The name of the constructor of a class or the object is same as their name of the class.
 ex - class Employee {}  
    - Employee emp = new Employee(); object creation using new keyword

 2. Constructor are the methods or functions but doesn't return anything or no any return type.
 ex - return type like int, float, double, short, void etc

 3. Can be called only once for an object at a time of creating the object.
 ex - Employee emp = new Employee();
    - Employee emp = new Employee(); never called again with the same object
 
 There are 3 types of constructor in java

 1. non parameterized constructor

 -> If we don't create your own constructor then java create a default constructor taking from the object creation.
 i.e. Employee emp = new Employee(); // constructor Employee w'll be created by java by default.

 2. parameterized constructor 

 3. copy constructor

 -> All the copy constructor in java are user defined.

 -> Work is to put one object into the another object by coping it.

 */

package Oops;

class Employee {
    String name;
    int id;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println();
        System.out.println(this.id);
        System.out.println();
    }

    // Creating a constructor
    Employee() {  // non parameterized constructor
        // System.out.println("\nNon- parameterized constructor called ");
    }

    Employee(String name, int id) {  // parameterized constructor
        System.out.println("\nparameterized constructor called ");
        this.name = name; //this.name is object name and name is the parameter
        this.id = id;    //this.id is object name and id is the parameter
    }

    Employee(Employee emp2) {  // copy constructor
        System.out.println("\ncopy constructor called ");
        this.name = emp2.name; //this.name is object name and emp2.name is the parameter
        this.id = emp2.id;    //this.id is object name and emp2.id is the parameter
    }
}

public class Constructor {
    public static void main(String[] args) {
        Employee emp = new Employee();  // Creating object 
        emp.name = "\nPeeyush";
        emp.id = 2;

        Employee emp2 = new Employee(emp);// passing a copy of an object to assigning all the properties of that object 

        emp2.printInfo(); // copy constructor called

        // Employee emp = new Employee("\nMukul Karnwal", 20);  // Passing parameter values in the object 
        // emp.name = "\nPradyot";
        // emp.id = 1;

        // emp.printInfo(); 
    }
}
