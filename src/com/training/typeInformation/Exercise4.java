package com.training.typeInformation;

/*
 * Exercise:      4
 * Description:   Modify the previous exercise so that it uses instanceof to check the type
 *                before performing the downcast.
 */

import java.util.Arrays;
import java.util.List;

abstract class Shape2 {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle2 extends Shape2 {
    public String toString() { return "Circle"; }
}

class Square2 extends Shape2 {
    public String toString() { return "Square"; }
}

class Triangle2 extends Shape2 {
    public String toString() { return "Triangle"; }
}

class Rhomboid2 extends Shape2 {
    public String toString() { return "Rhomboid"; }
}

class Exercise4{
    public static void main(String[] args) {
        List<Shape2> shapes = Arrays.asList(new Circle2(), new Square2(), new Triangle2(), new Rhomboid2());

        // downcasting back to specific shape:
        for(Shape2 shape : shapes)
            shape.draw();
        Rhomboid2 r = new Rhomboid2();
        Shape2 s = (Shape2) r;
        s.draw();

        if(s instanceof Circle2)
            ((Circle2)s).draw();
        else if(!(s instanceof Circle2))
            System.out.println("(Shape)r is not a Circle");
    }
}
