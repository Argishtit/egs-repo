package com.training.initializationAndCleanup;

public class Main {

    public static void main(String[] args) {

	      InitializationAndCleanup.Dog.bark();
	      InitializationAndCleanup.Dog.bark((byte) 10);
	      InitializationAndCleanup.Dog.bark((short) 10);
        InitializationAndCleanup.Dog.bark(10);
	      InitializationAndCleanup.Dog.bark(10L);

        InitializationAndCleanup.ModifiedDog.bark(true, 2);
        InitializationAndCleanup.ModifiedDog.bark(2, true);


        InitializationAndCleanup.FinalizeExample finalizeExample = new InitializationAndCleanup.FinalizeExample();
        finalizeExample = null;
        System.gc();

        InitializationAndCleanup.FinalizeExampleModified finalizeExampleModified = new InitializationAndCleanup.FinalizeExampleModified(false);
        System.gc();
        System.out.println("sms");
        finalizeExampleModified = new InitializationAndCleanup.FinalizeExampleModified(true);
        System.gc();
        finalizeExampleModified = null;
        System.gc();

        InitializationAndCleanup.StaticInitialization.printInfo();

        InitializationAndCleanup.InstanceInitialization instanceInitialization = new InitializationAndCleanup.InstanceInitialization();
        instanceInitialization.printInfo();

        InitializationAndCleanup.showCurrencies();

       InitializationAndCleanup.currenciesDescription(InitializationAndCleanup.Currency.AMD);
    }
}
