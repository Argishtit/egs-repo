package com.training.generics;

import java.util.Arrays;

/**
 * Exercise:        25
 * Description:      Create two interfaces and a class that implements both. Create two
 *                   generic methods, one whose argument parameter is bounded by the first interface and one
 *                   whose argument parameter is bounded by the second interface. Create an instance of the
 *                   class that implements both interfaces, and show that it can be used with both generic
 *                   methods.
 *
 * @author           Argishti Tigranyan
 */

interface First{}
interface Second{}

class Implementor implements First, Second{
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " " + Arrays.toString(this.getClass().getInterfaces());
    }
}

public class Exercise25 {
    public <T extends First> void firstMethod(T t){
        System.out.println("It works fine. "+t);
    }
    public <T extends Second> void secondMethod(T t){
        System.out.println("This one also works fine. "+t);
    }

    public static void main(String[] args) {
        Exercise25 exercise25 = new Exercise25();
        Implementor implementor = new Implementor();

        exercise25.firstMethod(implementor);
        exercise25.secondMethod(implementor);
    }
}
