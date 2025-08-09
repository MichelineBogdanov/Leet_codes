package ru.bogdanov.check_balanced_string_3340;

/**
 * You are given a string num consisting of only digits.
 * A string of digits is called balanced if the sum of the digits at even
 * indices is equal to the sum of digits at odd indices.
 * <p>
 * Return true if num is balanced, otherwise return false.
 * <p>
 * Example 1:
 * <p>
 * Input: num = "1234"
 * <p>
 * Output: false
 * <p>
 * Explanation:
 * <p>
 * The sum of digits at even indices is 1 + 3 == 4, and the sum of digits at odd indices is 2 + 4 == 6.
 * Since 4 is not equal to 6, num is not balanced.
 * <p>
 * Example 2:
 * <p>
 * Input: num = "24123"
 * <p>
 * Output: true
 * <p>
 * Explanation:
 * <p>
 * The sum of digits at even indices is 2 + 1 + 3 == 6, and the sum of digits at odd indices is 4 + 2 == 6.
 * Since both are equal the num is balanced.
 * <p>
 * Constraints:
 * <p>
 * 2 <= num.length <= 100
 * num consists of digits only
 */
public class CheckBalancedString {

    public static void main(String[] args) {
        System.out.println(isBalanced("1234"));
        System.out.println(isBalanced("24123"));
    }

    public static boolean isBalanced(String num) {
        int res = 0;
        for (int i = 0; i < num.length(); i++) {
            res += i % 2 == 0 ? (num.charAt(i) - '0') : -(num.charAt(i) - '0');
        }
        return res == 0;
    }
}
