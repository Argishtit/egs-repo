package com.training.innerClasses;

import com.training.innerClasses.basementForInterfaces.Display;
import com.training.innerClasses.bassementForClasses.SeparateThird;

/*
 * Exercise:     6
 *
 * Description:  Create an interface with at least one method, in its own package. Create a
 *               class in a separate package. Add a protected inner class that implements the interface. In a
 *               third package, inherit from your class and, inside a method, return an object of the
 *               protected inner class, upcasting to the interface during the return.
 */

public class Exercise6 {
    protected class InnerDisplay implements Display {
        @Override
        public void displayInformation() {
            System.out.println("A little information from Inner class");
        }
    }

    public InnerDisplay inner() {
        return new InnerDisplay();
    }

    public static void main(String[] args) {
            SeparateThird separateThird = new SeparateThird();
            separateThird.method().displayInformation();
    }
}
