package org.codecraftlabs.leetcode75;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseVowelsIITest {
    private ReverseVowelsII reverseVowels;

    @BeforeEach
    void setup() {
        reverseVowels = new ReverseVowelsII();
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

    @Test
    void when_passing_two_vowel_word() {
        String word = "omo";
        assertThat(reverseVowels.execute(word)).isEqualTo(word);
    }

    @Test
    void using_real_word() {
        String word = "hello";
        String correct = "holle";
        assertThat(reverseVowels.execute(word)).isEqualTo(correct);
    }

    @Test
    void reverse_leetcode_word() {
        String word = "leetcode";
        String correct = "leotcede";
        assertThat(reverseVowels.execute(word)).isEqualTo(correct);
    }

    @Test
    void reverse_ai() {
        String word = "ai";
        String correct = "ia";
        assertThat(reverseVowels.execute(word)).isEqualTo(correct);
    }
}
