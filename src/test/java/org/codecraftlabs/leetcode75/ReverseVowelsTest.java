package org.codecraftlabs.leetcode75;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseVowelsTest {
    private ReverseVowels reverseVowels;

    @BeforeEach
    void setup() {
        reverseVowels = new ReverseVowels();
    }

    @Test
    void when_passing_empty_string_should_return_empty() {
        assertThat(reverseVowels.execute("")).isBlank();
    }

    @Test
    void when_passing_only_one_vowel_should_remain_as_is() {
        String word = "red";
        assertThat(reverseVowels.execute(word)).isEqualTo(word);
    }
}
