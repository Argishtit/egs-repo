package com.training.strings;

import java.util.Scanner;

/**
 * Description: This class is designed for covering the most part of the exercises from the book ThinkingInJava4e.
 *              Some exercises may represent separate classes, actions with which are shown in Main.java file.
 *
 * @chapter Strings
 * @author Argishti_Tigranyan
 */

public class Strings {
}

/*
* Exercise: 6
* Description: Create a class that contains int, long, float and double fields. Create a
*              toString( ) method for this class that uses String.format( ), and demonstrate that your
*              class works correctly.
 */

class Format{

    int i;
    long l;
    float f;
    double d;

    Format(int i, long l, float f, double d){
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
    }

    @Override
    public String toString() {
        return String.format("int: %d, long: %d, float: %f, double: %f", i, l, f, d);
    }
}

/*
 * Exercise: 10
 * Description: For the phrase "Java now has regular expressions" evaluate whether the
 *              following expressions will find a match:
 *              ^Java
 *              \Breg.*
 *              n.w\s+h(a|i)s
 *              s?
 *              s*
 *              s+
 *              s{4}
 *              S{1}.
 *              s{0,3}
 */

// solution added in Main.java

/*
 * Exercise:    12
 * Description: Modify Groups.java to count all of the unique words that do not start
 *              with a capital letter.
 */

// solution added in Main.java

/*
 * Exercise: 20
 * Description: Create a class that contains int, long, float and double and String
 *              fields. Create a constructor for this class that takes a single String argument, and scans that
 *              string into the various fields. Add a toString( ) method and demonstrate that your class
 *              works correctly.
 */

class Scanning{
    int i;
    long l;
    float f;
    double d;
    String s;

    Scanning(String input){
        Scanner scanner = new Scanner(input);
        this.i = scanner.nextInt();
        this.l = scanner.nextLong();
        this.f = scanner.nextFloat();
        this.d = scanner.nextDouble();
        this.s = scanner.nextLine();
    }

    @Override
    public String toString() {
        return String.format("int: %d ,\nlong: %d ,\nfloat: %f ,\ndouble: %f ,\nString: %s .\n", i, l, f, d, s);
    }
}