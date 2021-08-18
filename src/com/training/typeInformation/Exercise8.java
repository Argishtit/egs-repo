package com.training.typeInformation;

/*
 * Exercise:      8
 * Description:   Write a method that takes an object and recursively prints all the classes
 *                in that object’s hierarchy.
 */

class B1{
}

class A1 extends B1{
}

class Parent1 extends A1{
    Parent1(){}
}

class Child1 extends Parent1{
    Child1(){}
}

class GrandChild1 extends Child1{
    GrandChild1(){}
}

public class Exercise8{
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
            System.out.println(i+". "+c.getSuperclass().getSimpleName());
            i++;
            return hierarchyInfo(c.getSuperclass().getCanonicalName());
        }
    }

    public static void main(String[] args) {
        System.out.println(hierarchyInfo("com.training.typeInformation.GrandChild1"));
    }
}