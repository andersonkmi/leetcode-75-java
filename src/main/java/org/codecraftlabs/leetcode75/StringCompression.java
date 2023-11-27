package org.codecraftlabs.leetcode75;

public class StringCompression {
    public int compress(char[] chars) {
        StringBuilder buffer = new StringBuilder();
        int position = 0;

        while (position < chars.length) {
            char currentChar = chars[position];
            int finalPosition = getFinalPosition(position, currentChar, chars);
            buffer.append(currentChar);
            int delta = finalPosition - position + 1;
            if (delta > 1) {
                buffer.append(delta);
            }
            position = finalPosition + 1;
        }

        int index = 0;
        for (; index < buffer.length(); index++) {
            chars[index] = buffer.charAt(index);
        }
        return index;
    }

    private int getFinalPosition(int startPosition, char currentChar, char[] chars) {
        int endPosition = startPosition + 1;
        while(endPosition < chars.length && chars[endPosition] == currentChar) {
            endPosition++;
        }
        return endPosition - 1;
    }
}
