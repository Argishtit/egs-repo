package com.training.initializationAndCleanup;

/*
 * Exercise:    9
 * Description: Create a class with two (overloaded) constructors. Using this, call the
 *              second constructor inside the first one.
 *
 */

public class Exercise9 {
}

class ConstructorOverloading {

    String firstName;
    String lastName;

    ConstructorOverloading(String firstName, String lastName) {
        this(firstName);
        this.lastName = lastName;
        System.out.println("Last name: " + this.lastName);
    }

    ConstructorOverloading(String firstName) {
        this.firstName = firstName;
        System.out.println("First name: " + this.firstName);
    }
}
