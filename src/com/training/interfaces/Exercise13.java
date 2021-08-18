package com.training.interfaces;

/*
 * Exercise:    13
 * Description: Create an interface, and inherit two new interfaces from that interface.
 *              Multiply inherit a third interface from the second two.
 *
 */

interface FirstInterface{}

interface SecondInterface extends FirstInterface{}

interface ThirdInterface extends FirstInterface{}

interface FourthInterface extends SecondInterface, ThirdInterface{}

public class Exercise13 {
}
