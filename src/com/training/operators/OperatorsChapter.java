package com.training.operators;

/**
 * Description: This class is designed for covering the most part of the exercises from the ThinkingInJava4e book.
 *              Each exercise represents a public static method and each description of exercise is written above
 *              the method.
 * Chapter:     Operators
 * @author      Argishti_tigranyan
 */

public class OperatorsChapter {

    /*
     * Exercise:    7
     * Description: Write a program that simulates coin-flipping.
     */

    public static void coinFlipping() {
        if (Math.random() > 0.5) {
            System.out.println("Tails");
        } else {
            System.out.println("Heads");
        }
    }

    /*
     * Exercise:     10
     * Description:  Write a program with two constant values, one with alternating binary
     *               ones and zeroes, with a zero in the least-significant digit, and the second, also alternating,
     *               with a one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for
     *               this). Take these two values and combine them in all possible ways using the bitwise
     *               operators, and display the results using Integer.toBinaryString( ).
     */

    public static void bitwiseOperators(){
        int firstNumber = 0b11111110;
        int secondNumber = 0b00000011;

        System.out.println(firstNumber+" & "+secondNumber+": "+(Integer.toBinaryString(firstNumber & secondNumber)));
        System.out.println(firstNumber+" | "+secondNumber+": "+(Integer.toBinaryString(firstNumber | secondNumber)));
        System.out.println(firstNumber+" ^ "+secondNumber+": "+(Integer.toBinaryString(firstNumber ^ secondNumber)));
        System.out.println(firstNumber+" << "+secondNumber+": "+(Integer.toBinaryString(firstNumber << secondNumber)));
        System.out.println(firstNumber+" >> "+secondNumber+": "+(Integer.toBinaryString(firstNumber >> secondNumber)));
    }

    /*
     * Exercise:     11
     * Description:  Start with a number that has a binary one in the most significant
     *               position (hint: Use a hexadecimal constant). Using the signed right-shift operator, right shift
     *               it all the way through all of its binary positions, each time displaying the result using
     *               Integer.toBinaryString( ).
     */

    public static void rightShift(){

        int binaryNumber = 0b10000000;

        for (int i = 0; i < 8; i++) {
            binaryNumber >>>= 1;
            System.out.println(Integer.toBinaryString(binaryNumber));
        }
    }

    /*
     * Exercise:    12
     * Description: Start with a number that is all binary ones. Left shift it, then use the
     *              unsigned right-shift operator to right shift through all of its binary positions, each time
     *              displaying the result using Integer.toBinaryString( )
     */

    public static void shifting(){

        int binaryNumber = 0b11111111;
        System.out.println(Integer.toBinaryString(binaryNumber));
        binaryNumber <<= 1;
        System.out.println(Integer.toBinaryString(binaryNumber));

        for(int i = 0; i < 9; i++){
            binaryNumber >>>= 1;
            System.out.println(Integer.toBinaryString(binaryNumber));
        }
    }

    /*
     * Exercise:     13
     * Description:  Write a method that displays char values in binary form. Demonstrate
     *               it using several different characters.
     */

    public static void charToBinary(){
        char c = 'a';
        for (; c <= 'z'; c++){
            System.out.println("Binary representation of the symbol "+c+" is: "+Integer.toBinaryString(c));
        }
    }

    /*
     * Exercise:    14
     * Description: Write a method that takes two String arguments and uses all the
     *              boolean comparisons to compare the two Strings and print the results. For the == and !=,
     *              also perform the equals( ) test. In main( ), call your method with some different String
     *              objects.
     */

    public static void relationsOfStrings(String firstString, String secondString){
        System.out.println(firstString+" == "+secondString+": "+(firstString == secondString));
        System.out.println(firstString+" != "+secondString+": "+(firstString != secondString));
        System.out.println(firstString+" equals() "+secondString+": "+(firstString.equals(secondString)));
    }
}
