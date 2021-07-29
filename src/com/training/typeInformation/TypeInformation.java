package com.training.typeInformation;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.reflect.*;
import java.lang.annotation.*;

/**
 * Description: This file is designed for covering the most part of the exercises from the book ThinkingInJava4e.
 * Chapter:     Type Information
 *
 * @author Argishti_Tigranyan
 */

// just a test

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

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
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

//interface HasBatteries {}
//interface Waterproof {}
//interface Shoots {}
//interface Bio{}
//
//class Toy {
//
//    Toy() {}
//    Toy(int i) {}
//}
//class FancyToy extends Toy
//        implements HasBatteries, Waterproof, Shoots, Bio {
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
 * Exercise:      19
 * Description:   In ToyTest.java, use reflection to create a Toy object using the non-default constructor.
 */

class Toy {
     Toy() {
        System.out.println("Creating Toy() object");
    }
    Toy(int i) {
        System.out.println("Creating Toy(" + i + ") object");
    }
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {
    FancyToy() { super(1); }
}

 class ToyTest {
    public static void main(String[] args) {
        // get appropriate constructor and create new instance:
        try {
            Toy.class.getDeclaredConstructor(int.class).newInstance(5);
            // catch four exceptions:
        } catch(NoSuchMethodException e) {
            System.out.println("No such method: " + e);
        } catch(InstantiationException e) {
            System.out.println("Unable make Toy: " + e);
        } catch(IllegalAccessException e) {
            System.out.println("Unable access: " + e);
        } catch(InvocationTargetException e) {
            System.out.println("Target invocation problem: " + e);
        }
    }
}

/*
 * Exercise:      20
 * Description:   Look up the interface for java.lang.Class in the JDK documentation
 *                from http://java.sun.com. Write a program that takes the name of a class as a command-line
 *                argument, then uses the Class methods to dump all the information available for that class.
 *                Test your program with a standard library class and a class you create.
 */

class ClassInfo {
    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c = Class.forName("java.lang.String");
        } catch(ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        }
        System.out.println("c: " + c);
        System.out.println("c.getAnnotations(): ");
        if(c.getAnnotations().length == 0) System.out.println("none");
        for(Annotation a : c.getAnnotations())
            System.out.println(a);
        System.out.println("c.getCanonicalName(): " + c.getCanonicalName());
        System.out.println("c.getClasses(): ");
        if(c.getClasses().length == 0) System.out.println("none");
        for(Class cl : c.getClasses())
            System.out.println(cl);
        System.out.println("c.getClassLoader(): " + c.getClassLoader());
        System.out.println("c.getConstructors(): ");
        if(c.getConstructors().length == 0) System.out.println("none");
        for(Constructor ctor : c.getConstructors())
            System.out.println(ctor);
        System.out.println("c.getDeclaredAnnotations(): ");
        if(c.getDeclaredAnnotations().length == 0) System.out.println("none");
        for(Annotation a : c.getDeclaredAnnotations())
            System.out.println(a);
        System.out.println("c.getDeclaredClasses(): ");
        if(c.getDeclaredClasses().length == 0) System.out.println("none");
        for(Class cl : c.getDeclaredClasses())
            System.out.println(cl);
        System.out.println("c.getDeclaredConstructors(): ");
        if(c.getDeclaredConstructors().length == 0) System.out.println("none");
        for(Constructor ctor : c.getDeclaredConstructors())
            System.out.println(ctor);
        System.out.println("c.getDeclaredFields(): ");
        if(c.getDeclaredFields().length == 0) System.out.println("none");
        for(Field f : c.getDeclaredFields())
            System.out.println(f);
        System.out.println("c.getDeclaredMethods(): ");
        if(c.getDeclaredMethods().length == 0) System.out.println("none");
        for(Method m : c.getDeclaredMethods())
            System.out.println(m);
        System.out.println("c.getDeclaringClass(): " + c.getDeclaringClass());
        System.out.println("c.getEnclosingConstructor(): " + c.getEnclosingConstructor());
        System.out.println("c.getEnclosingMethod(): " + c.getEnclosingMethod());
        System.out.println("c.getEnumConstants(): " + c.getEnumConstants());
        System.out.println("c.getDeclaredFields(): ");
        if(c.getFields().length == 0) System.out.println("none");
        for(Field f : c.getFields())
            System.out.println(f);
        System.out.println("c.getGenericInterfaces(): ");
        if(c.getGenericInterfaces().length == 0) System.out.println("none");
        for(Type t : c.getGenericInterfaces())
            System.out.println(t);
        System.out.println("c.getGenericSuperclass(): " + c.getGenericSuperclass());
        System.out.println("c.getInterfaces(): ");
        if(c.getInterfaces().length == 0) System.out.println("none");
        for(Class i : c.getInterfaces())
            System.out.println(i);
        System.out.println("c.getMethods(): ");
        if(c.getMethods().length == 0) System.out.println("none");
        for(Method m : c.getMethods())
            System.out.println(m);
        System.out.println("c.getModifiers(): " + c.getModifiers());
        System.out.println("c.getName(): " + c.getName());
        System.out.println("c.getPackage(): " + c.getPackage());
        System.out.println("c.getProtectionDomain(): " + c.getProtectionDomain());
        System.out.print("c.getSigners(): ");
        if(c.getSigners() == null)
            System.out.println(c.getSigners());
        if(c.getSigners() != null) {
            System.out.println();
            if(c.getSigners().length == 0) System.out.println("none");
            if(c.getSigners().length > 0) {
                for(Object s : c.getSigners())
                    System.out.println(s);
            }
        }
        System.out.println("c.getSimpleName(): " + c.getSimpleName());
        System.out.println("c.getSuperclass(): " + c.getSuperclass());
        System.out.println("c.getTypeParameters(): " + c.getTypeParameters());
        System.out.println("c.isAnnotation(): " + c.isAnnotation());
        System.out.println("c.isAnnotationPresent(Documented.class): " + c.isAnnotationPresent(Documented.class));
        System.out.println("c.isAnonymousClass(): " + c.isAnonymousClass());
        System.out.println("c.isArray(): " + c.isArray());
        System.out.println("c.isAssignableFrom(ClassInfo.class): " + c.isAssignableFrom(ClassInfo.class));
        System.out.println("c.isAssignableFrom(Object.class): " + c.isAssignableFrom(Object.class));
        System.out.println("c.isEnum(): " + c.isEnum());
        System.out.println("c.isInstance(Object.class): " + c.isInstance(Object.class));
        System.out.println("c.isInterface(): " + c.isInterface());
        System.out.println("c.isLocalClass(): " + c.isLocalClass());
        System.out.println("c.isMemberClass(): " + c.isMemberClass());
        System.out.println("c.isPrimitive(): " + c.isPrimitive());
        System.out.println("c.isSynthetic(): " + c.isSynthetic());
    }
}

/*
 * Exercise:      20
 * Description:   Look up the interface for java.lang.Class in the JDK documentation
 *                from http://java.sun.com. Write a program that takes the name of a class as a command-line
 *                argument, then uses the Class methods to dump all the information available for that class.
 *                Test your program with a standard library class and a class you create.
 */

interface Interface {
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface {
    public void doSomething() { System.out.println("doSomething"); }
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}
class SimpleProxy implements Interface {
    private Interface proxied;
    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}
class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}

/*
 * Exercise:      25
 * Description:   Create a class containing private, protected and package-access
 *                methods. Write code to access these methods from outside of the class’s package.
 */

public class TypeInformation {
    int i = 20;
    protected String s = "If you are out from the package, only for subclasses!!!";
    private String s2 = "Am I private?";

    void firstMethod(){
        System.out.println("Default access");
    }

    protected void secondMethod(){
        System.out.println("protected access");
    }

    private void thirdMethod(){
        System.out.println("private access");
    }

    @Override
    public String toString() {
        return "TypeInformation{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }
}

// see the actions connected with this exercise in com.training.typeInformation.test package.