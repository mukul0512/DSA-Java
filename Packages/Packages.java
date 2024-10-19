/*
 
Packages in java ->

2 types of packages in java

1. Built in packages -> 

ex 1. To take the input from the user we need a scanner class need to be import.
   -> import java.util.*;
              OR
   -> import java.util.Scanner;

   Where java.util is a package in java under which it contain various built-in packages.

2. User defined packages ->

ex -> import Packages.Bank.*; 

*/

package Packages;

import java.util.Scanner; // built-in package

public class Packages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("\nEnter name : ");
        String str = sc.nextLine();
        System.out.println("Your name is : " + str);
        sc.close();;
    }
}
