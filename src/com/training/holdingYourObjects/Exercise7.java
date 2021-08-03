package com.training.holdingYourObjects;

/*
 * Exercise:     7
 * Description:  Create a class, then make an initialized array of objects of your class. Fill
 *               a List from your array. Create a subset of your List by using subList( ), then remove this
 *               subset from your List.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Simple {
    private static int counter = 1;
    private final int id = counter++;

    public int getId() {
        return id;
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        Simple[] simpleArray = new Simple[10];
        for (int i = 0; i < 10; i++){
            simpleArray[i] = new Simple();
        }

        List<Simple> simpleList = new ArrayList<>(Arrays.asList(simpleArray));
        List<Simple> simpleSublist = new ArrayList<>(simpleList.subList(0, 5));
        simpleList.removeAll(simpleSublist);

        for (Simple elem: simpleList){
            System.out.println(elem.getId());
        }
    }
}
