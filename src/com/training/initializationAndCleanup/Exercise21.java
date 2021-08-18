package com.training.initializationAndCleanup;

/*
 * Exercise:    21
 * Description: Create an enum of the least-valuable six types of paper currency. Loop
 *              through the values( ) and print each value and its ordinal( ).
 */

public class Exercise21 {
    enum Currency {
        DOLLAR, EURO, AMD, RUBLE, FRANC
    }

    public static void showCurrencies() {
        for (Currency currency : Currency.values()) {
            System.out.print(currency);
            System.out.println(" " + currency.ordinal() + '\n');
        }
    }

    public static void main(String[] args) {
        showCurrencies();
    }
}
