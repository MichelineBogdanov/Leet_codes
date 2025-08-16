package ru.bogdanov.strictly_palindromic_number_2396;

/**
 * An integer n is strictly palindromic if, for every base b between 2 and n - 2 (inclusive),
 * the string representation of the integer n in base b is palindromic.
 * Given an integer n, return true if n is strictly palindromic and false otherwise.
 * A string is palindromic if it reads the same forward and backward.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 9
 * <p>
 * Output: false
 * <p>
 * Explanation: In base 2: 9 = 1001 (base 2), which is palindromic.
 * In base 3: 9 = 100 (base 3), which is not palindromic.
 * Therefore, 9 is not strictly palindromic, so we return false.
 * Note that in bases 4, 5, 6, and 7, n = 9 is also not palindromic.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 4
 * <p>
 * Output: false
 * <p>
 * Explanation: We only consider base 2: 4 = 100 (base 2), which is not palindromic.
 * Therefore, we return false.
 * <p>
 * Constraints:
 * <p>
 * 4 <= n <= 105
 */
public class StrictlyPalindromicNumber {

    public static void main(String[] args) {
        System.out.println(isStrictlyPalindromic(4));
        System.out.println(isStrictlyPalindromic(9));
    }

    public static boolean isStrictlyPalindromic(int n) {
        return false;
    }

}
