package com.training.interfaces;

/*
 * Exercise:     14
 * Description:  Create three interfaces, each with two methods. Inherit a new interface
 *               that combines the three, adding a new method. Create a class by implementing the new
 *               interface and also inheriting from a concrete class. Now write four methods, each of which
 *               takes one of the four interfaces as an argument. In main( ), create an object of your class
 *               and pass it to each of the methods.
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

class BaseOne{
    BaseOne(){
        System.out.println("At first Hello from base constructor");
    }
}

class DerivedOne extends BaseOne implements FourthOne{

    DerivedOne(){
        System.out.println("Hello from derived constructor.");
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

public class Exercise14 {
    public static void main(String[] args) {
        DerivedOne derivedOne = new DerivedOne();
        DerivedOne.firstMethod(derivedOne);
        DerivedOne.secondMethod(derivedOne);             // Exercise 14
        DerivedOne.thirdMethod(derivedOne);
        DerivedOne.fourthMethod(derivedOne);
    }
}
