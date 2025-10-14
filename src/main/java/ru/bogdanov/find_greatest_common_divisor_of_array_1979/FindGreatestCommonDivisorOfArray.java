package ru.bogdanov.find_greatest_common_divisor_of_array_1979;

import java.util.Arrays;

/**
 * Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,5,6,9,10]
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * <p>
 * The smallest number in nums is 2.
 * <p>
 * The largest number in nums is 10.
 * <p>
 * The greatest common divisor of 2 and 10 is 2.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [7,5,6,8,3]
 * <p>
 * Output: 1
 * <p>
 * Explanation:
 * <p>
 * The smallest number in nums is 3.
 * <p>
 * The largest number in nums is 8.
 * <p>
 * The greatest common divisor of 3 and 8 is 1.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [3,3]
 * <p>
 * Output: 3
 * <p>
 * Explanation:
 * <p>
 * The smallest number in nums is 3.
 * <p>
 * The largest number in nums is 3.
 * <p>
 * The greatest common divisor of 3 and 3 is 3.
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 1000
 * <p>
 * 1 <= nums[i] <= 1000
 */
public class FindGreatestCommonDivisorOfArray {

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        while (min > 0 && max > 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }
        return Math.max(min, max);
    }

}
