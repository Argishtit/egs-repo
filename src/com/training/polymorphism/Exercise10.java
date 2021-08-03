package com.training.polymorphism;

/*
 * Exercise:    10
 * Description: Create a base class with two methods. In the first method, call the
 *              second method. Inherit a class and override the second method. Create an object of the
 *              derived class, upcast it to the base type, and call the first method. Explain what happens.
 */

class Base {
    public void methodCaller() {
        printMessage();
    }

    public void printMessage() {
        System.out.println("Hello from the base class");
    }
}

class Derived extends Base {
    @Override
    public void printMessage() {
        System.out.println("Hello from derived class");
    }
}

public class Exercise10 {
    public static void main(String[] args) {
        Base base = new Derived();
        base.methodCaller();
    }
}
