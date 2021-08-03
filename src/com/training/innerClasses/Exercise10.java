package com.training.innerClasses;

/*
 * Exercise:     10
 *
 * Description:  Repeat the previous exercise but define the inner class within a scope
 *               within a method.
 */

public class Exercise10 {
    public static void main(String[] args) {
          Higher2 higher = new Higher2();                         // Exercise 10
          higher.action(true).showInformation("Hello from Inner");
    }
}

interface Show1 {
    void showInformation(String s);
}

class Higher2 {

    Show1 action(boolean b) {
        if (b) {
            class Inner implements Show1 {
                public void showInformation(String s) {
                    System.out.println(s);
                }
            }
            return new Inner();
        }
        return null;
    }
}
