package com.training.holdingYourObjects;

import java.util.*;

/**
 * Description: This class is designed for covering the most part of the exercises from the ThinkingInJava4e book.
 *
 * Chapter:     Holding your objects
 *
 * @author Argishti_tigranyan
 */

public class HoldingYourObjects {
}

/*
* Exercise:     1
* Description:  Create a new class called Gerbil with an int gerbilNumber that’s
*               initialized in the constructor. Give it a method called hop( ) that displays which gerbil
*               number this is, and that it’s hopping. Create an ArrayList and add Gerbil objects to the
*               List. Now use the get( ) method to move through the List and call hop( ) for each Gerbil.
 */

class Gerbil{
    private int gerbilNumber;

    Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }

    public void hop(){
        System.out.println("Gerbil's number: "+this.gerbilNumber);
        System.out.println("This gerbil is hoping");
    }
}

/*
 * Exercise:     2
 * Description:  Modify SimpleCollection.java to use a Set for c.
 *
 */

class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<Integer>();
        for(int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for(Integer i : c)
            System.out.print(i + ", ");
    }
}

/*
 * Exercise:     4
 * Description:  Create a generator class that produces character names (as String
 *               objects) from your favorite movie (you can use Snow White or Star Wars as a fallback) each
 *               time you call next( ), and loops around to the beginning of the character list when it runs out
 *               of names. Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a
 *               LinkedHashSet, and a TreeSet, then print each container.
 */

class Generator {
    int key = 0;
    public String next() {
        switch(key) {
            default:
            case 0 : key++; return "John Wick";
            case 1 : key++; return "Winston";
            case 2 : key++; return "Santino D'Antonio";
            case 3 : key++; return "Bowery King";
            case 4 : key++; return "Charon";
            case 5 : key++; return "Giana D'Antonio";
            case 6 : key++; return "Ares";
            case 7 : key = 0; return "Aurelio";
        }
    }
    public void fillA(String[] a) {
        for(int i = 0; i < a.length; i++)
            a[i] = next();
    }
    public Collection fill(Collection<String> c, int n) {
        for(int i = 0; i < n; i++) c.add(next());
        return c;
    }
}

/*
 * Exercise:     7
 * Description:  Create a class, then make an initialized array of objects of your class. Fill
 *               a List from your array. Create a subset of your List by using subList( ), then remove this
 *               subset from your List.
 */

class Simple{
    private static int counter = 1;
    private final int id = counter++;

    public int getId() {
        return id;
    }
}

/*
 * Exercise:     8
 * Description:  Modify Exercise l so it uses an Iterator to move through the List while
 *               calling hop( ).
 */

// solution is written in Main.java

