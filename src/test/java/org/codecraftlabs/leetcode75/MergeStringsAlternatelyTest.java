package org.codecraftlabs.leetcode75;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeStringsAlternatelyTest {
    private MergeStringsAlternately mergeStringsAlternately;

    @BeforeEach
    void setup() {
        this.mergeStringsAlternately = new MergeStringsAlternately();
    }

    @Test
    void mergeEmptyStringsShouldResultInEmptyString() {
        String word1 = "";
        String word2 = "";
        assertThat(mergeStringsAlternately.merge(word1, word2)).isEqualTo("");
    }

    @Test
    void mergeOneNonEmptyStringWithEmptyStringShouldResultOriginalString() {
        String word1 = "abcde";
        String word2 = "";
        assertThat(mergeStringsAlternately.merge(word1, word2)).isEqualTo("abcde");
    }

    @Test
    void mergeSwappedNonEmptyStringWithEmptyStringShouldResultOriginalString() {
        String word1 = "";
        String word2 = "abcde";
        assertThat(mergeStringsAlternately.merge(word1, word2)).isEqualTo("abcde");
    }

    @Test
    void mergeTwoNonEmptySameLengthStrings() {
        String word1 = "abc";
        String word2 = "def";
        String result = "adbecf";
        assertThat(mergeStringsAlternately.merge(word1, word2)).isEqualTo(result);
    }

    @Test
    void mergeTwoNonEmptyDifferentLengthStrings() {
        String word1 = "abc";
        String word2 = "de";
        String result = "adbec";
        assertThat(mergeStringsAlternately.merge(word1, word2)).isEqualTo(result);
    }

    @Test
    void mergeSwappedTwoNonEmptyDifferentLengthStrings() {
        String word1 = "ab";
        String word2 = "def";
        String result = "adbef";
        assertThat(mergeStringsAlternately.merge(word1, word2)).isEqualTo(result);
    }
}
