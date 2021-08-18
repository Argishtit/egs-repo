package com.training.holdingYourObjects;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Exercise:     14
 * Description:  Create an empty LinkedList<Integer>. Using a ListIterator, add
 *               Integers to the List by always inserting them in the middle of the List.
 *
 */

public class Exercise14 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ListIterator listIterator = ll.listIterator(ll.size()/2);
        for(int i = 0; i < 10; i++){
            listIterator.add(i);
        }
    }
}
