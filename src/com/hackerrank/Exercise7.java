package com.hackerrank;

/**
 * Description: Staircase detail
 *              This is a staircase of size = 4:
 *
 *                 #
 *                ##
 *               ###
 *              ####
 *
 *              Its base and height are both equal to n. It is drawn using # symbols and spaces.
 *              The last line is not preceded by any spaces.
 *
 *              Write a program that prints a staircase of size n.
 *
 * @author Argishti_Tigranyan
 */

public class Exercise7 {
    public static void staircase(int n) {

        int j = 1;
        int l = n;

        for (int i = 0; i < l; i++) {
            int m = n;
            while (m > 1) {
                System.out.print(" ");
                m--;
            }

            int k = j;
            while (k > 0) {
                System.out.print("#");
                k--;
            }
            n--;
            j++;
            System.out.println();
        }
    }
}
