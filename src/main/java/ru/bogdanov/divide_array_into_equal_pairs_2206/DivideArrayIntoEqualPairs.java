package ru.bogdanov.divide_array_into_equal_pairs_2206;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given an integer array nums consisting of 2 * n integers.
 * You need to divide nums into n pairs such that:
 * Each element belongs to exactly one pair.
 * The elements present in a pair are equal.
 * Return true if nums can be divided into n pairs, otherwise return false.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,3,2,2,2]
 * <p>
 * Output: true
 * <p>
 * Explanation:
 * <p>
 * There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
 * If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy all the conditions.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4]
 * <p>
 * Output: false
 * <p>
 * Explanation:
 * <p>
 * There is no way to divide nums into 4 / 2 = 2 pairs such that the pairs satisfy every condition.
 * <p>
 * Constraints:
 * <p>
 * nums.length == 2 * n
 * <p>
 * 1 <= n <= 500
 * <p>
 * 1 <= nums[i] <= 500
 */
public class DivideArrayIntoEqualPairs {

    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.merge(num, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return false;
            }
        }
        return true;
    }

}
