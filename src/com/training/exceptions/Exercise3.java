package com.training.exceptions;

/*
 * Exercise:     3
 * Description:  Write code to generate and catch an ArrayIndexOutOfBoundsException.
 */

public class Exercise3 {
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
