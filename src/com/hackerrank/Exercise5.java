package com.hackerrank;
import java.util.List;

/**
 * Description: Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 *              For example, the square matrix arr is shown below:
 *              1 2 3
 *              4 5 6
 *              9 8 9
 *
 * @author Argishti_Tigranyan
 */

public class Exercise5 {
    public static int diagonalDifference(List<List<Integer>> arr) {

        int leftDiagonal = 0;
        int rightDiagonal = 0;
        int i;
        int j = arr.get(0).size()-1;

        for (i = 0; i < arr.size(); i++) {
            leftDiagonal += arr.get(i).get(i);
            while (j >= 0){
                rightDiagonal += arr.get(j).get(i);
                j--;
                break;
            }
        }

        int difference = leftDiagonal - rightDiagonal;

        if (difference < 0) {
            return -1 * difference;
        }
        return difference;
    }
}
