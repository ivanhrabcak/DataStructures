package com.ivik.excercises.hashset;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet {

    public static boolean hasDuplicateChars(String s) {
        Set<Character> characters = new HashSet<>();
        char[] string = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char ch = string[i];
            if (characters.contains(ch)) {
                return true;
            }
            characters.add(ch);
        }
        return false;
    }

    public static boolean hasDuplicateCharsButBetter(String s) {
        Set<Character> characters = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (characters.contains(ch)) {
                return true;
            }
            characters.add(ch);
        }
        return false;
    }
}
