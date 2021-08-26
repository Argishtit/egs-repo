package com.training.generics;

/**
 * Exercise:        28
 * Description:     Create a generic class Generic1<T> with a single method that takes an
 *                  argument of type T. Create a second generic class Generic2<T> with a single method that
 *                  returns an argument of type T. Write a generic method with a contravariant argument of the first
 *                  generic class that calls its method. Write a second generic method with a covariant argument of
 *                  the second generic class that calls its method.
 *
 * @author          Argishti_Tigranyan
 */

class Generic1<T>{

    T t;
    void take(T t) { this.t = t; }

}

class Generic2<T>{

    T t;
    T give() { return t; }

}

public class Exercise28 {
    <T> void contra(Generic1<? super T> g1t, T t) {
        g1t.take(t);
    }
    <T> T co(Generic2<? extends T> g2t) {
        return g2t.give();
    }

    public static void main(String[] args) {
        Exercise28 ex28 = new Exercise28();
        ex28.contra(new Generic1<Number>(), new Integer(20));
        System.out.println(ex28.co(new Generic2<Number>()));
    }
}
