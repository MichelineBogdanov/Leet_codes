package ru.bogdanov.count_odd_numbers_in_an_interval_range_1523;

/**
 * Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
 * <p>
 * Example 1:
 * <p>
 * Input: low = 3, high = 7
 * <p>
 * Output: 3
 * <p>
 * Explanation: The odd numbers between 3 and 7 are [3,5,7].
 * <p>
 * Example 2:
 * <p>
 * Input: low = 8, high = 10
 * <p>
 * Output: 1
 * <p>
 * Explanation: The odd numbers between 8 and 10 are [9].
 * <p>
 * Constraints:
 * <p>
 * 0 <= low <= high <= 10^9
 */
public class CountOddNumbersInAnIntervalRange {

    public static void main(String[] args) {
        System.out.println(countOdds(3, 7));
        System.out.println(countOdds(8, 10));
        System.out.println(countOdds(4, 7));
        System.out.println(countOdds(3, 8));
    }

    public static int countOdds(int low, int high) {
        return low % 2 == 0 && high % 2 == 0 ? (high - low) / 2 : ((high - low) / 2) + 1;
    }

}
