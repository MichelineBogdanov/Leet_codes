package ru.bogdanov.compute_alternating_sum_3701;

/**
 * You are given an integer array nums.
 * The alternating sum of nums is the value obtained by adding elements at even
 * indices and subtracting elements at odd indices. That is, nums[0] - nums[1] + nums[2] - nums[3]...
 * Return an integer denoting the alternating sum of nums.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,5,7]
 * <p>
 * Output: -4
 * <p>
 * Explanation:
 * <p>
 * Elements at even indices are nums[0] = 1 and nums[2] = 5 because 0 and 2 are even numbers.
 * <p>
 * Elements at odd indices are nums[1] = 3 and nums[3] = 7 because 1 and 3 are odd numbers.
 * <p>
 * The alternating sum is nums[0] - nums[1] + nums[2] - nums[3] = 1 - 3 + 5 - 7 = -4.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [100]
 * <p>
 * Output: 100
 * <p>
 * Explanation:
 * <p>
 * The only element at even indices is nums[0] = 100 because 0 is an even number.
 * <p>
 * There are no elements on odd indices.
 * <p>
 * The alternating sum is nums[0] = 100.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * <p>
 * 1 <= nums[i] <= 100
 */
public class ComputeAlternatingSum {

    public int alternatingSum(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                res += nums[i];
            } else {
                res -= nums[i];
            }
        }
        return res;
    }

}
