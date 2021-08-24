package com.training.generics;

/**
 * Exercise:        20
 * Description:     Create an interface with two methods, and a class that implements that
 * interface and adds another method. In another class, create a generic method with an
 * argument type that is bounded by the interface, and show that the methods in the interface
 * are callable inside this generic method. In main( ), pass an instance of the implementing
 * class to the generic method.
 *
 * @author Argishti_Tigranyan
 */

interface A {
    void displayInformation();

    void displayInformation(String word);
}

class B implements A {
    @Override
    public void displayInformation() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public void displayInformation(String word) {
        System.out.println(this.getClass().getSimpleName() + " " + word);
    }

    public void displayInformation(int number) {
        System.out.println(this.getClass().getSimpleName() + " " + number);
    }
}

class C {
    public static <T extends A> void displays(T t) {
        t.displayInformation();
        t.displayInformation("Hello");
    }
}

public class Exercise20 {
    public static void main(String[] args) {
        B b = new B();
        b.displayInformation(10);
        C.displays(b);
    }

}
