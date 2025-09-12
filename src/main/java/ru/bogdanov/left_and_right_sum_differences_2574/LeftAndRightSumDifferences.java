package ru.bogdanov.left_and_right_sum_differences_2574;

import java.util.Arrays;

/**
 * You are given a 0-indexed integer array nums of size n.
 * Define two arrays leftSum and rightSum where:
 * <p>
 * leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
 * <p>
 * rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
 * <p>
 * Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [10,4,8,3]
 * <p>
 * Output: [15,1,11,22]
 * <p>
 * Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
 * <p>
 * The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1]
 * <p>
 * Output: [0]
 * <p>
 * Explanation: The array leftSum is [0] and the array rightSum is [0].
 * <p>
 * The array answer is [|0 - 0|] = [0].
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * <p>
 * 1 <= nums[i] <= 105
 */
public class LeftAndRightSumDifferences {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRightDifference(new int[]{10, 4, 8, 3})));
    }

    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        for (int i = 1; i < leftSum.length; i++) {
            leftSum[i] = nums[i - 1] + leftSum[i - 1];
        }
        for (int i = rightSum.length - 2; i >= 0; i--) {
            rightSum[i] = nums[i + 1] + rightSum[i + 1];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return res;
    }

}
