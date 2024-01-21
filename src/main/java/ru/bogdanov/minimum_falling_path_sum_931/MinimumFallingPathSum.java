package ru.bogdanov.minimum_falling_path_sum_931;

import java.util.Arrays;

/**
 * Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.
 * A falling path starts at any element in the first row and chooses the element in the next row that
 * is either directly below or diagonally left/right. Specifically, the next element from position
 * (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).
 * ---
 * Example 1:
 * Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
 * Output: 13
 * Explanation: There are two falling paths with a minimum sum as shown.
 * ---
 * Example 2:
 * Input: matrix = [[-19,57],[-40,-5]]
 * Output: -59
 * Explanation: The falling path with a minimum sum is shown.
 */
public class MinimumFallingPathSum {

    public static void main(String[] args) {
        MinimumFallingPathSum sum = new MinimumFallingPathSum();
        System.out.println(sum.minFallingPathSum(new int[][]{{2, 1, 3}, {6, 5, 4}, {7, 8, 9}}));
    }

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[] checkMin = new int[n];
        for (int[] rows : matrix) {
            int[] d = checkMin.clone();
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    d[i] = Math.min(d[i], checkMin[i - 1]);
                }
                if (i + 1 < n) {
                    d[i] = Math.min(checkMin[i + 1], d[i]);
                }
                d[i] += rows[i];
            }
            checkMin = d;
        }
        return Arrays.stream(checkMin).min().getAsInt();
    }

}
