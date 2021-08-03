package com.training.initializationAndCleanup;

/*
 * Exercise:    12
 * Description: Create a class called Tank that can be filled and emptied, and has a
 *              termination condition that it must be empty when the object is cleaned up. Write a
 *              finalize( ) that verifies this termination condition. In main( ), test the possible scenarios
 *              that can occur when your Tank is used.
 */

public class Exercise12 {
    public static void main(String[] args) {

    }
}

class Tank {

    boolean empty;
    String name;

    public Tank(String name) {
        this.name = name;
        this.empty = true;
    }

    public Tank(String name, boolean empty) {
        this.name = name;
        this.empty = empty;
    }

    void clear() {
        this.empty = false;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (empty) {
            System.err.println("tank : " + name + " is empty");
        }
    }
}