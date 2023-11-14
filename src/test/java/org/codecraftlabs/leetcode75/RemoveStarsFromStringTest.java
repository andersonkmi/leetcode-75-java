package org.codecraftlabs.leetcode75;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveStarsFromStringTest {
    private RemoveStarsFromString removeStarsFromString;

    @BeforeEach
    void setup() {
        this.removeStarsFromString = new RemoveStarsFromString();
    }

    @Test
    void test_case_001() {
        String input = "leet**cod*e";
        String result = "lecoe";

        Assertions.assertThat(removeStarsFromString.removeStars(input)).isEqualTo(result);
    }

    @Test
    void test_case_002() {
        String input = "erase*****";
        String result = "";

        Assertions.assertThat(removeStarsFromString.removeStars(input)).isEqualTo(result);
    }
}
