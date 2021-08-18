package com.training.interfaces;

/*
 * Exercise:    2
 * Description: Create a class as abstract without including any abstract methods and
 *              verify that you cannot create any instances of that class.
 *
 */

abstract class Stagnation {
    Stagnation() {
        System.out.println("Hello from constructor");
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        //Stagnation stagnation = new Stagnation();
    }
}
