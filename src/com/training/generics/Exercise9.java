package com.training.generics;

/**
 * Exercise:         9
 * Description:      Modify GenericMethods.java so that f( ) accepts three arguments, all
 *                   of which are of a different parameterized type.
 *
 */

class GenericMethods {
    public <T, Y, U> void f(T t, Y y, U u) {
        System.out.println(t.getClass().getName());
        System.out.println(y.getClass().getName());
        System.out.println(u.getClass().getName());
    }
}

public class Exercise9 {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("Hello", 100, true);
    }
}
