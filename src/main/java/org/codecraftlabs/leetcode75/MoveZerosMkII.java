package org.codecraftlabs.leetcode75;

public class MoveZerosMkII {
    public void run(int[] numbers) {
        int finalPosition = shiftNumbersOverZeros(numbers);
        while (finalPosition < numbers.length) {
            numbers[finalPosition] = 0;
            finalPosition++;
        }
    }

    private int shiftNumbersOverZeros(int[] numbers) {
        int position = 0;
        for (int number : numbers) {
            if (number != 0) {
                numbers[position] = number;
                position++;
            }
        }
        return position;
    }
}
