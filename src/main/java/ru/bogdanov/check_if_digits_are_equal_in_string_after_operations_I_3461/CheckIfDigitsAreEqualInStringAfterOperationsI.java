package ru.bogdanov.check_if_digits_are_equal_in_string_after_operations_I_3461;

import java.util.ArrayList;
import java.util.Objects;

/**
 * You are given a string s consisting of digits. Perform the following operation repeatedly until the string has exactly two digits:
 * For each pair of consecutive digits in s, starting from the first digit, calculate a new digit as the sum of the two digits modulo 10.
 * Replace s with the sequence of newly calculated digits, maintaining the order in which they are computed.
 * Return true if the final two digits in s are the same; otherwise, return false.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "3902"
 * <p>
 * Output: true
 * <p>
 * Explanation:
 * <p>
 * Initially, s = "3902"
 * <p>
 * First operation:
 * <p>
 * (s[0] + s[1]) % 10 = (3 + 9) % 10 = 2
 * <p>
 * (s[1] + s[2]) % 10 = (9 + 0) % 10 = 9
 * <p>
 * (s[2] + s[3]) % 10 = (0 + 2) % 10 = 2
 * <p>
 * s becomes "292"
 * <p>
 * Second operation:
 * <p>
 * (s[0] + s[1]) % 10 = (2 + 9) % 10 = 1
 * <p>
 * (s[1] + s[2]) % 10 = (9 + 2) % 10 = 1
 * <p>
 * s becomes "11"
 * <p>
 * Since the digits in "11" are the same, the output is true.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "34789"
 * <p>
 * Output: false
 * <p>
 * Explanation:
 * <p>
 * Initially, s = "34789".
 * <p>
 * After the first operation, s = "7157".
 * <p>
 * After the second operation, s = "862".
 * <p>
 * After the third operation, s = "48".
 * <p>
 * Since '4' != '8', the output is false.
 * <p>
 * Constraints:
 * <p>
 * 3 <= s.length <= 100
 * <p>
 * s consists of only digits.
 */
public class CheckIfDigitsAreEqualInStringAfterOperationsI {

    public boolean hasSameDigits(String s) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (char c : s.toCharArray()) {
            integers.add(c - '0');
        }
        while (integers.size() > 2) {
            ArrayList<Integer> curList = new ArrayList<>();
            for (int i = 1; i < integers.size(); i++) {
                curList.add((integers.get(i) + integers.get(i - 1)) % 10);
            }
            integers = curList;
        }
        return Objects.equals(integers.get(0), integers.get(1));
    }

}
