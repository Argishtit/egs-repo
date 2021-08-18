package com.training.innerClasses;

/*
 * Exercise:      15
 *
 * Description:   Create a class with a non-default constructor (one with arguments) and
 *                no default constructor (no "no-arg" constructor). Create a second class that has a method
 *                that returns a reference to an object of the first class. Create the object that you return by
 *                making an anonymous inner class that inherits from the first class.
 */

public class Exercise15 {
    public static void main(String[] args) {
        E e = new E();
        System.out.println(e.returnRef("E's inner anonymous").getClassName());
    }
}

class D {

    private String className;

    public String getClassName() {
        return this.className;
    }

    public D(String className) {
        this.className = className;
    }
}

class E {
    D returnRef(String s) {
        return new D(s) {
        };
    }
}