package ru.bogdanov.check_if_two_string_arrays_are_equivalent_1662;

import java.util.Arrays;

/**
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 * <p>
 * A string is represented by an array if the array elements concatenated in order forms the string.
 * <p>
 * Example 1:
 * <p>
 * Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
 * <p>
 * Output: true
 * <p>
 * Explanation:
 * word1 represents string "ab" + "c" -> "abc"
 * word2 represents string "a" + "bc" -> "abc"
 * The strings are the same, so return true.
 * <p>
 * Example 2:
 * <p>
 * Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
 * <p>
 * Output: false
 * <p>
 * Example 3:
 * <p>
 * Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
 * <p>
 * Output: true
 * <p>
 * Constraints:
 * <p>
 * 1 <= word1.length, word2.length <= 103
 * 1 <= word1[i].length, word2[i].length <= 103
 * 1 <= sum(word1[i].length), sum(word2[i].length) <= 103
 * word1[i] and word2[i] consist of lowercase letters.
 */
public class CheckIfTwoStringArraysAreEquivalent {

    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual2(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
        System.out.println(arrayStringsAreEqual2(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
        System.out.println(arrayStringsAreEqual2(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }

    public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        return Arrays.equals(Arrays.stream(word1).flatMapToInt(String::chars).toArray()
                , Arrays.stream(word2).flatMapToInt(String::chars).toArray());
    }

    public static boolean arrayStringsAreEqual3(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for (String str : word1) {
            sb1.append(str);
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : word2) {
            sb2.append(str);
        }
        return sb1.toString().contentEquals(sb2);
    }

}
