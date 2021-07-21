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

class High {
    class Lower {

    }

    public Lower lower() {
        return new Lower();
    }
}

class Separate {
    High.Lower lower;

    Separate() {
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

public class OuterDisplay {
    protected class InnerDisplay implements Display {
        @Override
        public void displayInformation() {
            System.out.println("A little information from Inner class");
        }
    }

    public InnerDisplay inner() {
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

class Just {
    private String className = "Just";

    public String getClassName() {
        return this.className;
    }

    class JustModifier {
        public String modifier() {
            Just.this.className = "JustModifier";
            return Just.this.getClassName();
        }
    }

    public void inner() {
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

class OuterDetermine {

    public void display() {
        System.out.println(new Inner().className);
        System.out.println("If you see additional information above that means that Outer " +
                "class has access to Inner class' private methods");
    }

    class Inner {
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

//interface Show{
//    public void showInformation();
//}
//
//class Higher{
//    public Show returnReference(){
//        class High implements Show{
//            public void showInformation(){
//                System.out.println("Hello from inner");
//            }
//        }
//        Show show = new High();
//        return show;
//    }
//}

/*
 * Exercise:     10
 *
 * Description:  Repeat the previous exercise but define the inner class within a scope
 *               within a method.
 */

interface Show {
    void showInformation(String s);
}

class Higher {

    Show action(boolean b) {
        if (b) {
            class Inner implements Show {
                public void showInformation(String s) {
                    System.out.println(s);
                }
            }
            return new Inner();
        }
        return null;
    }
}

/*
 * Exercise:     11
 *
 * Description:  Create a private inner class that implements a public interface. Write
 *               a method that returns a reference to an instance of the private inner class, upcast to the
 *               interface. Show that the inner class is completely hidden by trying to downcast to it.
 *
 */

//class A {
//    private class B implements Show {
//        public void showInformation(String s) {
//            System.out.println("I want to say: " + s);
//        }
//    }
//
//    public B getB() {
//        return new B();
//    }
//}

/*
 * Exercise:     12
 *
 * Description:   Repeat Exercise 7 using an anonymous inner class.
 *                (Create a class with a private field and a private method. Create an
 *                inner class with a method that modifies the outer-class field and calls the outer-class method.
 *                In a second outer-class method, create an object of the inner class and call its method, then
 *                show the effect on the outer-class object.)
 */

interface ModifyOuter {
    public void modifier();
}

class OuterOfAnonymous {
    private String className = "OuterOfAnonymous";

    private String callMyName() {
        return "This is my new name: " + this.getClassName();
    }

    public String getClassName() {
        return this.className;
    }

    public ModifyOuter modifyOuter() {
        return new ModifyOuter() {
            @Override
            public void modifier() {
                OuterOfAnonymous.this.className = "Anonymous";
                System.out.println(OuterOfAnonymous.this.callMyName());
            }
        };
    }
}

/*
 * Exercise:      13
 *
 * Description:   Repeat Exercise 9 using an anonymous inner class.
 *                (Create an interface with at least one method, and implement that
 *                interface by defining an inner class within a method, which returns a reference to your
 *                interface.)
 */

interface AtLeast {
    public void showInformation();
}

class C {
    public AtLeast action(String s) {
        return new AtLeast() {
            @Override
            public void showInformation() {
                System.out.println("The information which I want to show is: " + s);
            }
        };
    }
}

/*
 * Exercise:      15
 *
 * Description:   Create a class with a non-default constructor (one with arguments) and
 *                no default constructor (no "no-arg" constructor). Create a second class that has a method
 *                that returns a reference to an object of the first class. Create the object that you return by
 *                making an anonymous inner class that inherits from the first class.
 */

class D {

    private String className;

    public String getClassName() {
        return this.className;
    }

    public D(String className) {
        this.className = className;
    }
}

class E {
    D returnRef(String s) {
        return new D(s) {
        };
    }
}

/*
 * Exercise:      18
 *
 * Description:  Create a class containing a nested class. In main( ), create an instance
 *               of the nested class.
 */

class X {
    static class Nested {

    }
}

/*
 * Exercise:      19
 *
 * Description:  Create a class containing an inner class that itself contains an inner
 *               class. Repeat this using nested classes. Note the names of the .class files produced by the
 *               compiler.
 */

class Deep {
    static class Deeper {
        static class Deepest {
            Deepest() {
                System.out.println("hlo");
            }
        }
    }
}

/*
 * Exercise:     20
 *
 * Description:  Create an interface containing a nested class. Implement this interface
 *               and create an instance of the nested class.
 */

interface ClassInInterface {
    public void displayWord(String word);

    class InterfaceInner implements ClassInInterface {
        public void displayWord(String word) {
            System.out.println(word);
        }
    }
}

/*
 * Exercise:     21
 *
 * Description:  Create an interface that contains a nested class that has a static method
 *               that calls the methods of your interface and displays the results. Implement your interface
 *               and pass an instance of your implementation to the method.
 */

interface InterfaceHasStaticClass {
    public void displayInformation();

    static class StaticClassInInterface implements InterfaceHasStaticClass {
        @Override
        public void displayInformation() {
            System.out.println("Information caused by the static class which is situated in interface");
        }
    }
}

/*
 * Exercise:     23
 *
 * Description: Create an interface U with three methods. Create a class A with a
 *              method that produces a reference to a U by building an anonymous inner class. Create a
 *              second class B that contains an array of U. B should have one method that accepts and stores
 *              a reference to a U in the array, a second method that sets a reference in the array (specified
 *              by the method argument) to null, and a third method that moves through the array and calls
 *              the methods in U. In main( ), create a group of A objects and a single B. Fill the B with U
 *              references produced by the A objects. Use the B to call back into all the A objects. Remove
 *              some of the U references from the B.
 */

interface U {
    public void displayWord(int i);

    public void displayInformation();

    public void greeting();
}

class A {
    public U referenceProducer() {
        return new U() {
            @Override
            public void displayWord(int i) {
                System.out.println(i);
            }

            @Override
            public void displayInformation() {
                System.out.println("You see this due to anonymous inner class");
            }

            @Override
            public void greeting() {
                System.out.println("Barev dzeez!!!");
            }
        };
    }
}

class B {
    static U[] arrayOfU = new U[5];
    static int i = 0;

    public void storeElements(U u) {
        if (i < 5) {
            arrayOfU[i] = u;
            i++;
        } else {
            System.out.println("No more place for the objects");
        }
    }

    public void setNull(int i) {
        if (i < 0 || i > 5) {
            System.out.println("Wrong index Error");
        } else {
            arrayOfU[i] = null;
        }
    }

    public void caller(U u, int i) {
        if (u != null) {
            u.displayInformation();
            u.displayWord(i);
            u.greeting();
        } else {
            System.out.println("Can't call some method sorry\n");
        }
    }
}

/*
 * Exercise:     21
 *
 * Description:  Create a class with an inner class that has a non-default constructor
 *               (one that takes arguments). Create a second class with an inner class that inherits from the
 *               first inner class.
 */

class Out {
    class In {
        String className;

        In(String className) {
            this.className = className;
        }
    }
}

class SeparateOut extends Out.In{
    SeparateOut(Out out, String s){
        out.super(s);
    }
}