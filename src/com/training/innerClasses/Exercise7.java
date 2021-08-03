package com.training.innerClasses;

/*
 * Exercise:     7
 *
 * Description:  Create a class with a private field and a private method. Create an
 *               inner class with a method that modifies the outer-class field and calls the outer-class method.
 *               In a second outer-class method, create an object of the inner class and call its method, then
 *               show the effect on the outer-class object.
 */

public class Exercise7 {
    public static void main(String[] args) {
        Just just = new Just();
        just.inner();
    }
}

class Just {
    private String className = "Just";

    public String getClassName() {
        return this.className;
    }

    class JustModifier {
        public String modifier() {
            Just.this.className = "JustModifier";
            return Just.this.getClassName();
        }
    }

    public void inner() {
        JustModifier inner = new JustModifier();
        System.out.println(inner.modifier());
    }
}