package com.training.holdingYourObjects;

import java.util.PriorityQueue;
import java.util.Random;

/*
 * Exercise:    28
 * Description: Fill a PriorityQueue (using offer( )) with Double values created
 *              using java.util.Random, then remove the elements using poll( ) and display them.
 */

public class Exercise28 {
    public static void main(String[] args) {
        Random rand = new Random();
        PriorityQueue<Double> d = new PriorityQueue<Double>();
        for(int i = 0; i < 10; i++)
        d.offer(rand.nextDouble() * i);
        while(d.peek() != null)
            System.out.print(d.poll() + " ");
    }
}
