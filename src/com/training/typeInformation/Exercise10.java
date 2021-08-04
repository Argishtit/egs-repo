package com.training.typeInformation;

/*
 * Exercise:      10
 * Description:   Write a program to determine whether an array of char is a primitive
 *                type or a true Object.
 */

public class Exercise10 {
    public static void main(String[] args) {
        char[] c = new char[10];
        // c is an Object:
        System.out.println("Superclass of char[] c: " +
                c.getClass().getSuperclass());
        System.out.println("char[] c instanceof Object: " +
                (c instanceof Object));
    }
}
