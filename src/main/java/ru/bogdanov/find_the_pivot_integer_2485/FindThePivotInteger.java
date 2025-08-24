package ru.bogdanov.find_the_pivot_integer_2485;

/**
 * Given a positive integer n, find the pivot integer x such that:
 * The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
 * Return the pivot integer x. If no such integer exists, return -1.
 * It is guaranteed that there will be at most one pivot index for the given input.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 8
 * <p>
 * Output: 6
 * <p>
 * Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 1
 * <p>
 * Output: 1
 * <p>
 * Explanation: 1 is the pivot integer since: 1 = 1.
 * <p>
 * Example 3:
 * <p>
 * Input: n = 4
 * <p>
 * Output: -1
 * <p>
 * Explanation: It can be proved that no such integer exist.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 1000
 */
public class FindThePivotInteger {

    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }

    public static int pivotInteger(int n) {
        int[] sums = new int[n];
        sums[0] = 1;
        for (int i = 2; i <= n; i++) {
            sums[i - 1] += sums[i - 2] + i;
        }
        int max = sums[n - 1];
        for (int i = sums.length - 1; i >= 0; i--) {
            if (max + i + 1 == 2 * sums[i]) {
                return i + 1;
            }
        }
        return -1;
    }

}
