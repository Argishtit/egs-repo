package com.training.exceptions;

/*
 * Exercise:     2
 * Description:  Define an object reference and initialize it to null. Try to call a method
 *               through this reference. Now wrap the code in a try-catch clause to catch the exception.
 */

public class Exercise2 {
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
