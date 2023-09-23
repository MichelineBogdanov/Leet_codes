package ru.bogdanov.two_sum;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * ---
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * ---
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * ---
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSum(new int[]{-1, -2, -3, -4, -5}, -8);
        System.out.println(Arrays.toString(ints));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] array = Arrays.stream(nums).sorted().toArray();
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            int key = target - nums[i];
            int search = Arrays.binarySearch(array, key);
            if (search >= 0) {
                int position = findPosition(nums, i + 1, length, key);
                if (position > 0 && position > i) {
                    return new int[]{i, position};
                }
            }
        }
        return new int[]{-1, -1};
    }

    private int findPosition(int[] arr, int fromIndex, int toIndex, int target) {
        for (int i = fromIndex; i < toIndex; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
