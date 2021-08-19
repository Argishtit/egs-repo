package com.hackerrank;

import java.util.List;

/**
 * Description: Given an array of integers, calculate the ratios of its elements that are positive,
 * negative, and zero. Print the decimal value of each fraction on a new line with
 * places after the decimal.
 *
 * @author Argishti_Tigranyan
 */

public class Exercise6 {
    public static void plusMinus(List<Integer> arr) {

        double positive = 0;
        double negative = 0;
        double zero = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                zero++;
            } else if (arr.get(i) < 0) {
                negative++;
            } else {
                positive++;
            }
        }

        System.out.println(positive / arr.size());
        System.out.println(negative / arr.size());
        System.out.println(zero / arr.size());

    }
}
