package com.ivik.excercises;

import com.ivik.excercises.stack.Stack;

public class Sort {
    public static Stack sortStack(Stack stack) { // ?
        Stack sortedStack = new Stack();
        int storage;
        int currentNumber;
        while (stack.peek() != -1) {
            storage = stack.pop();
            if (storage >= sortedStack.peek()) {
                sortedStack.push(storage);
            }
            else {
                currentNumber = sortedStack.pop();
                while (currentNumber >= storage) {
                    currentNumber = sortedStack.pop();
                    stack.push(currentNumber);
                }
                sortedStack.push(storage);
                while (currentNumber <= storage) {
                    currentNumber = stack.pop();
                    sortedStack.push(currentNumber);
                }
            }
        }
        return sortedStack;
    }
}
