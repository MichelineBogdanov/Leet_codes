package ru.bogdanov.height_checker_1051;

import java.util.Arrays;

/**
 * A school is trying to take an annual photo of all the students. The students are asked to stand in a single
 * file line in non-decreasing order by height. Let this ordering be represented by the integer array expected
 * where expected[i] is the expected height of the ith student in line.
 * <p>
 * You are given an integer array heights representing the current order that the students are standing in.
 * Each heights[i] is the height of the ith student in line (0-indexed).
 * <p>
 * Return the number of indices where heights[i] != expected[i].
 * <p>
 * Example 1:
 * <p>
 * Input: heights = [1,1,4,2,1,3]
 * <p>
 * Output: 3
 * <p>
 * Explanation:
 * <p>
 * heights:  [1,1,4,2,1,3]
 * expected: [1,1,1,2,3,4]
 * Indices 2, 4, and 5 do not match.
 * <p>
 * Example 2:
 * <p>
 * Input: heights = [5,1,2,3,4]
 * <p>
 * Output: 5
 * <p>
 * Explanation:
 * <p>
 * heights:  [5,1,2,3,4]
 * expected: [1,2,3,4,5]
 * All indices do not match.
 * <p>
 * Example 3:
 * <p>
 * Input: heights = [1,2,3,4,5]
 * <p>
 * Output: 0
 * <p>
 * Explanation:
 * <p>
 * heights:  [1,2,3,4,5]
 * expected: [1,2,3,4,5]
 * All indices match.
 */
public class HeightChecker {

    public static void main(String[] args) {

    }

    public int heightChecker(int[] heights) {
        int[] check = Arrays.copyOf(heights, heights.length);
        Arrays.sort(check);
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != check[i]) {
                res++;
            }
        }
        return res;
    }

}
