package com.training.interfaces;

/*
 * Exercise:    1
 * Description: Modify Exercise 9 in the previous chapter so that com.company.Rodent is an abstract
 *              class. Make the methods of com.company.Rodent abstract whenever possible.
 *
 */

abstract class Rodent {

    abstract public void climb();

    abstract public void eat();
}

class Mouse extends Rodent {

    Mouse() {
        System.out.println("Hello from Mouse");
    }

    @Override
    public void climb() {
        System.out.println("Mouse is climbing");
    }

    @Override
    public void eat() {
        System.out.println("Mouse is eating");
    }
}

class Gerbil extends Rodent {

    Gerbil() {
        System.out.println("Hello from Gerbil");
    }

    @Override
    public void climb() {
        System.out.println("Gerbil is climbing");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil is eating");
    }
}

class Hamster extends Rodent {

    Hamster() {
        System.out.println("Hello from Hamster");
    }

    @Override
    public void climb() {
        System.out.println("Hamster is climbing");
    }

    @Override
    public void eat() {
        System.out.println("Hamster is eating");
    }
}

class WhiteMouse extends Mouse {

    Gerbil gerbil = new Gerbil();
    Mouse mouse = new Mouse();
    Hamster hamster = new Hamster();

    WhiteMouse() {
        System.out.println("Hello from WhiteMouse");
    }
}

public class Exercise1 {
}
