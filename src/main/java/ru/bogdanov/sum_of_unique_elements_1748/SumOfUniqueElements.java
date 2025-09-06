package ru.bogdanov.sum_of_unique_elements_1748;

import java.util.HashMap;

/**
 * You are given an integer array nums. The unique elements of an array are the elements that appear
 * exactly once in the array.
 * Return the sum of all the unique elements of nums.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,2]
 * <p>
 * Output: 4
 * <p>
 * Explanation: The unique elements are [1,3], and the sum is 4.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,1,1,1,1]
 * <p>
 * Output: 0
 * <p>
 * Explanation: There are no unique elements, and the sum is 0.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1,2,3,4,5]
 * <p>
 * Output: 15
 * <p>
 * Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * <p>
 * 1 <= nums[i] <= 100
 */
public class SumOfUniqueElements {

    public static void main(String[] args) {

    }

    public int sumOfUnique(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.compute(num, (key, value) -> value == null ? 1 : value + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                res += key;
            }
        }
        return res;
    }
}
