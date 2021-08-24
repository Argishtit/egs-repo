package com.training.generics;

import sun.nio.cs.Surrogate;

/**
 * Exercise:         9
 * Description:      Modify the previous exercise so that one of f( )’s arguments is non-parameterized.
 *
 */

class GenericMethod{
    public <T, Y> void genericMethod(T t, Y y, String word){
        System.out.println(t.getClass().getSimpleName());
        System.out.println(y.getClass().getSimpleName());
        System.out.println(word.getClass().getSimpleName());
    }
}

public class Exercise10 {
    public static void main(String[] args) {
        Robot robot = new Robot("Wall-E");
        GenericMethod gm = new GenericMethod();
        gm.genericMethod(robot, 20.5, "Hello");
    }
}
