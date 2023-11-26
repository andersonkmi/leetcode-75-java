package org.codecraftlabs.leetcode75;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoveZerosIITest {
    private MoveZerosMkII moveZerosMkII;

    @BeforeEach
    void setup() {
        moveZerosMkII = new MoveZerosMkII();
    }

    @Test
    void testCase() {
        int[] numbers = {1, 0, 4, 0, 3, 5};
        int[] expected = {1, 4, 3, 5, 0, 0};
        moveZerosMkII.run(numbers);
        Assertions.assertThat(numbers).isEqualTo(expected);
    }
}
