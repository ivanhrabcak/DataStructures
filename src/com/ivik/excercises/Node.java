package com.ivik.excercises;

public class Node {
    public Node next;
    public Node previous;
    public int number;

    public Node(Node next, Node previous, int number) {
        this.next = next;
        this.previous = previous;
        this.number = number;
    }

    public Node() {
        this.next = null;
        this.previous = null;
        this.number = 0;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
