package com.training.interfaces;

/*
 * Exercise:    7
 * Description: Change Exercise 9 in the Polymorphism chapter so that Rodent is an interface.
 *
 */

interface Rodent2 {

    abstract public void climb();

    abstract public void eat();
}

class Mouse2 implements Rodent2 {

    Mouse2() {
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

class Gerbil2 implements Rodent2 {

    Gerbil2() {
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

class Hamster2 implements Rodent2 {

    Hamster2() {
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

class WhiteMouse2 extends Mouse2 {

    Gerbil2 gerbil = new Gerbil2();
    Mouse2 mouse = new Mouse2();
    Hamster2 hamster = new Hamster2();

    WhiteMouse2() {
        System.out.println("Hello from WhiteMouse");
    }
}

public class Exercise7 {
}
