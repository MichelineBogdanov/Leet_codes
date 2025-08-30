package ru.bogdanov.number_of_different_integers_in_a_string_1805;

import java.util.HashSet;

/**
 * You are given a string word that consists of digits and lowercase English letters.
 * You will replace every non-digit character with a space. For example, "a123bc34d8ef34" will
 * become " 123  34 8  34". Notice that you are left with some integers that are separated by at least
 * one space: "123", "34", "8", and "34".
 * Return the number of different integers after performing the replacement operations on word.
 * Two integers are considered different if their decimal representations without any leading zeros are different.
 * <p>
 * Example 1:
 * <p>
 * Input: word = "a123bc34d8ef34"
 * <p>
 * Output: 3
 * <p>
 * Explanation: The three different integers are "123", "34", and "8". Notice that "34" is only counted once.
 * <p>
 * Example 2:
 * <p>
 * Input: word = "leet1234code234"
 * <p>
 * Output: 2
 * <p>
 * Example 3:
 * <p>
 * Input: word = "a1b01c001"
 * <p>
 * Output: 1
 * <p>
 * Explanation: The three integers "1", "01", and "001" all represent the same integer because
 * the leading zeros are ignored when comparing their decimal values.
 * <p>
 * Constraints:
 * <p>
 * 1 <= word.length <= 1000
 * <p>
 * word consists of digits and lowercase English letters.
 */
public class NumberOfDifferentIntegersInAString {

    public static void main(String[] args) {
        System.out.println(numDifferentIntegers("a123bc34d8ef34"));
        System.out.println(numDifferentIntegers("leet1234code234"));
        System.out.println(numDifferentIntegers("a1b01c001"));
    }

    public static int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();
        String[] split = word.split("\\D+");
        for (String s : split) {
            if (!s.isEmpty()) {
                set.add(deleteLeadingZeros(s));
            }
        }
        return set.size();
    }

    private static String deleteLeadingZeros(String s) {
        while (s.startsWith("0")) {
            s = s.substring(1);
        }
        return s;
    }

}
