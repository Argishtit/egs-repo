package com.hackerrank;

import java.util.List;

/**
 * Description: You are in charge of the cake for a child's birthday. You have decided the cake
 *              will have one candle for each year of their total age. They will only be able to blow
 *              out the tallest of the candles. Count how many candles are tallest.
 *
 * @author Argishti_Tigranyan
 */

public class Exercise9 {
    public static int birthdayCakeCandles(List<Integer> candles) {

        int tallest = candles.get(0);
        int tallestCount = 0;

        for(Integer x: candles){
            if(tallest < x){
                tallest = x;
            }
        }

        for(Integer x: candles){
            if(tallest == x){
                tallestCount++;
            }
        }

        return tallestCount;

    }
}
