package com.training.holdingYourObjects;

/*
 * Exercise:     1
 * Description:  Create a new class called Gerbil with an int gerbilNumber that’s
 *               initialized in the constructor. Give it a method called hop( ) that displays which gerbil
 *               number this is, and that it’s hopping. Create an ArrayList and add Gerbil objects to the
 *               List. Now use the get( ) method to move through the List and call hop( ) for each Gerbil.
 */

import java.util.ArrayList;
import java.util.List;

class Gerbil {
    private int gerbilNumber;

    Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("Gerbil's number: " + this.gerbilNumber);
        System.out.println("This gerbil is hoping");
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        List<Gerbil> groupOfGerbil = new ArrayList<>();

        for (int i = 1; i < 11; i++){
            groupOfGerbil.add(new Gerbil(i));
        }

        for (int i = 0; i < 10; i++){
            groupOfGerbil.get(i).hop();
        }
    }
}
