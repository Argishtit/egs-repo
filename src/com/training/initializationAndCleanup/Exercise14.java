package com.training.initializationAndCleanup;

/*
 * Exercise:    14
 * Description: Create a class with a static String field that is initialized at the point of
 *              definition, and another one that is initialized by the static block. Add a static method that
 *              prints both fields and demonstrates that they are both initialized before they are used.
 *
 */

public class Exercise14 {
    public static void main(String[] args) {
       StaticInitialization.printInfo();
    }
}

class StaticInitialization {
    static String first = "Static Initialization 1";
    static String second;

    static {
        second = "Static Initialization 2";
    }

    static void printInfo() {
        System.out.println(first);
        System.out.println(second);
    }
}