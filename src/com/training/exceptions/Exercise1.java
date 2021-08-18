package com.training.exceptions;

/*
 * Exercise:     1
 * Description:  Create a class with a main( ) that throws an object of class Exception
 *               inside a try block. Give the constructor for Exception a String argument. Catch the
 *               exception inside a catch clause and print the String argument. Add a finally clause and
 *               print a message to prove you were there.
 */

class Exception1 extends Exception {
    public Exception1(String msg) {
        super(msg);
        System.out.println("Exception1(String msg)");
    }
}

public class Exercise1 {
    public static void simpleMethod() throws Exception1 {
        System.out.println("Hello");
        throw new Exception1("Message from simpleMethod()");
    }

    public static void main(String[] args) {
        try {
            simpleMethod();
        } catch (Exception1 e) {
            System.out.println("caught Exception1");
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }
}
