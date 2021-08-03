package com.training.holdingYourObjects;

/*
 * Exercise:     4
 * Description:  Create a generator class that produces character names (as String
 *               objects) from your favorite movie (you can use Snow White or Star Wars as a fallback) each
 *               time you call next( ), and loops around to the beginning of the character list when it runs out
 *               of names. Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a
 *               LinkedHashSet, and a TreeSet, then print each container.
 */

import java.util.*;

class Generator {
    int key = 0;

    public String next() {
        switch (key) {
            default:
            case 0:
                key++;
                return "John Wick";
            case 1:
                key++;
                return "Winston";
            case 2:
                key++;
                return "Santino D'Antonio";
            case 3:
                key++;
                return "Bowery King";
            case 4:
                key++;
                return "Charon";
            case 5:
                key++;
                return "Giana D'Antonio";
            case 6:
                key++;
                return "Ares";
            case 7:
                key = 0;
                return "Aurelio";
        }
    }

    public void fillA(String[] a) {
        for (int i = 0; i < a.length; i++)
            a[i] = next();
    }

    public Collection fill(Collection<String> c, int n) {
        for (int i = 0; i < n; i++) c.add(next());
        return c;
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Generator gen = new Generator();
        String[] a = new String[10];
        gen.fillA(a);
        for(String s : a) System.out.print(s + ", ");
        System.out.println();
        System.out.println(gen.fill(new ArrayList<String>(), 10));
        System.out.println(gen.fill(new LinkedList<String>(), 10));
        System.out.println(gen.fill(new HashSet<String>(), 10));
        System.out.println(gen.fill(new LinkedHashSet<String>(), 10));
        System.out.println(gen.fill(new TreeSet<String>(), 10));
    }
}
