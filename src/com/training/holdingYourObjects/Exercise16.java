package com.training.holdingYourObjects;

/*
 * Exercise:     16
 * Description:  Create a Set of the vowels. Working from UniqueWords.Java, count
 *               and display the number of vowels in each input word, and also display the total number of
 *               vowels in the input file.
 */

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the word which you wish: ");
        String word = input.nextLine();

        int count = 0;
        for (int i = 0; i < word.length(); i++){
            if (UniqueWords.vowels.contains(word.charAt(i))){
                count++;
            }
        }

        System.out.println(count);
    }
}
