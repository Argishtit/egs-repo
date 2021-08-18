package com.training.polymorphism;

/*
 * Exercise:    9
 * Description: Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,
 *              etc. In the base class, provide methods that are common to all Rodents, and override these
 *              in the derived classes to perform different behaviors depending on the specific type of
 *              Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call
 *              your base-class methods to see what happens.
 */

import java.util.Random;

class Rodent1 {
    public void climb() {
        System.out.println("Rodent is climbing");
    }

    public void eat() {
        System.out.println("Rodent is eating");
    }
}

class Mouse1 extends Rodent1 {
    @Override
    public void climb() {
        System.out.println("Mouse is climbing");
    }

    @Override
    public void eat() {
        System.out.println("Mouse is eating");
    }
}

class Gerbil1 extends Rodent1 {
    @Override
    public void climb() {
        System.out.println("Gerbil is climbing");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil is eating");
    }
}

class Hamster1 extends Rodent1 {
    @Override
    public void climb() {
        System.out.println("Hamster is climbing");
    }

    @Override
    public void eat() {
        System.out.println("Hamster is eating");
    }
}

class RandomRodentGenerator1 {
    private Random rand = new Random(47);

    public Rodent1 next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Gerbil1();
            case 1:
                return new Hamster1();
            case 2:
                return new Mouse1();
        }
    }
}

public class Exercise9 {
    public static void main(String[] args) {
        RandomRodentGenerator1 gen = new RandomRodentGenerator1();
        Rodent1[] r = new Rodent1[9];
        for (int i = 0; i < r.length; i++){
            r[i] = gen.next();
        }

        for (Rodent1 rodents: r){
            rodents.climb();
            rodents.eat();
        }
    }
}
