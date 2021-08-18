package com.training.exceptions;

/*
 * Exercise:     9
 * Description:  Create three new types of exceptions. Write a class with a method that
 *               throws all three. In main( ), call the method but only use a single catch clause that will
 *               catch all three types of exceptions.
 */

class Exception3 extends Exception {
    public Exception3(String msg) {
        super(msg);
        System.out.println("Exception3(String msg)");
    }
}

class Exception4 extends Exception {
    public Exception4(String msg) {
        super(msg);
        System.out.println("Exception4(String msg)");
    }
}

class Exception5 extends Exception {
    public Exception5(String msg) {
        super(msg);
        System.out.println("Exception5(String msg)");
    }
}

public class Exercise9{
    public static void f(int x) throws Exception3, Exception4, Exception5 {
        if(x < 0) throw new Exception3("x < 0");
        if(x == 0) throw new Exception4("x == 0");
        if(x > 0) throw new Exception5("x > 0");
    }
    public static void main(String[] args) {
        try {
            f(0);
            f(1);
            f(-1);
            // will catch any Exception type:
        } catch(Exception e) {
            System.out.println("Caught Exception");
            e.printStackTrace(System.out);
        }
    }
}