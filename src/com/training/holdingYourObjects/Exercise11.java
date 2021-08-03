package com.training.holdingYourObjects;

/*
 * Exercise:     11
 * Description:  Write a method that uses an Iterator to step through a Collection and
 *               print the toString( ) of each object in the container. Fill all the different types of
 *               Collections with objects and apply your method to each container
 */

import java.util.*;

class JustForTheMethod {

    public static void stepThrough(Collection c) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}

public class Exercise11 {
    public static void main(String[] args) {
        ArrayList<Integer> al =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        LinkedList<Character> ll =
                new LinkedList<Character>(Arrays.asList('a', 'b', 'c'));
        HashSet<Float> hs =
                new HashSet<Float>(Arrays.asList(1.1f, 2.2f, 3.3f));
        TreeSet<Double> ts =
        new TreeSet<Double>(Arrays.asList(1.11, 2.22, 3.33));
        LinkedHashSet<Integer> lhs =
                new LinkedHashSet<Integer>(Arrays.asList(11, 22, 33));

        JustForTheMethod.stepThrough(al);
        JustForTheMethod.stepThrough(ll);
        JustForTheMethod.stepThrough(hs);
        JustForTheMethod.stepThrough(ts);
        JustForTheMethod.stepThrough(lhs);
    }
}
