package com.training.initializationAndCleanup;

/*
 * Exercise:    22
 * Description: Write a switch statement for the enum in the previous example. For
 *              each case, output a description of that particular currency.
 */

public class Exercise22 {
    public static void currenciesDescription(Exercise21.Currency currency) {

        switch (currency) {
            default:
            case AMD:
                System.out.println("This is the official currency of Armenia.");
                break;
            case EURO:
                System.out.println("This currency mostly used in many European countries");
                break;
            case FRANC:
                System.out.println("This currency mostly used in many francophone countries");
                break;
            case RUBLE:
                System.out.println("This is the official currency of Russia.");
                break;
            case DOLLAR:
                System.out.println("This is the official currency of USA.");
                break;
        }
    }

    public static void main(String[] args) {
        currenciesDescription(Exercise21.Currency.AMD);
    }
}
