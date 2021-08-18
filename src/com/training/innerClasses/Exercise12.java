package com.training.innerClasses;

/*
 * Exercise:     12
 *
 * Description:   Repeat Exercise 7 using an anonymous inner class.
 *                (Create a class with a private field and a private method. Create an
 *                inner class with a method that modifies the outer-class field and calls the outer-class method.
 *                In a second outer-class method, create an object of the inner class and call its method, then
 *                show the effect on the outer-class object.)
 */

public class Exercise12 {
    public static void main(String[] args) {
          OuterOfAnonymous ooa = new OuterOfAnonymous();
          System.out.println(ooa.getClassName());
          ooa.modifyOuter().modifier();
          System.out.println(ooa.getClassName());
    }
}

interface ModifyOuter {
    public void modifier();
}

class OuterOfAnonymous {
    private String className = "OuterOfAnonymous";

    private String callMyName() {
        return "This is my new name: " + this.getClassName();
    }

    public String getClassName() {
        return this.className;
    }

    public ModifyOuter modifyOuter() {
        return new ModifyOuter() {
            @Override
            public void modifier() {
                OuterOfAnonymous.this.className = "Anonymous";
                System.out.println(OuterOfAnonymous.this.callMyName());
            }
        };
    }
}