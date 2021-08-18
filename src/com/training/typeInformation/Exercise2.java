package com.training.typeInformation;

/*
 * Exercise:       2
 * Description:    Incorporate a new kind of interface into ToyTest.java and verify that it
 *                 is detected and displayed properly.
 */

interface HasBatteries2 {}
interface Waterproof2 {}
interface Shoots2 {}
interface Bio2{}

class Toy2 {

    Toy2() {}
    Toy2(int i) {}
}
class FancyToy2 extends Toy2
        implements HasBatteries2, Waterproof2, Shoots2, Bio2 {
    FancyToy2() { super(1); }
}
class ToyTest2 {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
    }
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.training.typeInformation.FancyToy2");
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

public class Exercise2 {
}
