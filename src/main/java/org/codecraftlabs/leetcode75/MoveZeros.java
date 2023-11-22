package org.codecraftlabs.leetcode75;

public class MoveZeros {
    public void run(int[] numbers) {
        int index = 0;
        int end = numbers.length - 1;

        while(index <= end) {
            if (numbers[index] != 0) {
                index++;
            } else {
                shiftToLeft(index, end, numbers);
                numbers[end] = 0;
                end--;
            }
        }
    }

    private void shiftToLeft(int start, int end, int[] numbers) {
        int position = start;
        while(position < end) {
            numbers[position] = numbers[position + 1];
            position++;
        }
    }
}
