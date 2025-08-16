package ru.bogdanov.subsets_78;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array nums of unique elements, return all possible subsets (the power set).
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3]
 * <p>
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [0]
 * <p>
 * Output: [[],[0]]
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * All the numbers of nums are unique.
 */
public class Subsets {

    public static void main(String[] args) {
        System.out.println(subsets2(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, nums.length); i++) {
            ArrayList<Integer> integers = new ArrayList<>();
            String binaryString = String.format("%" + nums.length + "s", Integer.toBinaryString(i)).replace(' ', '0');
            for (int j = 0; j < binaryString.length(); j++) {
                if (binaryString.charAt(j) == '1') {
                    integers.add(nums[j]);
                }
            }
            res.add(integers);
        }
        return res;
    }

    public static List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int num : nums) {
            int n = res.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> integers = new ArrayList<>(res.get(i));
                integers.add(num);
                res.add(integers);
            }
        }
        return res;
    }
}
