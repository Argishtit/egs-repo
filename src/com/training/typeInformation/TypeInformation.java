package com.training.typeInformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description: This file is designed for covering the most part of the exercises from the book ThinkingInJava4e.
 * Chapter:     Type Information
 *
 * @author Argishti_Tigranyan
 */

/*
* Just a code test.
*
 */

public class TypeInformation {
}

class Candy {
    static { System.out.println("Loading Candy"); }
}
class Gum{
    static { System.out.println("Loading Gum"); }
}
class Cookie {
    static { System.out.println("Loading Cookie"); }
}

/*
 * Exercise:        1
 * Description:     In ToyTest.java, comment out Toy’s default constructor and explain
 *                  what happens
 *
 * Explanation:     The class created by the newInstance() method must have the default constructor.
 *                  So in this case we comment out the default constructor that is why we get the message
 *                  'catched' by the InstantiationException exception.
 *
 */

//interface HasBatteries {}
//interface Waterproof {}
//interface Shoots {}
//class Toy {
//
//    //Toy() {}
//    Toy(int i) {}
//}
//class FancyToy extends Toy
//        implements HasBatteries, Waterproof, Shoots {
//    FancyToy() { super(1); }
//}
//class ToyTest {
//    static void printInfo(Class cc) {
//        System.out.println("Class name: " + cc.getName() +
//                " is interface? [" + cc.isInterface() + "]");
//        System.out.println("Simple name: " + cc.getSimpleName());
//        System.out.println("Canonical name : " + cc.getCanonicalName());
//    }
//    public static void main(String[] args) {
//        Class c = null;
//        try {
//            c = Class.forName("com.training.typeInformation.FancyToy");
//        } catch(ClassNotFoundException e) {
//            System.out.println("Can’t find FancyToy");
//            System.exit(1);
//        }
//        printInfo(c);
//        for(Class face : c.getInterfaces())
//            printInfo(face);
//        Class up = c.getSuperclass();
//        Object obj = null;
//        try {
//            // Requires default constructor:
//            obj = up.newInstance();
//        } catch(InstantiationException e) {
//            System.out.println("Cannot instantiate");
//            System.exit(1);
//        } catch(IllegalAccessException e) {
//            System.out.println("Cannot access");
//            System.exit(1);
//        }
//        printInfo(obj.getClass());
//    }
//}

/*
 * Exercise:       2
 * Description:    Incorporate a new kind of interface into ToyTest.java and verify that it
 *                 is detected and displayed properly.
 */

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
interface Bio{}

class Toy {

