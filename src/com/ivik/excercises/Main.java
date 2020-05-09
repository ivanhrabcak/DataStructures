package com.ivik.excercises;

import com.ivik.excercises.hashmap.MyHashMap;
import com.ivik.excercises.hashmap.Person;
import com.ivik.excercises.linkedlist.LinkedList;
import com.ivik.excercises.linkedlist.Node;
import com.ivik.excercises.queue.MyQueue;
import com.ivik.excercises.stack.Stack;

import java.util.Queue;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Node start = new Node();
        start.number = 1;
        Node previousNode = start;
        for (int i = 2; i <= 10; i++) {
            Node nextNode = new Node(null, previousNode, i);
            previousNode.next = nextNode;
            previousNode = nextNode;
        }

        /* Linked list */
        LinkedList list = new LinkedList(start);
//        System.out.println(list.getSize());

        // get middle element from the list
        list.removeMiddleElement();

        System.out.println(list.toString());

        // remove middle element from the list
//        list.remove(list.getSize() / 2);

        // get middle element from the list
//        System.out.println(list.get(list.getSize() / 2));

//        System.out.println(list);

//        /* Stack */
//        Stack stack = new Stack();
//        for (int i = 0; i <= 10; i++) {
//            stack.push(i);
//        }
//        stack.remove(5);
//        System.out.println(stack.toString());


        /* Stack sort */
//        System.out.println(Sort.sortStack(stack));


        /* Queue */
//        MyQueue queue = new MyQueue();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        System.out.println(queue.getQueue());
//
//        System.out.println(queue.get(1));
//        queue.remove(0);
//        queue.switchElement(0, 1);
//        System.out.println(queue.getQueue());

        /* HashSet */

//        String elephant = "elephant"; // has duplicate characters
//        System.out.println(MyHashSet.hasDuplicateChars(elephant)); // true
//        System.out.println(MyHashSet.hasDuplicateCharsButBetter(elephant)); // true
//
//        String dog = "dog"; // doesn't have duplicate characters
//        System.out.println(MyHashSet.hasDuplicateCharsButBetter(dog)); // false

        /* HashMap */

//        Person[] people = {new Person(81, "George Rademacher"),
//                            new Person(68, "Jeffrey M. Cutler"),
//                            new Person(30, "John T. Graves"),
//                            new Person(32, "Kenneth B. Carver"),
//                            new Person(20 ,"Dorothy O. Matthews"),
//                            new Person(71, "Peggy C. Watterson"),
//                            new Person(70, "Thomas S. Redd"),
//                            new Person(61, "Aaron L. Dulaney"),
//                            new Person(58, "Jesse D. Millhouse")};


    }
 }
