package com.training.innerClasses;

/*
 * Exercise:     20
 *
 * Description:  Create an interface containing a nested class. Implement this interface
 *               and create an instance of the nested class.
 */

public class Exercise20 {
    public static void main(String[] args) {
          ClassInInterface cif = new ClassInInterface.InterfaceInner();
          cif.displayWord("Barlus");
    }
}

interface ClassInInterface {
    public void displayWord(String word);

    class InterfaceInner implements ClassInInterface {
        public void displayWord(String word) {
            System.out.println(word);
        }
    }
}