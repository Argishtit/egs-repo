package com.hackerrank;

import java.util.List;

/**
 * Description: Given five positive integers, find the minimum and maximum values that can
 *              be calculated by summing exactly four of the five integers. Then print the respective
 *              minimum and maximum values as a single line of two space-separated long integers.
 *
 * @author Argishti_Tigranyan
 */

public class Exercise8 {
    public static void miniMaxSum(List<Integer> arr) {

        int min = arr.get(0);
        int max = arr.get(0);

        for(Integer x: arr){
            if(x < min){
                min = x;
            }
            if(x > max){
                max = x;
            }
        }

        long sum = 0;
        for(Integer x: arr){
            sum += x;
        }

        System.out.print((sum-max)+" "+(sum-min));


    }
}
