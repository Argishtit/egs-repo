package com.training.initializationAndCleanup;

/*
 * Exercise:    11
 * Description: Modify the previous exercise so that your finalize( ) will always be called.
 */

public class Exercise11 {
    public static void main(String[] args) {
        FinalizeExampleModified finalizeExampleModified = new FinalizeExampleModified(false);
        System.gc();
        System.out.println("sms");
        finalizeExampleModified = new FinalizeExampleModified(true);
        System.gc();
        finalizeExampleModified = null;
        System.gc();
    }
}

class FinalizeExampleModified {

    boolean in;

    FinalizeExampleModified(boolean in) {
        System.out.println("Hello from constructor");
        this.in = in;
    }

    @Override
    protected void finalize() throws Throwable {
        if (this.in) {
            super.finalize();
            System.out.println("If you see this message that means that your garbage is collected.");
        }
    }
}