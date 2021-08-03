package com.training.holdingYourObjects;

import java.util.PriorityQueue;

/*
 * Exercise:    29
 * Description: Create a simple class that inherits from Object and contains no
 *              members, and show that you cannot successfully add multiple elements of that class to a
 *              PriorityQueue. This issue will be fully explained in the Containers in Depth chapter.
 */

public class Exercise29 {
    public static void main(String[] args) {
        PriorityQueue<Simple> s = new PriorityQueue<Simple>();
        // OK to add one Simple:
        s.offer(new Simple());
        // but no more allowed; get runtime exception:
        // Simple cannot be cast to Comparable:
        s.offer(new Simple());
    }
}
