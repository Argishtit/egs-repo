package com.training.generics;

/**
 * Exercise:        34
 * Description:     Create a self-bounded generic type that contains an abstract method
 *                  that takes an argument of the generic type parameter and produces a return value of the
 *                  generic type parameter. In a non-abstract method of the class, call the abstract method
 *                  and return its result. Inherit from the self-bounded type and test the resulting class.
 *
 * @author          Argishti_Tigranyan
 */

abstract class MySelfBounded<T extends MySelfBounded<T>>{
    public abstract T justAMethod(T t);

    public T justACaller(T t){
        System.out.println("justACaller");
        return justAMethod(t);
    }
}

class Tester extends MySelfBounded<Tester>{
    @Override
    public Tester justAMethod(Tester tester) {
        System.out.println("justAMethod");
        return tester;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}

public class Exercise34 {
    public static void main(String[] args) {
        Tester tester = new Tester();

        tester.justAMethod(tester).justACaller(tester);
        //System.out.println(tester.justAMethod(tester).justACaller(tester));
    }
}
