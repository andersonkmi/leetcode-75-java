package org.codecraftlabs.leetcode75;

import javax.annotation.Nonnull;

public class MergeStringsAlternately {
    @Nonnull
    public String merge(@Nonnull String word1, @Nonnull String word2) {
        int maxLength = Math.max(word1.length(), word2.length());
        int length1 = word1.length();
        int length2 = word2.length();

        StringBuilder result = new StringBuilder();
        for(int index = 0; index < maxLength; index++) {
            if (index < length1) {
                result.append(word1.charAt(index));
            }

            if (index < length2) {
                result.append(word2.charAt(index));
            }
        }
        return result.toString();
    }
}
