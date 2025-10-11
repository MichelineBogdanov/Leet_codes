package ru.bogdanov.separate_the_digits_in_an_array_2553;

import java.util.ArrayList;

/**
 * Given an array of positive integers nums, return an array answer that consists of the digits of each integer
 * in nums after separating them in the same order they appear in nums.
 * To separate the digits of an integer is to get all the digits it has in the same order.
 * For example, for the integer 10921, the separation of its digits is [1,0,9,2,1].
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [13,25,83,77]
 * <p>
 * Output: [1,3,2,5,8,3,7,7]
 * <p>
 * Explanation:
 * <p>
 * - The separation of 13 is [1,3].
 * <p>
 * - The separation of 25 is [2,5].
 * <p>
 * - The separation of 83 is [8,3].
 * <p>
 * - The separation of 77 is [7,7].
 * <p>
 * answer = [1,3,2,5,8,3,7,7]. Note that answer contains the separations in the same order.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [7,1,3,9]
 * <p>
 * Output: [7,1,3,9]
 * <p>
 * Explanation: The separation of each integer in nums is itself.
 * <p>
 * answer = [7,1,3,9].
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * <p>
 * 1 <= nums[i] <= 105
 */
public class SeparateTheDigitsInAnArray {

    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            String s = String.valueOf(num);
            for (char c : s.toCharArray()) {
                list.add(c - '0');
            }
        }
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }

}
