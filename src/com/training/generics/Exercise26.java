package com.training.generics;

/**
 * Exercise:        26
 * Description:     Demonstrate array covariance using Numbers and Integers.
 *
 * @author          Argishti_Tigranyan
 */

public class Exercise26 {
    public static void main(String[] args) {
        Number[] numbers = new Integer[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i;
        }

        for (Number x: numbers){
           System.out.print(x+" ");
        }
        System.out.println();

        try {
            numbers[0] = new Double(20.1);
        }
        catch (ArrayStoreException e){
            System.out.println(e);
        }
        System.out.println();
        for (Number x: numbers){
            System.out.println(x.getClass().getSimpleName());
        }

    }
}
