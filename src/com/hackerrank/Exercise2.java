package com.hackerrank;
import java.util.List;

/**
 * Description: Given an array of integers, find the sum of its elements.
 * @author Argishti_Tigranyan
 */

public class Exercise2 {
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for(Integer element: ar){
            sum += element;
        }
        return sum;
    }
}
