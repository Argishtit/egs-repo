package com.training.interfaces;

/**
 * Description: This file is designed for covering the exercises from the book ThinkingInJava4e.
 * Chapter:     Polymorphism
 *
 * @author Argishti_Tigranyan
 */

public class Interfaces {
}

/*
 * Exercise:    1
 * Description: Modify Exercise 9 in the previous chapter so that com.company.Rodent is an abstract
 *              class. Make the methods of com.company.Rodent abstract whenever possible.
 *
 */

//abstract class Rodent {
//
//    abstract public void climb();
//
//    abstract public void eat();
//}
//
//class Mouse extends Rodent {
//
//    Mouse() {
//        System.out.println("Hello from Mouse");
//    }
//
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
//
//    Gerbil() {
//        System.out.println("Hello from Gerbil");
//    }
//
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
//
//    Hamster() {
//        System.out.println("Hello from Hamster");
//    }
//
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
//
//class WhiteMouse extends Mouse {
//
//    Gerbil gerbil = new Gerbil();
//    Mouse mouse = new Mouse();
//    Hamster hamster = new Hamster();
//
//    WhiteMouse() {
//        System.out.println("Hello from WhiteMouse");
//    }
//}

/*
 * Exercise:    2
 * Description: Create a class as abstract without including any abstract methods and
 *              verify that you cannot create any instances of that class.
 *
 */

abstract class Stagnation {
    Stagnation() {
        System.out.println("Hello from constructor");
    }
}

/*
 * Exercise:     3
 * Description:  Create a base class with an abstract print( ) method that is overridden
 *               in a derived class. The overridden version of the method prints the value of an int variable
 *               defined in the derived class. At the point of definition of this variable, give it a nonzero value.
 *               In the base-class constructor, call this method. In main( ), create an object of the derived
 *               type, and then call its print( ) method. Explain the results.
 */

abstract class Base {
    abstract void print();

    Base() {
        print();
    }
}

class Derived extends Base {

    int number = 7;

    @Override
    void print() {
        System.out.println("The value of the number is " + number);
    }
}

/*
 * Exercise:     4
 * Description:  Create an abstract class with no methods. Derive a class and add a
 *               method. Create a static method that takes a reference to the base class, downcasts it to the
 *               derived class, and calls the method. In main( ), demonstrate that it works. Now put the
 *               abstract declaration for the method in the base class, thus eliminating the need for the
 *               downcast.
 */

abstract class Empty{
    public abstract void printMessage();
}

class NotEmpty extends Empty{
    @Override
    public void printMessage(){
        System.out.println("Success");
    }

    static void caller(Empty empty){
        empty.printMessage();
    }
}

/*
 * Exercise:    7
 * Description: Change Exercise 9 in the Polymorphism chapter so that Rodent is an interface.
 *
 */

interface Rodent {

    abstract public void climb();

    abstract public void eat();
}

