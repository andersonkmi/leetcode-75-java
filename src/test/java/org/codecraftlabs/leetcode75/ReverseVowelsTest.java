package org.codecraftlabs.leetcode75;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseVowelsTest {
    private ReverseVowels reverseVowels;

    @BeforeEach
    void setup() {
        reverseVowels = new ReverseVowels();
    }

    @Test
    void when_passing_empty_string_should_return_empty() {
        Assertions.assertThat(reverseVowels.execute("")).isBlank();
    }
}
