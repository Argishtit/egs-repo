package com.training.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise:        27
 * Description:     Show that covariance does not work with Lists, using Numbers and
 *                  Integers, then introduce wildcards.
 *
 * @author          Argishti_Tigranyan
 */

public class Exercise27 {
    public static void main(String[] args) {
        // generates compile error
        // List<Number> numbers = new ArrayList<Integer>();

        // can't add new Integer()
        List<? extends Number> numbers = new ArrayList<Integer>();
        //numbers.add(new Integer(10));

        numbers.add(null);
        Number x = numbers.get(0);

    }
}
