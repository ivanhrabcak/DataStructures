package com.ivik.excercises;

public class LinkedList {
    private Node start;
    private int size;
    private Node end;

    public LinkedList(Node start) {
        this.start = start;
        Node currentNode = start;
        int l = 0;
        l++;
        if (currentNode.next == null) {
            end = currentNode;
        }
        currentNode = currentNode.next;

        while (currentNode != null) {
            l++;
            if (currentNode.next == null) {
                end = currentNode;
            }
            currentNode = currentNode.next;
        }
        size = l;
    }

    public int getSize() {
        return size;
    }

    public void remove(int index) {
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {
            start = start.next;
        }
        if (index > (size / 2)) {
            Node currentNode = end;
            for (int i = size; i >= size / 2; i--) {
                if (i == index) {
                    currentNode.previous.next = currentNode.next; // XD
                    size--;
                    return;
                }
                currentNode = currentNode.previous;
            }
        }
        else {
            Node currentNode = start;
            for (int i = 0; i <= size / 2; i++) {
                if (i == index) {
                    currentNode.previous.next = currentNode.next;
                    size--;
                    return;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public int get(int index) {
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {
            return start.number;
        }
        if (index > (size / 2)) {
            Node currentNode = end;
            for (int i = size; i >= size / 2; i--) {
                if (i == index) {
                    return currentNode.number;
                }
                currentNode = currentNode.previous;
            }
        }
        else {
            Node currentNode = start;
            for (int i = 0; i <= size / 2; i++) {
                if (i == index) {
                    return currentNode.number;
                }
                currentNode = currentNode.next;
            }

        }
        return -1;
    }

    @Override
    public String toString() {
        String s = "[";
        Node currentNode = start;
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                s = s + String.valueOf(currentNode.number) + "]";
            }
            else {
                s = s + String.valueOf(currentNode.number) + ", ";
            }
            currentNode = currentNode.next;
        }
        return s;
    }
}
