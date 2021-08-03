package com.training.interfaces;

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

public class Exercise4 {
    public static void main(String[] args) {
        NotEmpty notEmpty = new NotEmpty();
        NotEmpty.caller(notEmpty);
    }
}
