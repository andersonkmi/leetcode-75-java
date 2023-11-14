package org.codecraftlabs.leetcode75;

import javax.annotation.Nonnull;
import java.util.Set;

public class ReverseVowelsII {
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
    @Nonnull
    public String execute(@Nonnull String word) {
        char[] converted = word.toCharArray();
        int start = 0;
        int end = converted.length - 1;
        while (start < end ) {
            while (start < end && !VOWELS.contains(converted[start])) {
                start++;
            }

            while(start < end && !VOWELS.contains(converted[end])) {
                end--;
            }

            char character1 = converted[start];
            converted[start] = converted[end];
            converted[end] = character1;

            start++;
            end--;
        }
        return new String(converted);
    }
}
