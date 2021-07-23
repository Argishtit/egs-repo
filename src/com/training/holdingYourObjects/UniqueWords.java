package com.training.holdingYourObjects;

/*
 * Exercise:     16
 * Description:  Create a Set of the vowels. Working from UniqueWords.Java, count
 *               and display the number of vowels in each input word, and also display the total number of
 *               vowels in the input file.
 */

import java.util.HashSet;
import java.util.Set;

public class UniqueWords {
    final static Set<Character> vowels = new HashSet<>();
    static {
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');
    }

}
