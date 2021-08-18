package com.training.initializationAndCleanup;

/*
 * Exercise:    5
 * Description: Create a class called Dog with an overloaded bark( ) method. This
 *              method should be overloaded based on various primitive data types, and print different types
 *              of barking, howling, etc., depending on which overloaded version is called. Write a main( )
 *              that calls all the different versions.
 */

public class Exercise5 {
    public static void main(String[] args) {
        Dog.bark();
        Dog.bark((byte) 10);
        Dog.bark((short) 10);
        Dog.bark(10);
        Dog.bark(10L);
    }
}

class Dog {

    public static void bark() {
        System.out.println("lowest 'haf' ");
    }

    public static void bark(byte quantityOfBarks) throws IllegalArgumentException {
        if (quantityOfBarks < 0) {
            throw new IllegalArgumentException("a dog can not bark negative times");
        }
        while (quantityOfBarks > 0) {
            System.out.print("lower 'haf' ");
            quantityOfBarks--;
        }
        System.out.println();
    }

    public static void bark(short quantityOfBarks) {
        if (quantityOfBarks < 0) {
            throw new IllegalArgumentException("a dog can not bark negative times");
        }
        while (quantityOfBarks > 0) {
            System.out.print("low 'haf' ");
            quantityOfBarks--;
        }
        System.out.println();
    }

    public static void bark(int quantityOfBarks) {
        if (quantityOfBarks < 0) {
            throw new IllegalArgumentException("a dog can not bark negative times");
        }
        while (quantityOfBarks > 0) {
            System.out.print("haf ");
            quantityOfBarks--;
        }
        System.out.println();
    }

    public static void bark(long quantityOfBarks) {
        if (quantityOfBarks < 0) {
            throw new IllegalArgumentException("a dog can not bark negative times");
        }
        while (quantityOfBarks > 0) {
            System.out.print("high 'haf' ");
            quantityOfBarks--;
        }
        System.out.println();
    }
}
