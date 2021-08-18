package com.training.exceptions;

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

public class Exercise4 {
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
