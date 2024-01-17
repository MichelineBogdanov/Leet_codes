package ru.bogdanov.unique_number_of_occurrences;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 * ---
 * Example 1:
 * <p>
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 * ---
 * Example 2:
 * Input: arr = [1,2]
 * Output: false
 * ---
 * Example 3:
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * Output: true
 */
public class UniqueNumberOfOccurrences {

    public static void main(String[] args) {
        UniqueNumberOfOccurrences number = new UniqueNumberOfOccurrences();
        System.out.println(number.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        System.out.println(number.uniqueOccurrences(new int[]{1, 2}));
        System.out.println(number.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }

    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        int curNum = 0;
        int cur = arr[0];
        for (int num : arr) {
            if (num == cur) {
                curNum++;
            } else {
                if (set.add(curNum)) {
                    curNum = 1;
                    cur = num;
                } else {
                    return false;
                }
            }
        }
        return set.add(curNum);
    }
}
