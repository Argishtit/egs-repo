package com.training.interfaces;

public class Main {

    public static void main(String[] args) {

        //Stagnation stagnation = new Stagnation();         // Exercise 2

//        Derived derived = new Derived();                  // Exercise 3
//        derived.print();

//        NotEmpty notEmpty = new NotEmpty();               // Exercise 4
//        NotEmpty.caller(notEmpty);

        DerivedOne derivedOne = new DerivedOne();
        DerivedOne.firstMethod(derivedOne);
        DerivedOne.secondMethod(derivedOne);             // Exercise 14
        DerivedOne.thirdMethod(derivedOne);
        DerivedOne.fourthMethod(derivedOne);
    }
}
