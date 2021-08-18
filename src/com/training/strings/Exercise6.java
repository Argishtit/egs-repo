package com.training.strings;

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

public class Exercise6 {
    public static void main(String[] args) {
        Format format = new Format(10, 20L, 30.5f, 40.1);
        System.out.println(format);
    }
}
