package com.hackerrank;
import java.util.List;

/**
 * Description: Sam's house has an apple tree and an orange tree that yield an abundance of fruit.
 *              Using the information given below, determine the number of apples and oranges that
 *              land on Sam's house.
 *
 *              In the diagram below:
 *
 *              The red region denotes the house, where s is the start point, and t is the endpoint.
 *              The apple tree is to the left of the house, and the orange tree is to its right.
 *              Assume the trees are located on a single point, where the apple tree is at point a,
 *              and the orange tree is at point b.
 *              When a fruit falls from its tree, it lands d units of distance from its tree of origin along
 *              the x-axis. *A negative value of d means the fruit fell d units to the tree's left, and a
 *              positive value of d means it falls d units to the tree's right. *
 *
 *              Given the value of d for m apples and b oranges, determine how many apples and oranges will
 *              fall on Sam's house (i.e., in the inclusive range [s, t])?
 *
 * @author Argishti_Tigranyan
 */

public class Exercise13 {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int appleCount = 0;
        int orangeCount = 0;

        for(int i = 0; i < apples.size(); i++){
            if(apples.get(i) + a >= s && apples.get(i) + a <= t){
                appleCount++;
            }
        }

        for(int i = 0; i < oranges.size(); i++){
            if(oranges.get(i) + b >= s && oranges.get(i) + b <= t){
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.print(orangeCount);


    }
}
