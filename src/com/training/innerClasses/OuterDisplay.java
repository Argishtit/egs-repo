package com.training.innerClasses;

import com.training.innerClasses.basementForInterfaces.Display;

/**
 * Description:    This file is designed for covering the most part of the exercises from the book ThinkingInJava4e.
 * <p>
 * Chapter:        Inner Classes
 *
 * @author Argishti_Tigranyan
 */



/*
 * Exercise:    1
 *
 * Description: Write a class named Outer that contains an inner class named Inner.
 *              Add a method to Outer that returns an object of type Inner. In main( ), create and
 *              initialize a reference to an Inner.
 */

//class Outer {
//
//    public Inner returnInnersObject() {
//        return new Inner();
//    }
//
//    class Inner {
//
//    }
//}

/*
 * Exercise:    3
 *
 * Description: Modify Exercise 1 so that Outer has a private String field (initialized
 *              by the constructor), and Inner has a toString( ) that displays this field. Create an object of
 *              type Inner and display it.
 */

class Outer {

    private String className;

    Outer(String className) {
        this.className = className;
    }

    class Inner {
        @Override
        public String toString() {
            return className;
        }
    }

    public Inner returnInnersObject() {
        return new Inner();
    }
}

/*
 * Exercise:    5
 *
 * Description: Create a class with an inner class. In a separate class, make an instance of
 *              the inner class.
 */

class High{
    class Lower{

    }
    public Lower lower(){
        return new Lower();
    }
}

class Separate{
    High.Lower lower;

    Separate(){
        High high = new High();
        this.lower = high.lower();
    }
}

/*
 * Exercise:     6
 *
 * Description:  Create an interface with at least one method, in its own package. Create a
 *               class in a separate package. Add a protected inner class that implements the interface. In a
 *               third package, inherit from your class and, inside a method, return an object of the
 *               protected inner class, upcasting to the interface during the return.
 */

public class OuterDisplay{
   protected class InnerDisplay implements Display {
       @Override
       public void displayInformation() {
           System.out.println("A little information from Inner class");
       }
   }

   public InnerDisplay inner(){
       return new InnerDisplay();
   }
}

/*
 * Exercise:     7
 *
 * Description:  Create a class with a private field and a private method. Create an
 *               inner class with a method that modifies the outer-class field and calls the outer-class method.
 *               In a second outer-class method, create an object of the inner class and call its method, then
 *               show the effect on the outer-class object.
 */

class Just{
    private String className = "Just";

    public String getClassName(){
        return this.className;
    }

    class JustModifier{
        public String modifier(){
            Just.this.className = "JustModifier";
            return Just.this.getClassName();
        }
    }

    public void inner(){
        JustModifier inner = new JustModifier();
        System.out.println(inner.modifier());
    }
}

/*
 * Exercise:     8
 *
 * Description:  Determine whether an outer class has access to the private elements of
 *               its inner class.
 */

class OuterDetermine{

    public void display(){
        System.out.println(new Inner().className);
        System.out.println("If you see additional information above that means that Outer " +
                           "class has access to Inner class' private methods");
    }

    class Inner{
        private String className = "Inner";
    }
}

/*
 * Exercise:     9
 *
 * Description:  Create an interface with at least one method, and implement that
 *               interface by defining an inner class within a method, which returns a reference to your
 *               interface.
 */