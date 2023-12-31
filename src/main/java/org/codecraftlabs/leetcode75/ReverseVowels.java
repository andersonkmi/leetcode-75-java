package org.codecraftlabs.leetcode75;

import javax.annotation.Nonnull;
import java.util.Vector;

public class ReverseVowels {
    private static final String VOWELS = "aeiouAEIOU";
    @Nonnull
    public String execute(@Nonnull String word) {
        int[] positions = identifyVowelPositions(word);
        return applySwap(word, positions);
    }

    private String applySwap(@Nonnull String word, int[] originalPositions) {
        char[] staging = word.toCharArray();
        int middle = originalPositions.length / 2;
        for (int index = 0; index < middle; index++) {
            int opposite = (originalPositions.length - 1) - index;
            int pos1 = originalPositions[index];
            int pos2 = originalPositions[opposite];

            char char1 = staging[pos1];
            staging[pos1] = staging[pos2];
            staging[pos2] = char1;
        }
        return new String(staging);
    }

    private int[] identifyVowelPositions(@Nonnull String word) {
        Vector<Integer> vowelsIndexes = new Vector<>();
        for (int index = 0; index < word.length(); index++) {
            if (isVowel(word.charAt(index))) {
                vowelsIndexes.add(index);
            }
        }
        int size = vowelsIndexes.size();
        int[] result = new int[size];
        for (int index = 0; index < size; index++) {
            result[index] = vowelsIndexes.get(index);
        }

        return result;
    }

    private boolean isVowel(char item) {
        return VOWELS.indexOf(item) != -1;
    }
}
