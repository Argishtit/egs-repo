package com.training.controllingExecution;

import java.util.Random;

/**
 * Description: This class is designed for covering the most part of the exercises from the ThinkingInJava4e book.
 * Each exercise represents a public static method and each description of exercise is written above
 * the method.
 * Chapter:     Controlling Execution
 *
 * @author Argishti_tigranyan
 */

public class ControllingExecution {

    /*
     * Exercise:    2
     * Description: Write a program that generates 25 random int values. For each value,
     *              use an if-else statement to classify it as greater than, less than, or equal to a second
     *              randomly generated value.
     */

    public static void classificationOfInts() {

        int firstInt, secondInt;
        Random random = new Random();
        for (int i = 0; i < 25; i++) {

            firstInt = random.nextInt(1000);
            secondInt = random.nextInt(1000);

            if (firstInt > secondInt) {
                System.out.println(firstInt + " is greater than " + secondInt);
            } else if (firstInt == secondInt) {
                System.out.println(firstInt + " is equal to " + secondInt);
            } else {
                System.out.println(firstInt + " is less than " + secondInt);
            }
        }
    }

    /*
     * Exercise:    3
     * Description: Modify Exercise 2 so that your code is surrounded by an “infinite” while
     *              loop. It will then run until you interrupt it from the keyboard (typically by pressing ControlC).
     *
     * Little Note: in our case we should push control+f2.
     */

    public static void infiniteClassificationOfInts() {

        Random random = new Random();

        int firstInt, secondInt;

        while (true) {

            firstInt = random.nextInt(1000);
            secondInt = random.nextInt(1000);

            if (firstInt > secondInt) {
                System.out.println(firstInt + " is greater than " + secondInt);
            } else if (firstInt == secondInt) {
                System.out.println(firstInt + " is equal to " + secondInt);
            } else {
                System.out.println(firstInt + " is less than " + secondInt);
            }
        }
    }

    /*
     * Exercise:    4
     * Description: Write a program that uses two nested for loops and the modulus
     *              operator (%) to detect and print prime numbers (integral numbers that are not evenly
     *              divisible by any other numbers except for themselves and 1).
     */

    public static void primeNumbers() {

        StringBuilder primeNumbers = new StringBuilder("");

        for (int i = 1; i <= 100; i++) {

            int counter = 0;

            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                primeNumbers.append(i).append(" ");
            }
        }

        System.out.println("Prime numbers from 1 to 100 are: " + primeNumbers);
    }

    /*
     * Exercise:    9
     * Description: A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21,
     *              34, and so on, where each number (from the third on) is the sum of the previous two. Create
     *              a method that takes an integer as an argument and displays that many Fibonacci numbers
     *              starting from the beginning, e.g., If you run java Fibonacci 5 (where Fibonacci is the
     *              name of the class) the output will be: 1, 1, 2, 3, 5.
     */

    public static void fibonacciSequence(int quantity) throws IllegalArgumentException {

        int previous = 1;
        int current = 1;
        int next = 2;

        if (quantity <= 0) {
            throw new IllegalArgumentException("The quantity must be greater or equal to 1");
        } else if (quantity == 1) {
            System.out.println(previous);
        } else if (quantity == 2) {
            System.out.println(previous + " " + current);
        } else {
            for (int i = 0; i < quantity; i++) {
                System.out.print(previous + " ");
                previous = current;
                current = next;
                next += previous;
            }
        }

    }

}
