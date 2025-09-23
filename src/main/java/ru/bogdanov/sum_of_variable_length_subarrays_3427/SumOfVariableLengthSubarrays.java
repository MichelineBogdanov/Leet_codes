package ru.bogdanov.sum_of_variable_length_subarrays_3427;

/**
 * You are given an integer array nums of size n. For each index i where 0 <= i < n, define a subarray nums[start ... i]
 * where start = max(0, i - nums[i]).
 * Return the total sum of all elements from the subarray defined for each index in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,3,1]
 * <p>
 * Output: 11
 * <p>
 * Explanation:
 * The total sum is 11. Hence, 11 is the output.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,1,1,2]
 * <p>
 * Output: 13
 * <p>
 * Explanation:
 * The total sum is 13. Hence, 13 is the output.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n == nums.length <= 100
 * <p>
 * 1 <= nums[i] <= 1000
 */
public class SumOfVariableLengthSubarrays {

    public int subarraySum(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            for (int j = start; j <= i; j++) {
                res += nums[j];
            }
        }
        return res;
    }

}
