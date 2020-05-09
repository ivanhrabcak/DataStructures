package com.ivik.excercises.stack;

public class Stack {
    private StackNode start;
    private int size;

    public void push(int i) {
        StackNode newNode = new StackNode(i);
        newNode.setNext(start);
        start = newNode;
        size++;
    }

    public int pop() {
        if (start == null) {
            return -1;
        }
        int value = start.getNumber();
        start = start.getNext();
        size--;
        return value;

    }

    public int peek() {
        if (start == null) {
            return -1;
        }
        return start.getNumber();
    }

    public void empty() {
        start = null;
        size = 0;
    }

    public void remove(int index) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int currentNumber = pop();
        Stack stack = new Stack();
        for (int i = 0; i < size; i++) {
            if (!(i == index)) {
                stack.push(currentNumber);
            }
            currentNumber = pop();
        }
        int l = size;
        empty();
        for (int i = 0; i < l; i++) {
            push(stack.pop());
        }
    }

    public int get(int index) { // slow?
        if (size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Stack storage = new Stack();
        int returnValue = -1;
        int currentNumber = pop();
        int length = size;
        for (int i = 0; currentNumber != -1; i++) {
            if (i == index) {
                returnValue = currentNumber;
            }
            storage.push(currentNumber);

            currentNumber = pop();
        }



        for (int j = 0; j < length; j++) {
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
