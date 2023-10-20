package ru.bogdanov.arrays_101;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 */

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int[] ints = {1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int max = maxConsecutiveOnes.findMaxConsecutiveOnes(ints);
        System.out.println(max);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int current = 0;
        for (int num : nums) {
            if (num == 1) {
                current++;
            } else if (current > result) {
                result = current;
                current = 0;
            } else {
                current = 0;
            }
        }
        return Math.max(result, current);
    }
}