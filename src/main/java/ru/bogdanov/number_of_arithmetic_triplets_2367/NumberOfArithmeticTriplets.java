package ru.bogdanov.number_of_arithmetic_triplets_2367;

import java.util.Arrays;

/**
 * You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff.
 * A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:
 * <p>
 * i < j < k,
 * <p>
 * nums[j] - nums[i] == diff, and
 * <p>
 * nums[k] - nums[j] == diff.
 * <p>
 * Return the number of unique arithmetic triplets.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [0,1,4,6,7,10], diff = 3
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * <p>
 * (1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
 * <p>
 * (2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [4,5,6,7,8,9], diff = 2
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * <p>
 * (0, 2, 4) is an arithmetic triplet because both 8 - 6 == 2 and 6 - 4 == 2.
 * <p>
 * (1, 3, 5) is an arithmetic triplet because both 9 - 7 == 2 and 7 - 5 == 2.
 * <p>
 * Constraints:
 * <p>
 * 3 <= nums.length <= 200
 * <p>
 * 0 <= nums[i] <= 200
 * <p>
 * 1 <= diff <= 50
 * nums is strictly increasing.
 */
public class NumberOfArithmeticTriplets {

    public int arithmeticTriplets(int[] nums, int diff) {
        int res = 0;
        for (int num : nums) {
            int second = Arrays.binarySearch(nums, num + diff);
            if (second > 0) {
                int third = Arrays.binarySearch(nums, num + 2 * diff);
                if (third > 0) {
                    res++;
                }
            }
        }
        return res;
    }

}
