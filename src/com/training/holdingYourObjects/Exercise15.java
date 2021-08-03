package com.training.holdingYourObjects;

/*
 * Exercise:     15
 * Description:  Stacks are often used to evaluate expressions in programming languages.
 *               Using net.mindview.util.Stack, evaluate the following expression, where’+’ means "push
 *               the following letter onto the stack," and’-’ means "pop the top of the stack and print it":
 *               "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—".
 */

import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }
}

public class Exercise15 {
    public static void main(String[] args) {
        String expression = "+U+n+c---+e+r+t---+a+i+n+t+y---+ -+r+u--+l+e+s---";
        Stack<Character> customStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++){
            switch (expression.charAt(i)){
                case '+':
                    customStack.push(expression.charAt(i+1));
                    i++;
                    break;
                case '-':
                    customStack.pop();
                    break;
                default:
                    i++;
            }
        }

        while(!customStack.empty()){
            System.out.print(customStack.pop()+" ");
        }
    }
}
