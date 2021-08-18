package com.training.initializationAndCleanup;

/*
 * Exercise:    15
 * Description: Create a class with a String that is initialized using instance initialization.
 */

public class Exercise15 {
    public static void main(String[] args) {
        InstanceInitialization instanceInitialization = new InstanceInitialization();
        instanceInitialization.printInfo();
    }
}

class InstanceInitialization {

    String className;

    {
        className = "InstanceInitialization";
    }

    void printInfo() {
        System.out.println(this.className);
    }
}

