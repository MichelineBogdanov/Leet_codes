package ru.bogdanov.maximum_product_of_two_elements_in_an_array_1464;

import java.util.Arrays;

/**
 * Given the array of integers nums, you will choose two different indices i and j of that array.
 * Return the maximum value of (nums[i]-1)*(nums[j]-1).
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,4,5,2]
 * <p>
 * Output: 12
 * <p>
 * Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,5,4,5]
 * <p>
 * Output: 16
 * <p>
 * Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [3,7]
 * <p>
 * Output: 12
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 500
 * <p>
 * 1 <= nums[i] <= 10^3
 *
 */
public class MaximumProductOfTwoElementsInAnArray {

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

}
