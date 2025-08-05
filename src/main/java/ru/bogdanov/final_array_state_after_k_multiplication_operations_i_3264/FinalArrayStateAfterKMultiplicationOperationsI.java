package ru.bogdanov.final_array_state_after_k_multiplication_operations_i_3264;

import java.util.Arrays;

/**
 * You are given an integer array nums, an integer k, and an integer multiplier.
 * You need to perform k operations on nums. In each operation:
 * Find the minimum value x in nums. If there are multiple occurrences of the minimum value,
 * select the one that appears first.
 * Replace the selected minimum value x with x * multiplier.
 * Return an integer array denoting the final state of nums after performing all k operations.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,1,3,5,6], k = 5, multiplier = 2
 * <p>
 * Output: [8,4,6,5,6]
 * <p>
 * Explanation:
 * <p>
 * Operation	Result
 * <p>
 * After operation 1	[2, 2, 3, 5, 6]
 * <p>
 * After operation 2	[4, 2, 3, 5, 6]
 * <p>
 * After operation 3	[4, 4, 3, 5, 6]
 * <p>
 * After operation 4	[4, 4, 6, 5, 6]
 * <p>
 * After operation 5	[8, 4, 6, 5, 6]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,2], k = 3, multiplier = 4
 * <p>
 * Output: [16,8]
 * <p>
 * Explanation:
 * <p>
 * Operation	Result
 * <p>
 * After operation 1	[4, 2]
 * <p>
 * After operation 2	[4, 8]
 * <p>
 * After operation 3	[16, 8]
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 * 1 <= k <= 10
 * 1 <= multiplier <= 5
 */
public class FinalArrayStateAfterKMultiplicationOperationsI {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFinalState(new int[]{2, 1, 3, 5, 6}, 5, 2)));
        System.out.println(Arrays.toString(getFinalState(new int[]{1, 2}, 3, 4)));
    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int minPos = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[minPos]) {
                    minPos = j;
                }
            }
            nums[minPos] *= multiplier;
        }
        return nums;
    }

}
