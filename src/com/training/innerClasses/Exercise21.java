package com.training.innerClasses;

/*
 * Exercise:     21
 *
 * Description:  Create an interface that contains a nested class that has a static method
 *               that calls the methods of your interface and displays the results. Implement your interface
 *               and pass an instance of your implementation to the method.
 */

public class Exercise21 {
    public static void main(String[] args) {
          InterfaceHasStaticClass.StaticClassInInterface scif =
          new InterfaceHasStaticClass.StaticClassInInterface();
          scif.displayInformation();
    }
}

interface InterfaceHasStaticClass {
    public void displayInformation();

    static class StaticClassInInterface implements InterfaceHasStaticClass {
        @Override
        public void displayInformation() {
            System.out.println("Information caused by the static class which is situated in interface");
        }
    }
}