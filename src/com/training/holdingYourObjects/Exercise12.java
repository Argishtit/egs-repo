package com.training.holdingYourObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/*
 * Exercise:     12
 * Description:  Create and populate a List<Integer>. Create a second List<Integer>
 *               of the same size as the first, and use ListIterators to read elements from the first List and
 *               insert them into the second in reverse order. (You may want to explore a number of different
 *               ways to solve this problem.)
 */

public class Exercise12 {
    public static void main(String[] args) {
        List<Integer> firstOne = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15));
        List<Integer> secondOne = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        ListIterator it1 = firstOne.listIterator(firstOne.size());
        ListIterator it2 = secondOne.listIterator();

        while(it1.hasPrevious()){
            it2.next();
            it2.set(it1.previous());
        }

        for (Integer x: secondOne){
            System.out.println(x);
        }
    }
}
