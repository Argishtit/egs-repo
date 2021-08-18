package com.training.holdingYourObjects;

/*
 * Exercise:     2
 * Description:  Modify SimpleCollection.java to use a Set for c.
 *
 */

import java.util.HashSet;
import java.util.Set;

class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<Integer>();
        for (int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for (Integer i : c)
            System.out.print(i + ", ");
    }
}

public class Exercise2 {
}
