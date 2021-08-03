package com.training.strings;

/*
 * Exercise: 20
 * Description: Create a class that contains int, long, float and double and String
 *              fields. Create a constructor for this class that takes a single String argument, and scans that
 *              string into the various fields. Add a toString( ) method and demonstrate that your class
 *              works correctly.
 */

import java.util.Scanner;

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

public class Exercise20 {
    public static void main(String[] args) {
        Scanning scanning = new Scanning("3 4 5.5 20.4 Cool");
        System.out.println(scanning);
    }
}
