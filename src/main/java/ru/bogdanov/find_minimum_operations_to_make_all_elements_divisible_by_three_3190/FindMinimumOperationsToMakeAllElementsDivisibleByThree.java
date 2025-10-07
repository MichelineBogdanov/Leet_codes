package ru.bogdanov.find_minimum_operations_to_make_all_elements_divisible_by_three_3190;

/**
 * You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.
 * Return the minimum number of operations to make all elements of nums divisible by 3.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4]
 * <p>
 * Output: 3
 * <p>
 * Explanation:
 * <p>
 * All array elements can be made divisible by 3 using 3 operations:
 * <p>
 * Subtract 1 from 1.
 * <p>
 * Add 1 to 2.
 * <p>
 * Subtract 1 from 4.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,6,9]
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 50
 * <p>
 * 1 <= nums[i] <= 50
 */
public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {

    public int minimumOperations(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (num % 3 != 0) {
                res++;
            }
        }
        return res;
    }

}
