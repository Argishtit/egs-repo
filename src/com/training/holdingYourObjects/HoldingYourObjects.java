package com.training.holdingYourObjects;

import java.util.*;

/**
 * Description: This class is designed for covering the most part of the exercises from the ThinkingInJava4e book.
 * <p>
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

class Gerbil {
    private int gerbilNumber;

    Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("Gerbil's number: " + this.gerbilNumber);
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
        for (int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for (Integer i : c)
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

/*
 * Exercise:     7
 * Description:  Create a class, then make an initialized array of objects of your class. Fill
 *               a List from your array. Create a subset of your List by using subList( ), then remove this
 *               subset from your List.
 */

class Simple {
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

/*
 * Exercise:     11
 * Description:  Write a method that uses an Iterator to step through a Collection and
 *               print the toString( ) of each object in the container. Fill all the different types of
 *               Collections with objects and apply your method to each container
 */

class JustForTheMethod {

    public static void stepThrough(Collection c) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}

/*
 * Exercise:     12
 * Description:  Create and populate a List<Integer>. Create a second List<Integer>
 *               of the same size as the first, and use ListIterators to read elements from the first List and
 *               insert them into the second in reverse order. (You may want to explore a number of different
 *               ways to solve this problem.)
 */

// solution is written in Main.java

/*
 * Exercise:     14
 * Description:  Create an empty LinkedList<Integer>. Using a ListIterator, add
 *               Integers to the List by always inserting them in the middle of the List.
 *
 */

// solution is written in Main.java

/*
 * Exercise:     15
 * Description:  Stacks are often used to evaluate expressions in programming languages.
 *               Using net.mindview.util.Stack, evaluate the following expression, where’+’ means "push
 *               the following letter onto the stack," and’-’ means "pop the top of the stack and print it":
 *               "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—".
 */

class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }
}

/*
 * Exercise:     16
 * Description:  Create a Set of the vowels. Working from UniqueWords.Java, count
 *               and display the number of vowels in each input word, and also display the total number of
 *               vowels in the input file.
 */

// solution is written in Main.java

/*
 * Exercise:     17
 * Description:  Take the Gerbil class in Exercise 1 and put it into a Map instead,
 *               associating each Gerbil’s name (e.g. "Fuzzy" or "Spot") as a String (the key) for each
 *               Gerbil (the value) you put in the table. Get an Iterator for the keySet( ) and use it to move
 *               through the Map, looking up the Gerbil for each key and printing out the key and telling the
 *               Gerbil to hop( ).
 */

// solution is written in Main.java

/*
 * Exercise:     18
 * Description:  Fill a HashMap with key-value pairs. Print the results to show
 *               ordering by hash code. Extract the pairs, sort by key, and place the result into a
 *               LinkedHashMap. Show that the insertion order is maintained.
 *
 */

// solution is written in Main.java

/*
 * Exercise:     19
 * Description:  Repeat the previous exercise with a HashSet and LinkedHashSet.
 *
 */

// solution is written in Main.java

/*
 * Exercise:     27
 * Description: Write a class called Command that contains a String and has a
 *              method operation( ) that displays the String. Write a second class with a method that fills
 *              a Queue with Command objects and returns it. Pass the filled Queue to a method in a
 *              third class that consumes the objects in the Queue and calls their operation( ) methods.
 *
 */

class Command {
    String s;

    Command(String s) {
        this.s = s;
    }

    void operation() {
        System.out.print(s);
    }
}

class Build {
    Queue<Command> makeQ() {
        Queue<Command> q = new LinkedList<Command>();
        for (int i = 0; i < 10; i++)
            q.offer(new Command(i + " "));
        return q;
    }
}

/*
 * Exercise:    28
 * Description: Fill a PriorityQueue (using offer( )) with Double values created
 *              using java.util.Random, then remove the elements using poll( ) and display them.
 */

// solution is written in Main.java


/*
 * Exercise:    29
 * Description: Create a simple class that inherits from Object and contains no
 *              members, and show that you cannot successfully add multiple elements of that class to a
 *              PriorityQueue. This issue will be fully explained in the Containers in Depth chapter.
 */

// solution is written in Main.java