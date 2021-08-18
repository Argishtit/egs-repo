package com.training.interfaces;

/*
 * Exercise:     3
 * Description:  Create a base class with an abstract print( ) method that is overridden
 *               in a derived class. The overridden version of the method prints the value of an int variable
 *               defined in the derived class. At the point of definition of this variable, give it a nonzero value.
 *               In the base-class constructor, call this method. In main( ), create an object of the derived
 *               type, and then call its print( ) method. Explain the results.
 */

abstract class Base {
    abstract void print();

    Base() {
        print();
    }
}

class Derived extends Base {

    int number = 7;

    @Override
    void print() {
        System.out.println("The value of the number is " + number);
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.print();
    }
}
