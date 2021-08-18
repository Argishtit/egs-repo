package com.training.initializationAndCleanup;

/*
 * Exercise:    6
 * Description: Modify the previous exercise so that two of the overloaded methods have
 *              two arguments (of two different types), but in reversed order relative to each other. Verify
 *              that this works.
 *
 */

public class Exercise6 {
    public static void main(String[] args) {
        ModifiedDog.bark(true, 2);
        ModifiedDog.bark(2, true);
    }
}

class ModifiedDog {
    public static void bark() {
        System.out.println("lowest 'haf' ");
    }

    public static void bark(byte quantityOfBarks) throws IllegalArgumentException {
        if (quantityOfBarks <= 0) {
            throw new IllegalArgumentException("a dog can not bark negative times");
        }
        while (quantityOfBarks > 0) {
            System.out.print("lower 'haf' ");
            quantityOfBarks--;
        }
        System.out.println();
    }

    public static void bark(short quantityOfBarks) throws IllegalArgumentException {
        if (quantityOfBarks <= 0) {
            throw new IllegalArgumentException("a dog can not bark negative times");
        }
        while (quantityOfBarks > 0) {
            System.out.print("low 'haf' ");
            quantityOfBarks--;
        }
        System.out.println();
    }

    public static void bark(int quantityOfBarks) throws IllegalArgumentException {
        if (quantityOfBarks <= 0) {
            throw new IllegalArgumentException("a dog can not bark negative times");
        }
        while (quantityOfBarks > 0) {
            System.out.print("haf ");
            quantityOfBarks--;
        }
        System.out.println();
    }

    public static void bark(long quantityOfBarks) throws IllegalArgumentException {
        if (quantityOfBarks <= 0) {
            throw new IllegalArgumentException("a dog can not bark negative times");
        }
        while (quantityOfBarks > 0) {
            System.out.print("high 'haf' ");
            quantityOfBarks--;
        }
        System.out.println();
    }

    public static void bark(boolean hafOrBark, int quantityOfBarks) throws IllegalArgumentException {
        if (quantityOfBarks <= 0) {
            throw new IllegalArgumentException("a dog can not bark negative times");
        }
        if (hafOrBark) {
            while (quantityOfBarks > 0) {
                System.out.print("haf ");
                quantityOfBarks--;
            }
        } else {
            while (quantityOfBarks > 0) {
                System.out.print("bark ");
                quantityOfBarks--;
            }
        }
        System.out.println();
    }

    public static void bark(int quantityOfBarks, boolean barkOrHaf) throws IllegalArgumentException {
        if (quantityOfBarks <= 0) {
            throw new IllegalArgumentException("a dog can not bark negative times");
        }
        if (barkOrHaf) {
            while (quantityOfBarks > 0) {
                System.out.print("bark ");
                quantityOfBarks--;
            }
        } else {
            while (quantityOfBarks > 0) {
                System.out.print("haf ");
                quantityOfBarks--;
            }
        }
        System.out.println();
    }
}