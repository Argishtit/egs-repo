package com.training.polymorphism;

/*
 * Exercise:    17
 * Description: Using the Cycle hierarchy from Exercise 1, add a balance( ) method to
 *              Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast
 *              them to an array of Cycle. Try to call balance( ) on each element of the array and observe what
 *              happens.
 */

class Cycle {

    String className = "Cycle";

    public static void ride(Cycle cycle) {
        cycle.printClassname();
    }

    public void printClassname() {
        System.out.println("Riding a cycle");
    }
}


class Unicycle extends Cycle {
    public void printClassname() {
        System.out.println("Riding a unicycle");
    }
}

class Bicycle extends Cycle {
    public void printClassname() {
        System.out.println("Riding a bicycle");
    }

    public void balance(){
        System.out.println("Balancing bicycle.");
    }
}

class Tricycle extends Cycle {
    public void printClassname() {
        System.out.println("Riding a tricycle");
    }

    public void balance(){
        System.out.println("Balancing tricycle.");
    }
}

public class Exercise17 {
    public static void main(String[] args) {
        Cycle[] cycles = {new Unicycle(), new Bicycle(), new Tricycle()};

        for (Cycle cycle : cycles) {              // here we have error,
            //Cycle.balance();                      // because not all the "Cycles" have balance method.
        }
    }
}
