package com.training.polymorphism;

import java.util.Random;

/**
 * Description: This file is designed for covering the exercises from the book ThinkingInJava4e.
 * Chapter:     Polymorphism
 *
 * @author Argishti_Tigranyan
 */

public class Polymorphism {
}

/*
 * Exercise:    1
 * Description: Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 *              Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
 *
 */

//class Cycle {
//
//    String className = "Cycle";
//
//    public static void ride(Cycle cycle) {
//        cycle.printClassname();
//    }
//
//    public void printClassname() {
//        System.out.println("Riding a cycle");
//    }
//}
//
//
//class Unicycle extends Cycle {
//    public void printClassname() {
//        System.out.println("Riding a unicycle");
//    }
//}
//
//class Bicycle extends Cycle {
//    public void printClassname() {
//        System.out.println("Riding a bicycle");
//    }
//}
//
//class Tricycle extends Cycle {
//    public void printClassname() {
//        System.out.println("Riding a tricycle");
//    }
//}

/*
 * Exercise:    2
 * Description: Add the @Override annotation to the shapes example
 *
 */

class Shape {
    public void draw() {
    }

    public void erase() {
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}

class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}

/*
 * Exercise:    9
 * Description: Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,
 *              etc. In the base class, provide methods that are common to all Rodents, and override these
 *              in the derived classes to perform different behaviors depending on the specific type of
 *              Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call
 *              your base-class methods to see what happens.
 */

//class Rodent {
//    public void climb() {
//        System.out.println("Rodent is climbing");
//    }
//
//    public void eat() {
//        System.out.println("Rodent is eating");
//    }
//}
//
//class Mouse extends Rodent {
//    @Override
//    public void climb() {
//        System.out.println("Mouse is climbing");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("Mouse is eating");
//    }
//}
//
//class Gerbil extends Rodent {
//    @Override
//    public void climb() {
//        System.out.println("Gerbil is climbing");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("Gerbil is eating");
//    }
//}
//
//class Hamster extends Rodent {
//    @Override
//    public void climb() {
//        System.out.println("Hamster is climbing");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("Hamster is eating");
//    }
//}

class RandomRodentGenerator {
    private Random rand = new Random(47);

    public Rodent next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Gerbil();
            case 1:
                return new Hamster();
            case 2:
                return new Mouse();
        }
    }
}

/*
 * Exercise:    10
 * Description: Create a base class with two methods. In the first method, call the
 *              second method. Inherit a class and override the second method. Create an object of the
 *              derived class, upcast it to the base type, and call the first method. Explain what happens.
 */

class Base {
    public void methodCaller() {
        printMessage();
    }

    public void printMessage() {
        System.out.println("Hello from the base class");
    }
}

class Derived extends Base {
    @Override
    public void printMessage() {
        System.out.println("Hello from derived class");
    }
}

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

/*
 * Exercise:    17
 * Description: Using the Cycle hierarchy from Exercise 1, add a balance( ) method to
 *              Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast
 *              them to an array of Cycle. Try to call balance( ) on each element of the array and observe what
 *              happens.
 */

class Cycle {

    String className = "Cycle";

    public static void ride(Cycle cycle) {
        cycle.printClassname();
    }

    public void printClassname() {
        System.out.println("Riding a cycle");
    }
}


class Unicycle extends Cycle {
    public void printClassname() {
        System.out.println("Riding a unicycle");
    }
}

class Bicycle extends Cycle {
    public void printClassname() {
        System.out.println("Riding a bicycle");
    }

    public void balance(){
        System.out.println("Balancing bicycle.");
    }
}

class Tricycle extends Cycle {
    public void printClassname() {
        System.out.println("Riding a tricycle");
    }

    public void balance(){
        System.out.println("Balancing tricycle.");
    }
}