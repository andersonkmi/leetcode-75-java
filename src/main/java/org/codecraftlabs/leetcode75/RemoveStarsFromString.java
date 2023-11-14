package org.codecraftlabs.leetcode75;

import java.util.Stack;

public class RemoveStarsFromString {
    public String removeStars(String word) {
        char[] wordAsCharArray = word.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char c : wordAsCharArray) {
            if (c == '*') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        int size = stack.size();
        char[] resultingWord = new char[size];
        int position = size - 1;
        while (!stack.isEmpty()) {
            resultingWord[position--] = stack.pop();
        }
        return new String(resultingWord);
    }
}
