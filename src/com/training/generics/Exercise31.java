package com.training.generics;

/**
 * Exercise:        31
 * Description:     Remove all the generics from MultipleInterfaceVariants.java and
 *                  modify the code so that the example compiles.
 *
 * @author          Argishti_Tigranyan
 */

// this way is ok
interface Payable<T> {}
class Employee implements Payable {}

class Hourly extends Employee implements Payable {}

/* this way does not

interface Payable<T> {}

class Employee implements Payable<Employee> {}

class Hourly extends Employee implements Payable<Hourly> {}

*/

public class Exercise31 {
}
