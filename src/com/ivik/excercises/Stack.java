package com.ivik.excercises;

import java.util.ArrayList;

public class Stack {
    private StackNode start;

    public void push(int i) {
        StackNode newNode = new StackNode(i);
        newNode.setNext(start);
        start = newNode;
    }

    public void pop() {
        start = start.getNext();
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
        StackNode currentNode = start;
        Stack stack = new Stack();
        int l = 0;
        for (int i = 0; true; i++) {
            if (!(i == index)) {
                stack.push(currentNode.getNumber());
            }
            if (currentNode.getNext() == null) {
                break;
            }
            currentNode = currentNode.getNext();
            l++;
        }

        if (index > l) {
            throw new ArrayIndexOutOfBoundsException();
        }

        empty();
        for (int i = 0; i < l; i++) {
            push(stack.peek());
            stack.pop();
        }
    }

    public int get(int index) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        StackNode currentNode = start;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                return currentNode.getNumber();
            }
            currentNode = currentNode.getNext();
        }
        throw new ArrayIndexOutOfBoundsException();
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
