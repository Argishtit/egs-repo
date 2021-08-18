package com.training.initializationAndCleanup;

/*
 * Exercise:    10
 * Description: Create a class with a finalize( ) method that prints a message. In main( ),
 *              create an object of your class. Explain the behavior of your program.
 *
 */

public class Exercise10 {
    public static void main(String[] args) {
        FinalizeExample finalizeExample = new FinalizeExample();
        finalizeExample = null;
        System.gc();
    }
}

class FinalizeExample {

    FinalizeExample() {
        System.out.println("Hello from constructor");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("If you see this message that means that your garbage is collected.");
    }
}