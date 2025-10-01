package ru.bogdanov.minimum_operations_to_make_the_array_increasing_1827;

/**
 * You are given an integer array nums (0-indexed). In one operation, you can choose an element of the array and
 * increment it by 1. For example, if nums = [1,2,3], you can choose to increment nums[1] to make nums = [1,3,3].
 * Return the minimum number of operations needed to make nums strictly increasing.
 * An array nums is strictly increasing if nums[i] < nums[i+1] for all 0 <= i < nums.length - 1.
 * An array of length 1 is trivially strictly increasing.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1]
 * <p>
 * Output: 3
 * <p>
 * Explanation: You can do the following operations:
 * <p>
 * 1) Increment nums[2], so nums becomes [1,1,2].
 * <p>
 * 2) Increment nums[1], so nums becomes [1,2,2].
 * <p>
 * 3) Increment nums[2], so nums becomes [1,2,3].
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,5,2,4,1]
 * <p>
 * Output: 14
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [8]
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 5000
 * <p>
 * 1 <= nums[i] <= 104
 */
public class MinimumOperationsToMakeTheArrayIncreasing {

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{1,1,1}));
    }

    public static int minOperations(int[] nums) {
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int increase = nums[i - 1] - nums[i] + 1;
                res += increase;
                nums[i] += increase;
            }
        }
        return res;
    }

}
