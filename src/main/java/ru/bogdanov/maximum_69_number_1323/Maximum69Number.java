package ru.bogdanov.maximum_69_number_1323;

/**
 * You are given a positive integer num consisting only of digits 6 and 9.
 * Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
 * <p>
 * Example 1:
 * <p>
 * Input: num = 9669
 * <p>
 * Output: 9969
 * <p>
 * Explanation:
 * <p>
 * Changing the first digit results in 6669.
 * Changing the second digit results in 9969.
 * Changing the third digit results in 9699.
 * Changing the fourth digit results in 9666.
 * The maximum number is 9969.
 * <p>
 * Example 2:
 * <p>
 * Input: num = 9996
 * <p>
 * Output: 9999
 * <p>
 * Explanation: Changing the last digit 6 to 9 results in the maximum number.
 * <p>
 * Example 3:
 * <p>
 * Input: num = 9999
 * <p>
 * Output: 9999
 * <p>
 * Explanation: It is better not to apply any change.
 * <p>
 * Constraints:
 * <p>
 * 1 <= num <= 104
 * num consists of only 6 and 9 digits.
 */
public class Maximum69Number {

    public static void main(String[] args) {

    }

    public static int maximum69Number(int num) {
        StringBuilder strNum = new StringBuilder(String.valueOf(num));
        for (int i = 0; i < strNum.length(); i++) {
            if (strNum.charAt(i) == '6') {
                strNum.setCharAt(i, '9');
                return Integer.parseInt(strNum.toString());
            }
        }
        return num;
    }

}
