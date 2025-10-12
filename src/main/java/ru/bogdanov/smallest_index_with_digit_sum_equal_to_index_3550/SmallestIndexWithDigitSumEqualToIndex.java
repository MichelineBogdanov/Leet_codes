package ru.bogdanov.smallest_index_with_digit_sum_equal_to_index_3550;

/**
 * You are given an integer array nums.
 * Return the smallest index i such that the sum of the digits of nums[i] is equal to i.
 * If no such index exists, return -1.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,2]
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * <p>
 * For nums[2] = 2, the sum of digits is 2, which is equal to index i = 2. Thus, the output is 2.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,10,11]
 * <p>
 * Output: 1
 * <p>
 * Explanation:
 * <p>
 * For nums[1] = 10, the sum of digits is 1 + 0 = 1, which is equal to index i = 1.
 * <p>
 * For nums[2] = 11, the sum of digits is 1 + 1 = 2, which is equal to index i = 2.
 * <p>
 * Since index 1 is the smallest, the output is 1.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1,2,3]
 * <p>
 * Output: -1
 * <p>
 * Explanation:
 * <p>
 * Since no index satisfies the condition, the output is -1.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * <p>
 * 0 <= nums[i] <= 1000
 */
public class SmallestIndexWithDigitSumEqualToIndex {

    public int smallestIndex(int[] nums) {
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            int digSum = 0;
            int num = nums[i];
            while (num > 0) {
                digSum += num % 10;
                num /= 10;
            }
            if (digSum == i) {
                return i;
            }
        }
        return res;
    }

}
