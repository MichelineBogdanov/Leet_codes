package ru.bogdanov.smallest_number_with_all_set_bits_3370;

/**
 * You are given a positive number n. Return the smallest number x greater than or equal to n,
 * such that the binary representation of x contains only set bits
 * <p>
 * Example 1:
 * <p>
 * Input: n = 5
 * <p>
 * Output: 7
 * <p>
 * Explanation:
 * <p>
 * The binary representation of 7 is "111".
 * <p>
 * Example 2:
 * <p>
 * Input: n = 10
 * <p>
 * Output: 15
 * <p>
 * Explanation:
 * <p>
 * The binary representation of 15 is "1111".
 * <p>
 * Example 3:
 * <p>
 * Input: n = 3
 * <p>
 * Output: 3
 * <p>
 * Explanation:
 * <p>
 * The binary representation of 3 is "11".
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 1000
 */
public class SmallestNumberWithAllSetBits {

    public static void main(String[] args) {
        System.out.println(smallestNumber(1));
        System.out.println(smallestNumber(2));
        System.out.println(smallestNumber(3));
        System.out.println(smallestNumber(5));
    }

    public static int smallestNumber(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 2;
        }
        return (int) (Math.pow(2, count) - 1);
    }

}
