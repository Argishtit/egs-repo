package com.training.innerClasses;

/*
 * Exercise:    3
 *
 * Description: Modify Exercise 1 so that Outer has a private String field (initialized
 *              by the constructor), and Inner has a toString( ) that displays this field. Create an object of
 *              type Inner and display it.
 */

public class Exercise3 {
    public static void main(String[] args) {
          Outer2 outer = new Outer2("My name is Outer");
          Outer2.Inner inner = outer.returnInnersObject();
          System.out.println(inner.toString());
    }
}

class Outer2 {

    private String className;

    Outer2(String className) {
        this.className = className;
    }

    class Inner {
        @Override
        public String toString() {
            return className;
        }
    }

    public Inner returnInnersObject() {
        return new Inner();
    }
}