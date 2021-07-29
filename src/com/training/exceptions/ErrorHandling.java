package com.training.exceptions;

/**
 * Description: This class is designed for covering the most part of the exercises from the book ThinkingInJava4e.
 * Chapter:     Error handling with exceptions
 *
 * @author Argishti Tigranyan
 */

public class ErrorHandling {
    public static void main(String[] args) {

    }
}

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

class Exercise1 {
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

/*
 * Exercise:     2
 * Description:  Define an object reference and initialize it to null. Try to call a method
 *               through this reference. Now wrap the code in a try-catch clause to catch the exception.
 */

class Exercise2 {
    public static void main(String[] args) {
        String name = "Argishti";
        name = null;
        try {
            name.length();
        } catch (NullPointerException e) {
            System.out.println("Null reference");
            e.printStackTrace();
        }
        try {
            name = "Again Argishti";
        } catch (NullPointerException e) {
            System.out.println("Maybe this time everything was ok?");
            e.printStackTrace();
        }
    }
}

/*
 * Exercise:     3
 * Description:  Write code to generate and catch an ArrayIndexOutOfBoundsException.
 */

class Exercise3 {
    public static void main(String[] args) {
        int[] array = new int[2];
        array[0] = 7;
        array[1] = 14;

        try {
            array[2] = 21;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is not enough space anymore in this array");
            e.printStackTrace();
        }
    }
}

/*
 * Exercise:     4
 * Description:  Create your own exception class using the extends keyword. Write a
 *               constructor for this class that takes a String argument and stores it inside the object with a
 *               String reference. Write a method that displays the stored String. Create a try-catch clause
 *               to exercise your new exception.
 */

class Exception2 extends Exception {

    private String msg;

    public Exception2() {
    }

    public Exception2(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}

class Exercise4 {
    public static void thrower(String message) throws Exception2 {
        System.out.println("Inside thrower");
        throw new Exception2(message);
    }

    public static void main(String[] args) throws Exception2 {
        try {
            thrower("Throwing an Exception");
        } catch (Exception2 e) {
            System.out.println(e.getMsg());
            e.printStackTrace();
        }
    }
}

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

class Exercise9{
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

/*
 * Exercise:     22
 * Description:  Create a class called FailingConstructor with a constructor that
 *               might fail partway through the construction process and throw an exception. In main( ),
 *               write code that properly guards against this failure.
 */

class Exercise22 {
    Integer[] ia = new Integer[2];
    String s;
    Exercise22(){

    }

    Exercise22(String s) throws Exception {
        ia[0] = 0;
        ia[1] = 1;
        ia[2] = 2;
        this.s = s;
    }
    public static void main(String[] args) {
        Exercise22 obj = new Exercise22();
        try {
            obj = new Exercise22("hi");
        } catch(Exception e) {
            System.err.println("Caught Exception in main()");
            e.printStackTrace(System.err);
        } finally {
            System.out.println(obj.s);
        }
    }
}

/*
 * Exercise:     25
 * Description:  Create a three-level hierarchy of exceptions. Now create a base-class A
 *               with a method that throws an exception at the base of your hierarchy. Inherit B from A and
 *               override the method so it throws an exception at level two of your hierarchy. Repeat by
 *               inheriting class C from B. In main( ), create a C and upcast it to A, then call the method.
 */

class LevelOneException extends Exception {}
class LevelTwoException extends LevelOneException {}
class LevelThreeException extends LevelTwoException {}

class A {
    void f() throws LevelOneException {
        throw new LevelOneException();
    }
}

class B extends A {
    void f() throws LevelTwoException {
        throw new LevelTwoException();
    }
}

class C extends B {
    void f() throws LevelThreeException {
        throw new LevelThreeException();
    }
}

class Exercise25 {
    public static void main(String[] args) {
        A a = new C();
        try {
            a.f();
        }	catch(LevelThreeException e3) {
            System.out.println("Caught e3");
        }	catch(LevelTwoException e2) {
            System.out.println("Caught e2");
        }	catch(LevelOneException e1) {
            System.out.println("Caught e1");
        }
    }
}