package com.ivik.excercises.hashmap;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    public final static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public Map<Character, Integer> countAllLetters(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        char[] string = s.toCharArray();
        for (char letter : alphabet) {
            int currentLetterCounter = 0;
            for (char ch : string) {
                if (ch == letter) {
                    currentLetterCounter++;
                }
            }
            counter.put(letter, currentLetterCounter);
        }
        return counter;
    }

    public int countNonDuplicatePeople(Person[] people) {
        HashMap<Person, Integer> counter = new HashMap<>();
        for (Person person : people) {
            if (counter.containsKey(person)) {
                counter.remove(person);
                continue;
            }
            counter.put(person, person.getAge());
        }

        int allAges = 0;
        for (int age : counter.values()) {
            allAges += age;
        }

        return allAges;
    }

    public Set<Person> getNonDuplicatePeople(Person[] people) {
        HashMap<Person, Integer> counter = new HashMap<>();
        for (Person person : people) {
            if (counter.containsKey(person)) {
                counter.remove(person);
                continue;
            }
            counter.put(person, person.getAge());
        }

        int allAges = 0;
        for (int age : counter.values()) {
            allAges += age;
        }

        return counter.keySet();
    }

    public int countLetter(String s, char letter) {
        int counter = 0;
        for (char ch : s.toCharArray()) {
            if (ch == letter) {
                counter++;
            }
        }
        return counter;
    }
}
