package com.training.typeInformation;

/*
 * Exercise:      3
 * Description:   Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a
 *                Shape, then downcast it back to a Rhomboid. Try downcasting to a Circle and see what
 *                happens.
 */

import java.util.Arrays;
import java.util.List;

abstract class Shape1 {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle1 extends Shape1{
    public String toString() { return "Circle"; }
}

class Square1 extends Shape1 {
    public String toString() { return "Square"; }
}

class Triangle1 extends Shape1 {
    public String toString() { return "Triangle"; }
}

class Rhomboid1 extends Shape1 {
    public String toString() { return "Rhomboid"; }
}

public class Exercise3{
    public static void main(String[] args) {
        List<Shape1> shapes = Arrays.asList(new Circle1(), new Square1(), new Triangle1(), new Rhomboid1());

        // downcasting back to specific shape:
        for(Shape1 shape : shapes)
            shape.draw();
        Rhomboid1 r = new Rhomboid1();
        ((Shape1)r).draw();
        // inconvertible types:
        // ((Circle)r).draw();
    }
}
