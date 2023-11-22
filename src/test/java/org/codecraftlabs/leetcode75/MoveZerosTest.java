package org.codecraftlabs.leetcode75;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoveZerosTest {
    private MoveZeros moveZeros;

    @BeforeEach
    void setup() {
        moveZeros = new MoveZeros();
    }

    @Test
    void testCase001() {
        int[] numbers = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};

        moveZeros.run(numbers);
        Assertions.assertThat(numbers).isEqualTo(expected);
    }

    @Test
    void testCase002() {
        int[] numbers = {0};
        int[] expected = {0};

        moveZeros.run(numbers);
        Assertions.assertThat(numbers).isEqualTo(expected);
    }
}
