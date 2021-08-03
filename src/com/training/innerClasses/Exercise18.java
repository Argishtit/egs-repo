package com.training.innerClasses;

/*
 * Exercise:      18
 *
 * Description:  Create a class containing a nested class. In main( ), create an instance
 *               of the nested class.
 */

public class Exercise18 {
    public static void main(String[] args) {
        X.Nested nested = new X.Nested();                     // Exercise 18
    }
}

class X {
    static class Nested {

    }
}