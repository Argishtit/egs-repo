package com.training.typeInformation;

/*
 * Exercise:      25
 * Description:   Create a class containing private, protected and package-access
 *                methods. Write code to access these methods from outside of the class’s package.
 *
 * Note:          Check the actions connected with this exercise in com.training.typeInformation.test
 *                package's Main.java.
 */

public class Exercise25 {
    int i = 20;
    protected String s = "If you are out from the package, only for subclasses!!!";
    private String s2 = "Am I private?";

    void firstMethod(){
        System.out.println("Default access");
    }

    protected void secondMethod(){
        System.out.println("protected access");
    }

    private void thirdMethod(){
        System.out.println("private access");
    }

    @Override
    public String toString() {
        return "TypeInformation{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }
}
