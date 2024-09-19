/*
 
Packages in java ->

2 types of packages in java

1. Built in packages -> 

ex 1. To take the input from the user we need a scanner class need to be import.
   -> import java.util.*;
              OR
   -> import java.util.Scanner;

   Where java.utils is a package in java under which it contain various built-in packages.

2. User defined packages ->

ex -> import Oops.bank.Bank; 

*/

package Oops;

import java.util.*; // built-in package
// import java.util.Scanner;
import Oops.Bank.*; // user defined package

public class Packages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("\nEnter name : ");
        String str = sc.nextLine();
        System.out.println("Your name is : " + str);
        sc.close();

        Account acc1 = new Account("12346");
        // acc1.name = "Customer1";

        // PersonalAccount persAcc = new PersonalAccount();
        // persAcc.name("custom");
        
    }
}

// public class PersonalAccount extends Account {

// } 
