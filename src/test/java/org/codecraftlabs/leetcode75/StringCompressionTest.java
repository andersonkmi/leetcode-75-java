package org.codecraftlabs.leetcode75;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCompressionTest {
    private StringCompression stringCompression;

    @BeforeEach
    void setup() {
        stringCompression = new StringCompression();
    }

    @Test
    void testSimpleCase() {
        char[] items = {'a', 'a', 'b', 'b'};
        char[] expectedResult = {'a', '2', 'b', '2'};
        int expected = 4;
        Assertions.assertThat(stringCompression.compress(items)).isEqualTo(expected);
        Assertions.assertThat(items).isEqualTo(expectedResult);
    }
}
