package com.training.reusingClasses;

/**
 * Description: This class is designed for covering the most part of the exercises from the ThinkingInJava4e book.
 * Each description of exercise is written above the block of the class or method.
 * Chapter:     Reusing Classes
 *
 * @author Argishti_tigranyan
 */

public class ReusingClasses {
}

/*
 * Exercise:     1
 * Description:  Create a simple class. Inside a second class, define a reference to an object
 *               of the first class. Use lazy initialization to instantiate this object.
 */

class SimpleClass {
    String className;

    SimpleClass() {
        this.className = "SimpleClass";
        System.out.println(this.className);
    }
}

class LazyClass {
    String className;
    SimpleClass simpleClass;

    LazyClass() {
        this.className = "LazyClass";
        System.out.println(this.className);
        simpleClass = new SimpleClass();
    }
}

/*
 * Exercise:     5
 * Description:  Create two classes, A and B, with default constructors (empty argument
 *               lists) that announce themselves. Inherit a new class called C from A, and create a member of
 *               class B inside C. Do not create a constructor for C. Create an object of class C and observe
 *               the results.
 *
 */

class A {
    String className;

    A() {
        className = "A";
        System.out.println(this.className);
    }
}

class B {
    String className;

    B() {
        className = "B";
        System.out.println(this.className);
    }
}

class C extends A {
    B composition;
}

/*
 * Exercise:     7
 * Description:  Modify Exercise 5 so that A and B have constructors with arguments instead of default constructors.
 *               Write a constructor for C and perform all initialization within C’s constructor.
 */

class AA {
    AA(int someNumber) {
        System.out.println("Hello from AA");
    }
}

class BB {
    BB(int someNumber) {
        System.out.println("Hello from BB");
    }
}

class CC extends AA {
    BB composition;

    CC(int someNumber) {
        super(someNumber);
        this.composition = new BB(someNumber);
        System.out.println("Hello from CC");
    }
}

/*
 * Exercise:     8
 * Description:  Create a base class with only a non-default constructor, and a derived class with both
 *               a default (no-arg) and non-default constructor. In the derived-class constructors, call the
 *               base-class constructor.
 */

class BaseClass {
    BaseClass(int someNumber) {
        System.out.println("Base class constructor");
    }
}

class DerivedClass extends BaseClass {
    DerivedClass() {
        super(25);
        System.out.println("Derived class constructor");
    }

    DerivedClass(int someNumber) {
        super(someNumber);
        System.out.println("Derived class");
    }
}

/*
 * Exercise:     9
 * Description:  Create a class called Root that contains an instance of each of the classes
 *               (that you also create) named Component1, Component2, and Component3. Derive a
 *               class Stem from Root that also contains an instance of each “component.”
 *               All classes should have default constructors that print a message about that class.
 */

class Root {
    Component1 component1;
    Component2 component2;
    Component3 component3;

    Root() {
        System.out.println("Root constructor");
        component1 = new Component1();
        component2 = new Component2();
        component3 = new Component3();

    }
}

class Component1 {
    Component1() {
        System.out.println("Component 1 constructor");
    }
}

class Component2 {
    Component2() {
        System.out.println("Component 2 constructor");
    }
}

class Component3 {
    Component3() {
        System.out.println("Component 3 constructor");
    }
}

class Stem extends Root {
//    Component1 component1;
//    Component2 component2;
//    Component3 component3;

    Stem() {
        System.out.println("Stem constructor");
    }
}

/*
 * Exercise:     13
 * Description:  Create a class with a method that is overloaded three times. Inherit a
 *               new class, add a new overloading of the method, and show that all four methods are available
 *               in the derived class.
 */

class Useful {
    public void simpleMethod() {
        System.out.println("Simple method without arguments");
    }

    public void simpleMethod(int number) {
        System.out.println("Simple method with provided argument: " + number);
    }

    public void simpleMethod(int number, String word) {
        System.out.println("Simple method with provided number and word: " + number + " " + word);
    }
}

class MoreUseful extends Useful {
    public void simpleMethod(int number, String word, Boolean value) {
        System.out.println("Simple method with provided number, word and boolean value: " + number + " " + word + " " + value);
    }
}

/*
 * Exercise:     14
 * Description:  In Car.java add a service() method to Engine and call this method in main().
 */

class Engine {
    public void start() {
    }

    public void rev() {
    }

    public void stop() {
    }

    public void service() {
        System.out.println("Service is in action.");
    }
}

class Wheel {
    public void inflate(int psi) {
    }
}

class Window {
    public void rollup() {
    }

    public void rollDown() {
    }
}

class Door {
    public Window window = new Window();

    public void open() {
    }

    public void close() {
    }
}

class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door();
    public Door right = new Door();

    public Car() {
        for (int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }
}

/*
 * Exercise:     16
 * Description:  Create a class called Amphibian. From this, inherit a class called
 *               Frog. Put appropriate methods in the base class. In main(), create a Frog and upcast it to
 *               Amphibian and demonstrate that all the methods still work.
 */

class Amphibian {
    public void toBreath() {
        System.out.println("a little amphibian is breathing.");
    }
}

class Frog extends Amphibian {
}

/*
 * Exercise:     17
 * Description:  Modify Exercise 16 so that Frog overrides the method definitions from
 *               the base class (provides new definitions using the same method signatures). Note what
 *               happens in main( ).
 */

class Amphibian2 {
    public void toBreath() {
        System.out.println("a little amphibian is breathing.");
    }
}

class Frog2 extends Amphibian2 {
    @Override
    public void toBreath() {
        System.out.println("a little frog is breathing");
    }
}

/*
 * Exercise:     18
 * Description:  Create a class with a static final field and a final field and
 *               demonstrate the difference between the two.
 *
 */

class Difference {
    final String className;

    Difference() {
        className = "";
    }

    Difference(String className) {
        this.className = className;
    }

    static final int id;

    static {
        id = 10;
    }
}

/*
 * Exercise:     19
 * Description:  Create a class with a blank final reference to an object. Perform the initialization of the
 *               blank final inside all constructors. Demonstrate the guarantee that the final must
 *               be initialized before use, and that it cannot be changed once initialized.
 *
 */

class BlankFinal {
    final Difference difference;

    BlankFinal() {
        difference = new Difference("Blank final");
        System.out.println(difference.className);
    }

    BlankFinal(String className) {
        difference = new Difference(className);
        System.out.println(difference.className);
    }
}