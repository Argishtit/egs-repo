package com.training.innerClasses;

/*
 * Exercise:     11
 *
 * Description:  Create a private inner class that implements a public interface. Write
 *               a method that returns a reference to an instance of the private inner class, upcast to the
 *               interface. Show that the inner class is completely hidden by trying to downcast to it.
 *
 */

public class Exercise11 {
    public static void main(String[] args) {
        A a = new A();
        Show1 show = a.getB();                                 // Exercise 11
        show.showInformation("7 sur 7");
    }
}

class A {
    private class B implements Show1 {
        public void showInformation(String s) {
            System.out.println("I want to say: " + s);
        }
    }

    public B getB() {
        return new B();
    }
}
