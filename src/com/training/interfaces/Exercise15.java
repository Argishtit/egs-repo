package com.training.interfaces;

/*
 * Exercise:     15
 * Description:  Modify the previous exercise by creating an abstract class and
 *               inheriting that into the derived class.
 */

interface FirstOne1{
    public void printMessage();
    public void printNumber();
}

interface SecondOne1{
    public void printMessages();
    public void printFloatNumber();
}

interface ThirdOne1{
    public void print();
    public void printDoubleNumber();
}

interface FourthOne1 extends FirstOne1, SecondOne1, ThirdOne1{
    public void additionalMessage();
}

abstract class BaseOne1{
    BaseOne1(){
        System.out.println("At first Hello from base constructor");
    }

    abstract void baseClassMethod();
}

class DerivedOne1 extends BaseOne1 implements FourthOne1 {

    DerivedOne1() {
        System.out.println("Hello from derived constructor.");
    }

    @Override
    void baseClassMethod() {
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

    public static void firstMethod(FirstOne firstOne) {
        System.out.println("Starting the firstMethod calls");
        System.out.print("Calling printMessage method: ");
        firstOne.printMessage();
        System.out.print("Calling printNumber method: ");
        firstOne.printNumber();
        System.out.println("Finish");
    }

    public static void secondMethod(SecondOne secondOne) {
        System.out.println("Starting the secondMethod calls");
        System.out.print("Calling printMessages method: ");
        secondOne.printMessages();
        System.out.print("Calling printFloatNumber method: ");
        secondOne.printFloatNumber();
        System.out.println("Finish");
    }

    public static void thirdMethod(ThirdOne thirdOne) {
        System.out.println("Starting the thirdMethod calls");
        System.out.print("Calling print method: ");
        thirdOne.print();
        System.out.print("Calling printDoubleNumber method: ");
        thirdOne.printDoubleNumber();
        System.out.println("Finish");
    }

    public static void fourthMethod(FourthOne fourthOne) {
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

public class Exercise15 {
}
