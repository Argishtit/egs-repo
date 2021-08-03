package com.training.innerClasses;

/*
 * Exercise:     23
 *
 * Description: Create an interface U with three methods. Create a class A with a
 *              method that produces a reference to a U by building an anonymous inner class. Create a
 *              second class B that contains an array of U. B should have one method that accepts and stores
 *              a reference to a U in the array, a second method that sets a reference in the array (specified
 *              by the method argument) to null, and a third method that moves through the array and calls
 *              the methods in U. In main( ), create a group of A objects and a single B. Fill the B with U
 *              references produced by the A objects. Use the B to call back into all the A objects. Remove
 *              some of the U references from the B.
 */

import java.util.Random;

public class Exercise23 {
    public static void main(String[] args) {
        Aa firstObj = new Aa();
        Aa secondObj = new Aa();
        Aa thirdObj = new Aa();
        Aa fourthObj = new Aa();
        Aa fifthObj = new Aa();

        B firstB = new B();

        firstB.storeElements(firstObj.referenceProducer());
        firstB.storeElements(secondObj.referenceProducer());
        firstB.storeElements(thirdObj.referenceProducer());
        firstB.storeElements(fourthObj.referenceProducer());
        firstB.storeElements(fifthObj.referenceProducer());           // EXERCISE 23 (from line 61 to 88)

        Random rand = new Random(47);

        for (U elem: B.arrayOfU) {
            firstB.caller(elem, rand.nextInt(10));
        }

        firstB.setNull(4);
        firstB.setNull(0);
        System.out.println();
        System.out.println("After setting null a random reference");
        System.out.println();
        for (U elem: B.arrayOfU) {
            firstB.caller(elem, rand.nextInt(10));
        }
    }
}

interface U {
    public void displayWord(int i);

    public void displayInformation();

    public void greeting();
}

class Aa {
    public U referenceProducer() {
        return new U() {
            @Override
            public void displayWord(int i) {
                System.out.println(i);
            }

            @Override
            public void displayInformation() {
                System.out.println("You see this due to anonymous inner class");
            }

            @Override
            public void greeting() {
                System.out.println("Barev dzeez!!!");
            }
        };
    }
}

class B {
    static U[] arrayOfU = new U[5];
    static int i = 0;

    public void storeElements(U u) {
        if (i < 5) {
            arrayOfU[i] = u;
            i++;
        } else {
            System.out.println("No more place for the objects");
        }
    }

    public void setNull(int i) {
        if (i < 0 || i > 5) {
            System.out.println("Wrong index Error");
        } else {
            arrayOfU[i] = null;
        }
    }

    public void caller(U u, int i) {
        if (u != null) {
            u.displayInformation();
            u.displayWord(i);
            u.greeting();
        } else {
            System.out.println("Can't call some method sorry\n");
        }
    }
}