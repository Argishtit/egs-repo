package com.hackerrank;

import java.util.List;

/**
 * Description: In this challenge, you are required to calculate and print the sum of the elements in an array,
 *              keeping in mind that some of those integers may be quite large.
 * @author Argishti_Tigranyan
 */

public class Exercise4 {
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0L;

        for(Long element: ar){
            sum += element;
        }

        return sum;
    }
}
