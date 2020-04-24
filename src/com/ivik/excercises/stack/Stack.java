package com.ivik.excercises.stack;

public class Stack {
    private StackNode start;

    public void push(int i) {
        StackNode newNode = new StackNode(i);
        newNode.setNext(start);
        start = newNode;
    }

    public int pop() {
        if (start == null) {
            return -1;
        }
        int value = start.getNumber();
        start = start.getNext();
        return value;
    }

    public int peek() {
        return start.getNumber();
    }

    public void empty() {
        start = null;
    }

    public void remove(int index) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int currentNumber = pop();
        Stack stack = new Stack();
        int l = 0;
        for (int i = 0; currentNumber != -1; i++) {
            if (!(i == index)) {
                stack.push(currentNumber);
                l++;
            }
            currentNumber = pop();
        }

        if (index > l) {
            throw new ArrayIndexOutOfBoundsException();
        }

        empty();
        for (int i = 0; i < l; i++) {
            push(stack.pop());
        }
    }

    public int get(int index) { // slow?
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Stack storage = new Stack();
        int returnValue = -1;
        int currentNumber = pop();
        int length = 0;
        for (int i = 0; currentNumber != -1; i++) {
            if (i == index) {
                returnValue = currentNumber;
            }
            storage.push(currentNumber);

            currentNumber = pop();
            length++;
        }

        if (length < index) {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int j = 0; j <= length; j++) {
            push(storage.pop());
        }

        return returnValue;
    }

    public String toString() {
        String array = "[";
        StackNode currentNode = start;
        while (true) {
            if (!(currentNode.getNext() == null)) {
                array = array + currentNode.getNumber() + ", ";
            }
            else {
                array = array + currentNode.getNumber() + "]";
                break;
            }

            currentNode = currentNode.getNext();

        }

        return array;

    }
}
