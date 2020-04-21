package com.ivik.excercises;

public class StackNode { // Borrowed
    private StackNode next;
    private int number;

    public StackNode(int number) {
        this.number = number;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }

    public StackNode getNext() {
        return next;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
