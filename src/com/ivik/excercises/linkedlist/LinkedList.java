package com.ivik.excercises.linkedlist;

public class LinkedList {
    private Node start;

    public LinkedList(Node start) {
        this.start = start;
    }

    public int getSize() {
        Node currentNode = start;
        int l = 0;
        while (currentNode != null) {
            currentNode = currentNode.next;
            l++;
        }
        return l;
    }

    public void remove(int index) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {
            start = start.next;
        }

        int i = 0;
        Node currentNode = start;
        while (true) {
            if (i == index) {
                currentNode.previous.next = currentNode.next;
                return;
            }
            if (currentNode == null) {
                throw new ArrayIndexOutOfBoundsException();
            }
            currentNode = currentNode.next;
            i++;
        }
    }

    public int get(int index) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {
            return start.number;
        }

        int i = 0;
        Node currentNode = start;
        while (true) {
            if (i == index) {
                return currentNode.number;
            }
            if (currentNode == null) {
                throw new ArrayIndexOutOfBoundsException();
            }
            currentNode = currentNode.next;
            i++;
        }
    }

    @Override
    public String toString() {
        String s = "[";
        Node currentNode = start;
        while (true) {
            if (currentNode.next == null) {
                s = s + String.valueOf(currentNode.number) + "]";
                break;
            }
            else {
                s = s + String.valueOf(currentNode.number) + ", ";
            }
            currentNode = currentNode.next;
        }
        return s;
    }
}
