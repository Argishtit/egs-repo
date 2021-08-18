package com.training.innerClasses;

/*
 * Exercise:      19
 *
 * Description:  Create a class containing an inner class that itself contains an inner
 *               class. Repeat this using nested classes. Note the names of the .class files produced by the
 *               compiler.
 */

public class Exercise19 {
    public static void main(String[] args) {
        Deep.Deeper.Deepest wow = new Deep.Deeper.Deepest();  // Exercise 19
    }
}

class Deep {
    static class Deeper {
        static class Deepest {
            Deepest() {
                System.out.println("hlo");
            }
        }
    }
}