    Toy() {}
    Toy(int i) {}
}
class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots, Bio {
    FancyToy() { super(1); }
}
class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
    }
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.training.typeInformation.FancyToy");
        } catch(ClassNotFoundException e) {
            System.out.println("Can’t find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for(Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // Requires default constructor:
            obj = up.newInstance();
        } catch(InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch(IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}

/*
 * Exercise:      3
 * Description:   Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a
 *                Shape, then downcast it back to a Rhomboid. Try downcasting to a Circle and see what
 *                happens.
 */

//abstract class Shape {
//    void draw() { System.out.println(this + ".draw()"); }
//    abstract public String toString();
//}
//
//class Circle extends Shape {
//    public String toString() { return "Circle"; }
//}
//
//class Square extends Shape {
//    public String toString() { return "Square"; }
//}
//
//class Triangle extends Shape {
//    public String toString() { return "Triangle"; }
//}
//
//class Rhomboid extends Shape {
//    public String toString() { return "Rhomboid"; }
//}
//
//class ShapeTest{
//    public static void main(String[] args) {
//        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
//
//        // downcasting back to specific shape:
//        for(Shape shape : shapes)
//            shape.draw();
//        Rhomboid r = new Rhomboid();
//        ((Shape)r).draw();
//        // inconvertible types:
//        // ((Circle)r).draw();
//    }
//}

/*
 * Exercise:      4
 * Description:   Modify the previous exercise so that it uses instanceof to check the type
 *                before performing the downcast.
 */

//abstract class Shape {
//    void draw() { System.out.println(this + ".draw()"); }
//    abstract public String toString();
//}
//
//class Circle extends Shape {
//    public String toString() { return "Circle"; }
//}
//
//class Square extends Shape {
//    public String toString() { return "Square"; }
//}
//
//class Triangle extends Shape {
//    public String toString() { return "Triangle"; }
//}
//
//class Rhomboid extends Shape {
//    public String toString() { return "Rhomboid"; }
//}

//class ShapeTest{
//    public static void main(String[] args) {
//        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
//
//        // downcasting back to specific shape:
//        for(Shape shape : shapes)
//            shape.draw();
//        Rhomboid r = new Rhomboid();
//        Shape s = (Shape) r;
//        s.draw();
//
//        if(s instanceof Circle)
//            ((Circle)s).draw();
//        else if(!(s instanceof Circle))
//            System.out.println("(Shape)r is not a Circle");
//    }
//}

/*
 * Exercise:      5
 * Description:   Implement a rotate(Shape) method in Shapes.java, such that it
 *                checks to see if it is rotating a Circle (and, if so, doesn’t perform the operation).
 */

//class ShapeTest{
//    public static void rotate(Shape s) {
//        if(!(s instanceof Circle))
//            System.out.println(s + " rotate");
//    }
//    public static void main(String[] args) {
//        // upcasting to Shape:
//        List<Shape> shapeList = Arrays.asList(
//                new Circle(), new Square(), new Triangle(), new Rhomboid()
//        );
//        // downcasting back to specific shape:
//        for (Shape shape : shapeList)
//            shape.draw();
//        System.out.println();
//        for (Shape shape : shapeList)
//            rotate(shape);
//    }
//}

/*
 * Exercise:      6
 * Description:   Modify Shapes.java so that it can "highlight" (set a flag in) all shapes of
 *                a particular type. The toString( ) method for each derived Shape should indicate whether
 *                that Shape is "highlighted."
 */

abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle extends Shape {
    boolean flag = false;
    public String toString() {
        return (flag ? "H" : "Unh") + "ighlighted " + "Circle";
    }
}

class Square extends Shape {
    boolean flag = false;
    public String toString() {
        return (flag ? "H" : "Unh") + "ighlighted " + "Square";
    }
}

class Triangle extends Shape {
    boolean flag = false;
    public String toString() {
        return (flag ? "H" : "Unh") + "ighlighted " + "Triangle";
    }
}

class HighlightTest {
    public static void setFlag(Shape s) {
        if(s instanceof Circle)
            ((Circle)s).flag = true;
    }
    public static void main(String[] args) {
        // upcasting to Shape:
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
        for(Shape shape : shapeList) {
            setFlag(shape);
            System.out.println(shape);
        }
    }
}

/*
 * Exercise:      8
 * Description:   Write a method that takes an object and recursively prints all the classes
 *                in that object’s hierarchy.
 */

//class B{
//}
//
//class A extends B{
//}
//
//class Parent extends A{
//    Parent(){}
//}
//
//class Child extends Parent{
//    Child(){}
//}
//
//class GrandChild extends Child{
//    GrandChild(){}
//}

//class HierarchyTest{
//    static int i = 0;
//    public static String hierarchyInfo(String s){
//        Class c = null;
//        try {
//            c = Class.forName(s);
//        }
//        catch (ClassNotFoundException e){
//            System.out.println("Can’t find "+s);
//            System.exit(1);
//        }
//        if (c.getSuperclass().getSimpleName().equals("Object")){
//            return "";
//        }
//        else {
//            System.out.println(i+". "+c.getSuperclass().getSimpleName());
//            i++;
//            return hierarchyInfo(c.getSuperclass().getCanonicalName());
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(hierarchyInfo("com.training.typeInformation.GrandChild"));
//    }
//}

/*
 * Exercise:      9
 * Description:   Modify the previous exercise so that it uses
 *                Class.getDeclaredFields( ) to also display information about the fields in a class.
 */

class B{
    public int id = 10;
    public String animal = "Lion";
}

class A extends B{
    public int age = 20;
}

class Parent extends A{

    public String name;
    public String surname;

    Parent(){}
}

class Child extends Parent{

    private String name;
    private String lastName;

    Child(){}
}

class GrandChild extends Child{

    int age;
    int quantityOfTeeth;

    GrandChild(){}
}

class HierarchyTest{
    static int i = 0;
    public static String hierarchyInfo(String s){
        Class c = null;
        try {
            c = Class.forName(s);
        }
        catch (ClassNotFoundException e){
            System.out.println("Can’t find "+s);
            System.exit(1);
        }
        if (c.getSuperclass().getSimpleName().equals("Object")){
            return "";
        }
        else {
            System.out.println(i+". "+c.getSuperclass().getSimpleName()+"\n"+Arrays.toString(c.getSuperclass().getDeclaredFields()));
            i++;
            return hierarchyInfo(c.getSuperclass().getCanonicalName());
        }
    }

    public static void main(String[] args) {
        System.out.println(hierarchyInfo("com.training.typeInformation.GrandChild"));
    }
}

/*
 * Exercise:      10
 * Description:   Write a program to determine whether an array of char is a primitive
 *                type or a true Object.
 */

// solution is written in Main.java

/*
 * Exercise:      10
 * Description:   Write a program to determine whether an array of char is a primitive
 *                type or a true Object.
 */