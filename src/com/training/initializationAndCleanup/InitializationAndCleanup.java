package com.training.initializationAndCleanup;

/**
 * Description: This class is designed for covering the most part of the exercises from the ThinkingInJava4e book.
 * Each exercise represents a static class and each description of exercise is written above
 * the method.
 * Chapter:     Initialization and Cleanup
 *
 * @author Argishti_tigranyan
 */

public class InitializationAndCleanup {

    /*
     * Exercise:    5
     * Description: Create a class called Dog with an overloaded bark( ) method. This
     *              method should be overloaded based on various primitive data types, and print different types
     *              of barking, howling, etc., depending on which overloaded version is called. Write a main( )
     *              that calls all the different versions.
     */

    static class Dog {

        public static void bark() {
            System.out.println("lowest 'haf' ");
        }

        public static void bark(byte quantityOfBarks) throws IllegalArgumentException {
            if (quantityOfBarks < 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("lower 'haf' ");
                quantityOfBarks--;
            }
            System.out.println();
        }

        public static void bark(short quantityOfBarks) {
            if (quantityOfBarks < 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("low 'haf' ");
                quantityOfBarks--;
            }
            System.out.println();
        }

        public static void bark(int quantityOfBarks) {
            if (quantityOfBarks < 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("haf ");
                quantityOfBarks--;
            }
            System.out.println();
        }

        public static void bark(long quantityOfBarks) {
            if (quantityOfBarks < 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("high 'haf' ");
                quantityOfBarks--;
            }
            System.out.println();
        }
    }

    /*
     * Exercise:    6
     * Description: Modify the previous exercise so that two of the overloaded methods have
     *              two arguments (of two different types), but in reversed order relative to each other. Verify
     *              that this works.
     *
     */

    static class ModifiedDog {
        public static void bark() {
            System.out.println("lowest 'haf' ");
        }

        public static void bark(byte quantityOfBarks) throws IllegalArgumentException {
            if (quantityOfBarks <= 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("lower 'haf' ");
                quantityOfBarks--;
            }
            System.out.println();
        }

        public static void bark(short quantityOfBarks) throws IllegalArgumentException {
            if (quantityOfBarks <= 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("low 'haf' ");
                quantityOfBarks--;
            }
            System.out.println();
        }

        public static void bark(int quantityOfBarks) throws IllegalArgumentException {
            if (quantityOfBarks <= 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("haf ");
                quantityOfBarks--;
            }
            System.out.println();
        }

        public static void bark(long quantityOfBarks) throws IllegalArgumentException {
            if (quantityOfBarks <= 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("high 'haf' ");
                quantityOfBarks--;
            }
            System.out.println();
        }

        public static void bark(boolean hafOrBark, int quantityOfBarks) throws IllegalArgumentException {
            if (quantityOfBarks <= 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            if (hafOrBark) {
                while (quantityOfBarks > 0) {
                    System.out.print("haf ");
                    quantityOfBarks--;
                }
            } else {
                while (quantityOfBarks > 0) {
                    System.out.print("bark ");
                    quantityOfBarks--;
                }
            }
            System.out.println();
        }

        public static void bark(int quantityOfBarks, boolean barkOrHaf) throws IllegalArgumentException {
            if (quantityOfBarks <= 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            if (barkOrHaf) {
                while (quantityOfBarks > 0) {
                    System.out.print("bark ");
                    quantityOfBarks--;
                }
            } else {
                while (quantityOfBarks > 0) {
                    System.out.print("haf ");
                    quantityOfBarks--;
                }
            }
            System.out.println();
        }
    }

    /*
     * Exercise:    9
     * Description: Create a class with two (overloaded) constructors. Using this, call the
     *              second constructor inside the first one.
     *
     */

    static class ConstructorOverloading {

        String firstName;
        String lastName;

        ConstructorOverloading(String firstName, String lastName) {
            this(firstName);
            this.lastName = lastName;
            System.out.println("Last name: " + this.lastName);
        }

        ConstructorOverloading(String firstName) {
            this.firstName = firstName;
            System.out.println("First name: " + this.firstName);
        }
    }

    /*
     * Exercise:    10
     * Description: Create a class with a finalize( ) method that prints a message. In main( ),
     *              create an object of your class. Explain the behavior of your program.
     *
     */

    static class FinalizeExample {

        FinalizeExample() {
            System.out.println("Hello from constructor");
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("If you see this message that means that your garbage is collected.");
        }
    }

    /*
     * Exercise:    11
     * Description: Modify the previous exercise so that your finalize( ) will always be called.
     */

    static class FinalizeExampleModified {

        boolean in;

        FinalizeExampleModified(boolean in) {
            System.out.println("Hello from constructor");
            this.in = in;
        }

        @Override
        protected void finalize() throws Throwable {
            if (this.in) {
                super.finalize();
                System.out.println("If you see this message that means that your garbage is collected.");
            }
        }
    }

    /*
     * Exercise:    12
     * Description: Create a class called Tank that can be filled and emptied, and has a
     *              termination condition that it must be empty when the object is cleaned up. Write a
     *              finalize( ) that verifies this termination condition. In main( ), test the possible scenarios
     *              that can occur when your Tank is used.
     */

    static class Tank {

        boolean empty;
        String name;

        public Tank(String name) {
            this.name = name;
            this.empty = true;
        }

        public Tank(String name, boolean empty) {
            this.name = name;
            this.empty = empty;
        }

        void clear() {
            this.empty = false;
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            if (empty) {
                System.err.println("tank : " + name + " is empty");
            }
        }
    }

    /*
     * Exercise:    14
     * Description: Create a class with a static String field that is initialized at the point of
     *              definition, and another one that is initialized by the static block. Add a static method that
     *              prints both fields and demonstrates that they are both initialized before they are used.
     *
     */

    static class StaticInitialization {
        static String first = "Static Initialization 1";
        static String second;

        static {
            second = "Static Initialization 2";
        }

        static void printInfo() {
            System.out.println(first);
            System.out.println(second);
        }
    }

    /*
     * Exercise:    14
     * Description: Create a class with a String that is initialized using instance initialization.
     */

    static class InstanceInitialization {

        String className;

        {
            className = "InstanceInitialization";
        }

        void printInfo() {
            System.out.println(this.className);
        }
    }

    /*
     * Exercise:    21
     * Description: Create an enum of the least-valuable six types of paper currency. Loop
     *              through the values( ) and print each value and its ordinal( ).
     */

    enum Currency {
        DOLLAR, EURO, AMD, RUBLE, FRANC
    }

    public static void showCurrencies() {

        for (Currency currency : Currency.values()) {
            System.out.print(currency);
            System.out.println(" " + currency.ordinal() + '\n');
        }
    }

    /*
     * Exercise:    22
     * Description: Write a switch statement for the enum in the previous example. For
     *              each case, output a description of that particular currency.
     */

    public static void currenciesDescription(Currency currency) {

        switch (currency) {
            default:
            case AMD:
                System.out.println("This is the official currency of Armenia.");
                break;
            case EURO:
                System.out.println("This currency mostly used in many European countries");
                break;
            case FRANC:
                System.out.println("This currency mostly used in many francophone countries");
                break;
            case RUBLE:
                System.out.println("This is the official currency of Russia.");
                break;
            case DOLLAR:
                System.out.println("This is the official currency of USA.");
                break;
        }
    }

}