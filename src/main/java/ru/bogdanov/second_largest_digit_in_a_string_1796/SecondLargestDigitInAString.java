package ru.bogdanov.second_largest_digit_in_a_string_1796;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

/**
 * Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.
 * An alphanumeric string is a string consisting of lowercase English letters and digits.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "dfa12321afd"
 * <p>
 * Output: 2
 * <p>
 * Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "abc1111"
 * <p>
 * Output: -1
 * <p>
 * Explanation: The digits that appear in s are [1]. There is no second largest digit.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 500
 * <p>
 * s consists of only lowercase English letters and digits.
 */
public class SecondLargestDigitInAString {

    public static void main(String[] args) {
        System.out.println(secondHighest("ck077"));
    }

    public static int secondHighest(String s) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                set.add(s.charAt(i) - '0');
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        list.sort(Comparator.reverseOrder());
        return list.size() >= 2 ? list.get(1) : -1;
    }

}
