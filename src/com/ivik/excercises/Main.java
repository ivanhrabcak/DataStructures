package com.ivik.excercises;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Node start = new Node();
        Node previousNode = start;
        for (int i = 0; i <= 10; i++) {
            Node nextNode = new Node(null, previousNode, i);
            previousNode.next = nextNode;
            previousNode = nextNode;
        }

        /* Linked list */
        LinkedList list = new LinkedList(start);
        System.out.println(list);

        // get middle element from the list
        System.out.println(list.get(list.getSize() / 2));

        // remove middle element from the list
        list.remove(list.getSize() / 2);

        // get middle element from the list
        System.out.println(list.get(list.getSize() / 2));

        System.out.println(list);

        Stack<Integer> stack = new Stack<>();


    }
 }
