package com.training.innerClasses;

/*
 * Exercise:     9
 *
 * Description:  Create an interface with at least one method, and implement that
 *               interface by defining an inner class within a method, which returns a reference to your
 *               interface.
 */

public class Exercise9 {
    public static void main(String[] args) {
        Higher higher = new Higher();
        higher.returnReference().showInformation();
    }
}


interface Show{
    public void showInformation();
}

class Higher{
    public Show returnReference(){
        class High implements Show{
            public void showInformation(){
                System.out.println("Hello from inner");
            }
        }
        Show show = new High();
        return show;
    }
}