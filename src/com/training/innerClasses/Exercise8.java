package com.training.innerClasses;

/*
 * Exercise:     8
 *
 * Description:  Determine whether an outer class has access to the private elements of
 *               its inner class.
 */

public class Exercise8 {
    public static void main(String[] args) {
        OuterDetermine od = new OuterDetermine();
        od.display();
    }
}

class OuterDetermine {

    public void display() {
        System.out.println(new Inner().className);
        System.out.println("If you see additional information above that means that Outer " +
                "class has access to Inner class' private methods");
    }

    class Inner {
        private String className = "Inner";
    }
}
