package ru.bogdanov.arrays_101;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array
 * of the squares of each number sorted in non-decreasing order.
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 */

import java.util.Arrays;

public class SquaresOfASortedArray {

    public static void main(String[] args) {
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] ints = {-4, -1, 0, 3, 10};
        int[] nums = squaresOfASortedArray.sortedSquares(ints);
        System.out.println(Arrays.toString(nums));
    }

    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(num -> (int) Math.pow(num, 2)).sorted().toArray();
    }
}
