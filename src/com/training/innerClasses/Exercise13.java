package com.training.innerClasses;

/*
 * Exercise:      13
 *
 * Description:   Repeat Exercise 9 using an anonymous inner class.
 *                (Create an interface with at least one method, and implement that
 *                interface by defining an inner class within a method, which returns a reference to your
 *                interface.)
 */

public class Exercise13 {
    public static void main(String[] args) {
        C c = new C();
        c.action("I am anonymous").showInformation();
    }
}

interface AtLeast {
    public void showInformation();
}

class C {
    public AtLeast action(String s) {
        return new AtLeast() {
            @Override
            public void showInformation() {
                System.out.println("The information which I want to show is: " + s);
            }
        };
    }
}