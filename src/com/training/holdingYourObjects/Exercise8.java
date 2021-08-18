package com.training.holdingYourObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Exercise:     8
 * Description:  Modify Exercise l so it uses an Iterator to move through the List while
 *               calling hop( ).
 */

public class Exercise8 {
    public static void main(String[] args) {
        List<Gerbil> gerbilList = new ArrayList<>();

        for (int i = 1; i < 11; i++){
            gerbilList.add(new Gerbil(i));
        }

        Iterator<Gerbil> gerbilIterator = gerbilList.iterator();

        while (gerbilIterator.hasNext()){
            gerbilIterator.next().hop();
        }
    }
}
