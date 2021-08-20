package com.hackerrank;

/**
 * Description: Watson likes to challenge Sherlock's math ability. He will provide a starting and
 *              ending value that describe a range of integers, inclusive of the endpoints. Sherlock
 *              must determine the number of square integers within that range.
 *
 * @author Argishti_Tigranyan
 */

public class Exercise11 {

    public static int squares(int a, int b) {

        int count = 0;
        int first = 0;
        int second;

        for (int i = a; i <= b; i++) {
            if ((int) (Math.sqrt(i)) * (int) (Math.sqrt(i)) == i && first == 0) {
                first = i;
                count++;
            } else if ((int) (Math.sqrt(i)) * (int) (Math.sqrt(i)) == i && first != 0) {
                second = first;
                first = i;
                i = i + (first - second) + 1;
                count++;
            }
        }
        return count;
    }
}
