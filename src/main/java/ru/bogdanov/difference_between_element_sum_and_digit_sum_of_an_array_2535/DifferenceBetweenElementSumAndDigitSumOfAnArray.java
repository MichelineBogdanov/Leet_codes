package ru.bogdanov.difference_between_element_sum_and_digit_sum_of_an_array_2535;

/**
 * You are given a positive integer array nums.
 * The element sum is the sum of all the elements in nums.
 * The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
 * Return the absolute difference between the element sum and digit sum of nums.
 * Note that the absolute difference between two integers x and y is defined as |x - y|.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,15,6,3]
 * <p>
 * Output: 9
 * <p>
 * Explanation:
 * <p>
 * The element sum of nums is 1 + 15 + 6 + 3 = 25.
 * <p>
 * The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
 * <p>
 * The absolute difference between the element sum and digit sum is |25 - 16| = 9.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4]
 * <p>
 * Output: 0
 * <p>
 * Explanation:
 * <p>
 * The element sum of nums is 1 + 2 + 3 + 4 = 10.
 * <p>
 * The digit sum of nums is 1 + 2 + 3 + 4 = 10.
 * <p>
 * The absolute difference between the element sum and digit sum is |10 - 10| = 0.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 2000
 * <p>
 * 1 <= nums[i] <= 2000
 */
public class DifferenceBetweenElementSumAndDigitSumOfAnArray {

    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int digSum = 0;
        for (int num : nums) {
            while (num > 0) {
                digSum += (num % 10);
                num /= 10;
            }
        }
        return Math.abs(sum - digSum);
    }

}
