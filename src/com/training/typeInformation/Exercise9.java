package com.training.typeInformation;

/*
 * Exercise:      9
 * Description:   Modify the previous exercise so that it uses
 *                Class.getDeclaredFields( ) to also display information about the fields in a class.
 */

import java.util.Arrays;

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

public class Exercise9{
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
            System.out.println(i+". "+c.getSuperclass().getSimpleName()+"\n"+ Arrays.toString(c.getSuperclass().getDeclaredFields()));
            i++;
            return hierarchyInfo(c.getSuperclass().getCanonicalName());
        }
    }

    public static void main(String[] args) {
        System.out.println(hierarchyInfo("com.training.typeInformation.GrandChild"));
    }
}
