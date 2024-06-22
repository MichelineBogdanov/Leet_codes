package ru.bogdanov.search_insert_position_35;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3, 5, 6};
        int target1 = 5;
        System.out.println(searchInsert(nums1, target1));

        int target2 = 2;
        System.out.println(searchInsert(nums1, target2));

        int target3 = 7;
        System.out.println(searchInsert(nums1, target3));

        int[] nums2 = new int[]{1, 3};
        int target4 = 2;
        System.out.println(searchInsert(nums2, target4));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int current = (start + end) / 2;
            if (nums[current] == target) {
                return current;
            } else if (nums[current] > target) {
                end = current;
            } else {
                start = current + 1;
            }
        }
        return end;
    }

}
