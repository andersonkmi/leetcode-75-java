package org.codecraftlabs.leetcode75;

public class RemoveStarsFromStringII {

    public String removeStars(String word) {
        char[] staging = new char[word.length()];
        int position = 0;

        char[] charArray = word.toCharArray();
        for (char item : charArray) {
            if (item != '*') {
                staging[position] = item;
                position++;
            } else {
                staging[position - 1] = ' ';
                position--;
            }
        }
        return new String(staging).trim();
    }
}
