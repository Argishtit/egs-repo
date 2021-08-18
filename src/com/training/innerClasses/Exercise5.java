package com.training.innerClasses;

/*
 * Exercise:    5
 *
 * Description: Create a class with an inner class. In a separate class, make an instance of
 *              the inner class.
 */

public class Exercise5 {
}

class High {
    class Lower {

    }

    public Lower lower() {
        return new Lower();
    }
}

class Separate {
    High.Lower lower;

    Separate() {
        High high = new High();
        this.lower = high.lower();
    }
}