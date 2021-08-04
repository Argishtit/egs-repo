package com.training.typeInformation;

import java.util.Arrays;
import java.util.List;

/*
 * Exercise:      5
 * Description:   Implement a rotate(Shape) method in Shapes.java, such that it
 *                checks to see if it is rotating a Circle (and, if so, doesn’t perform the operation).
 */

public class Exercise5{
    public static void rotate(Shape2 s) {
        if(!(s instanceof Circle2))
            System.out.println(s + " rotate");
    }
    public static void main(String[] args) {
        // upcasting to Shape:
        List<Shape2> shapeList = Arrays.asList(
                new Circle2(), new Square2(), new Triangle2(), new Rhomboid2()
        );
        // downcasting back to specific shape:
        for (Shape2 shape : shapeList)
            shape.draw();
        System.out.println();
        for (Shape2 shape : shapeList)
            rotate(shape);
    }
}
