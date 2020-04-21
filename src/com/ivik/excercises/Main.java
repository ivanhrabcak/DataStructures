package com.ivik.excercises;

import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Node start = new Node();
        Node previousNode = start;
        for (int i = 0; i <= 10; i++) {
            Node nextNode = new Node(null, previousNode, i);
            previousNode.next = nextNode;
            previousNode = nextNode;
        }

        /* Linked list */
//        LinkedList list = new LinkedList(start);
//        System.out.println(list.getSize());

        // get middle element from the list
//        System.out.println(list.get(list.getSize() / 2));

        // remove middle element from the list
//        list.remove(list.getSize() / 2);

        // get middle element from the list
//        System.out.println(list.get(list.getSize() / 2));

//        System.out.println(list);

//        /* Stack */
        Stack stack = new Stack();
        for (int i = 0; i <= 10; i++) {
            stack.push(i);
        }

        stack.remove(5); // remove 7
        System.out.println(stack.toString()); // [10, 9, 8, 6, 5, 4, 3, 2, 1, 0]



    }
 }
