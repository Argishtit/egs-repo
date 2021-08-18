package com.training.strings;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Exercise:    12
 * Description: Modify Groups.java to count all of the unique words that do not start
 *              with a capital letter.
 */

public class Exercise12 {
    public static void main(String[] args) {
        final String POEM =
                "Twas brillig, and the slithy toves\n" +
                        "Did gyre and gimble in the wabe.\n" +
                        "All mimsy were the borogoves,\n" +
                        "And the mome raths outgrabe.\n\n" +
                        "Beware the Jabberwock, my son,\n" +
                        "The jaws that bite, the claws that catch,\n" +
                        "Beware the Jubjub bird, and shun\n" +
        "The frumious Bandersnatch.";

        Matcher m = Pattern.compile("(^[a-z]|\\s+[a-z])\\w+").matcher(POEM);
        Set<String> words = new TreeSet<String>();
        while(m.find()) {
            words.add(m.group());
        }
        System.out.println("Number of unique non-cap words = " + words.size());
        System.out.println(words);
    }
}
