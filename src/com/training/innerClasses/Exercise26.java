package com.training.innerClasses;

/*
 * Exercise:     26
 *
 * Description:  Create a class with an inner class that has a non-default constructor
 *               (one that takes arguments). Create a second class with an inner class that inherits from the
 *               first inner class.
 */

public class Exercise26 {
    public static void main(String[] args) {
        SeparateOut separate = new SeparateOut(new Out(), "SeparateOut");
        System.out.println(separate.className);
    }
}

class Out {
    class In {
        String className;

        In(String className) {
            this.className = className;
        }
    }
}

class SeparateOut extends Out.In{
    SeparateOut(Out out, String s){
        out.super(s);
    }
}
