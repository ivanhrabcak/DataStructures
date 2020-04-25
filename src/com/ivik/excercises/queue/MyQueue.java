package com.ivik.excercises.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    private Queue<Integer> queue;

    public MyQueue() {
        this.queue = new LinkedList<Integer>();
    }

    public Queue<Integer> getQueue() {
        return queue;
    }

    public void add(int number) {
        queue.add(number);
    }


    public int get(int index) {
        Queue<Integer> storage = new LinkedList<>();
        int returnValue = -1;
        Integer currentNumber = queue.poll();
        int length = 0;
        for (int i = 0; currentNumber != null; i++) {
            if (i == index) {
                returnValue = currentNumber;
            }
            length++;
            storage.add(currentNumber);
            currentNumber = queue.poll();
        }

        for (int i = 0; i < length; i++) {
            queue.add(storage.poll());
        }

        return returnValue;
    }

    public void remove(int index) {
        Queue<Integer> storage = new LinkedList<>();
        Integer currentNumber = queue.poll();
        int length = 0;
        for (int i = 0; currentNumber != null; i++) {
            if (i == index) {
                currentNumber = queue.poll();
                continue;
            }
            length++;
            storage.add(currentNumber);
            currentNumber = queue.poll();
        }

        for (int i = 0; i < length; i++) {
            queue.add(storage.poll());
        }
    }

    public void switchElement(int x, int y) {
        int xValue = 0; int yValue = 0;
        int length = 0;
        Queue<Integer> storage = new LinkedList<>();
        Integer currentNumber = queue.poll();
        for (int i = 0; currentNumber != null; i++) {
            if (i == x) {
                xValue = currentNumber;
            }
            else if (i == y) {
                yValue = currentNumber;
            }
            length++;
            storage.add(currentNumber);
            currentNumber = queue.poll();
        }

        for (int i = 0; i < length; i++) {
            if (i == x) {
                queue.add(yValue);
                storage.poll();
            }
            else if (i == y) {
                queue.add(xValue);
                storage.poll();
            }
            else {
                queue.add(storage.poll());
            }

        }
    }
}