class Mouse implements Rodent {

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

class Gerbil implements Rodent {

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

class Hamster implements Rodent {

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

/*
 * Exercise:    13
 * Description: Create an interface, and inherit two new interfaces from that interface.
 *              Multiply inherit a third interface from the second two.
 *
 */

interface FirstInterface{}

interface SecondInterface extends FirstInterface{}

interface ThirdInterface extends FirstInterface{}

interface FourthInterface extends SecondInterface, ThirdInterface{}

/*
 * Exercise:     14
 * Description:  Create three interfaces, each with two methods. Inherit a new interface
 *               that combines the three, adding a new method. Create a class by implementing the new
 *               interface and also inheriting from a concrete class. Now write four methods, each of which
 *               takes one of the four interfaces as an argument. In main( ), create an object of your class
 *               and pass it to each of the methods.
 */

//interface FirstOne{
//    public void printMessage();
//    public void printNumber();
//}
//
//interface SecondOne{
//    public void printMessages();
//    public void printFloatNumber();
//}
//
//interface ThirdOne{
//    public void print();
//    public void printDoubleNumber();
//}
//
//interface FourthOne extends FirstOne, SecondOne, ThirdOne{
//    public void additionalMessage();
//}
//
//class BaseOne{
//    BaseOne(){
//        System.out.println("At first Hello from base constructor");
//    }
//}
//
//class DerivedOne extends BaseOne implements FourthOne{
//
//    DerivedOne(){
//        System.out.println("Hello from derived constructor.");
//    }
//
//    @Override
//    public void printMessage() {
//        System.out.println("Just a message.");
//    }
//
//    @Override
//    public void printNumber() {
//        System.out.println(7);
//    }
//
//    @Override
//    public void printMessages() {
//        System.out.print("Just a message. ");
//        System.out.println("Just the additional part of the first message.");
//    }
//
//    @Override
//    public void printFloatNumber() {
//        System.out.println(0.98f);
//    }
//
//    @Override
//    public void print() {
//        System.out.println("printing a sentence.");
//    }
//
//    @Override
//    public void printDoubleNumber() {
//        System.out.println(20.2999);
//    }
//
//    @Override
//    public void additionalMessage() {
//        System.out.println("Last message");
//    }
//
//    public static void firstMethod(FirstOne firstOne){
//        System.out.println("Starting the firstMethod calls");
//        System.out.print("Calling printMessage method: ");
//        firstOne.printMessage();
//        System.out.print("Calling printNumber method: ");
//        firstOne.printNumber();
//        System.out.println("Finish");
//    }
//
//    public static void secondMethod(SecondOne secondOne){
//        System.out.println("Starting the secondMethod calls");
//        System.out.print("Calling printMessages method: ");
//        secondOne.printMessages();
//        System.out.print("Calling printFloatNumber method: ");
//        secondOne.printFloatNumber();
//        System.out.println("Finish");
//    }
//
//    public static void thirdMethod(ThirdOne thirdOne){
//        System.out.println("Starting the thirdMethod calls");
//        System.out.print("Calling print method: ");
//        thirdOne.print();
//        System.out.print("Calling printDoubleNumber method: ");
//        thirdOne.printDoubleNumber();
//        System.out.println("Finish");
//    }
//
//    public static void fourthMethod(FourthOne fourthOne){
//        System.out.println("Starting the fourthMethod calls");
//        System.out.print("Calling print method: ");
//        fourthOne.print();
//        System.out.print("Calling printMessage method: ");
//        fourthOne.printMessage();
//        System.out.print("Calling printMessages method: ");
//        fourthOne.printMessages();
//        System.out.print("Calling printDoubleNumber method: ");
//        fourthOne.printDoubleNumber();
//        System.out.print("Calling printFloatNumber method: ");
//        fourthOne.printFloatNumber();
//        System.out.print("Calling printNumber method: ");
//        fourthOne.printNumber();
//        System.out.print("Calling additionalMessage method: ");
//        fourthOne.additionalMessage();
//        System.out.println("Finish");
//    }
//}

/*
 * Exercise:     15
 * Description:  Modify the previous exercise by creating an abstract class and
 *               inheriting that into the derived class.
 */

interface FirstOne{
    public void printMessage();
    public void printNumber();
}

interface SecondOne{
    public void printMessages();
    public void printFloatNumber();
}

interface ThirdOne{
    public void print();
    public void printDoubleNumber();
}

interface FourthOne extends FirstOne, SecondOne, ThirdOne{
    public void additionalMessage();
}

abstract class BaseOne{
    BaseOne(){
        System.out.println("At first Hello from base constructor");
    }

    abstract void baseClassMethod();
}

class DerivedOne extends BaseOne implements FourthOne{

    DerivedOne(){
        System.out.println("Hello from derived constructor.");
    }

    @Override
    void baseClassMethod(){
        System.out.println("Implementation");
    }

    @Override
    public void printMessage() {
        System.out.println("Just a message.");
    }

    @Override
    public void printNumber() {
        System.out.println(7);
    }

    @Override
    public void printMessages() {
        System.out.print("Just a message. ");
        System.out.println("Just the additional part of the first message.");
    }

    @Override
    public void printFloatNumber() {
        System.out.println(0.98f);
    }

    @Override
    public void print() {
        System.out.println("printing a sentence.");
    }

    @Override
    public void printDoubleNumber() {
        System.out.println(20.2999);
    }

    @Override
    public void additionalMessage() {
        System.out.println("Last message");
    }

    public static void firstMethod(FirstOne firstOne){
        System.out.println("Starting the firstMethod calls");
        System.out.print("Calling printMessage method: ");
        firstOne.printMessage();
        System.out.print("Calling printNumber method: ");
        firstOne.printNumber();
        System.out.println("Finish");
    }

    public static void secondMethod(SecondOne secondOne){
        System.out.println("Starting the secondMethod calls");
        System.out.print("Calling printMessages method: ");
        secondOne.printMessages();
        System.out.print("Calling printFloatNumber method: ");
        secondOne.printFloatNumber();
        System.out.println("Finish");
    }

    public static void thirdMethod(ThirdOne thirdOne){
        System.out.println("Starting the thirdMethod calls");
        System.out.print("Calling print method: ");
        thirdOne.print();
        System.out.print("Calling printDoubleNumber method: ");
        thirdOne.printDoubleNumber();
        System.out.println("Finish");
    }

    public static void fourthMethod(FourthOne fourthOne){
        System.out.println("Starting the fourthMethod calls");
        System.out.print("Calling print method: ");
        fourthOne.print();
        System.out.print("Calling printMessage method: ");
        fourthOne.printMessage();
        System.out.print("Calling printMessages method: ");
        fourthOne.printMessages();
        System.out.print("Calling printDoubleNumber method: ");
        fourthOne.printDoubleNumber();
        System.out.print("Calling printFloatNumber method: ");
        fourthOne.printFloatNumber();
        System.out.print("Calling printNumber method: ");
        fourthOne.printNumber();
        System.out.print("Calling additionalMessage method: ");
        fourthOne.additionalMessage();
        System.out.println("Finish");
    }
}

