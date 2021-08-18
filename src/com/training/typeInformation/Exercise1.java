package com.training.typeInformation;

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

interface HasBatteries1 {}
interface Waterproof1 {}
interface Shoots1 {}

class Toy1 {
    //Toy1() {}
    Toy1(int i) {}
}
class FancyToy1 extends Toy1
        implements HasBatteries1, Waterproof1, Shoots1 {
    FancyToy1() { super(1); }
}
class ToyTest1 {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
    }
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.training.typeInformation.FancyToy1");
        } catch(ClassNotFoundException e) {
            System.out.println("Can’t find FancyToy1");
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

public class Exercise1 {
}
