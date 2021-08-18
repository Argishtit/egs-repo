package com.training.polymorphism;

/*
 * Exercise:    12
 * Description: Modify Exercise 9 so that it demonstrates the order of initialization of
 *              the base classes and derived classes. Now add member objects to both the base and derived
 *              classes and show the order in which their initialization occurs during construction.
 */

class Rodent {

    Hamster hamster = new Hamster();

    Rodent(){
        System.out.println("Hello from Rodent");
    }

    public void climb() {
        System.out.println("Rodent is climbing");
    }

    public void eat() {
        System.out.println("Rodent is eating");
    }
}

class Mouse extends Rodent {

    Mouse(){
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

    Gerbil(){
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

    Hamster(){
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

class WhiteMouse extends Mouse{

    Gerbil gerbil = new Gerbil();
    Mouse mouse = new Mouse();
    Hamster hamster = new Hamster();

    WhiteMouse(){
        System.out.println("Hello from WhiteMouse");
    }
}

public class Exercise12 {
    public static void main(String[] args) {
        new WhiteMouse();
    }
}
