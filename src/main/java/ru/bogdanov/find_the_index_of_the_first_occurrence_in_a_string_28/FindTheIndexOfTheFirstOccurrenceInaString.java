package ru.bogdanov.find_the_index_of_the_first_occurrence_in_a_string_28;

/**
 * Given two strings needle and haystack, return the index of the first occurrence
 * of needle in haystack, or -1 if needle is not part of haystack.
 * Example 1:
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 * Constraints:
 * 1 <= haystack.length(), needle.length() <= 104
 * haystack and needle consist of only lowercase English characters.
 */
public class FindTheIndexOfTheFirstOccurrenceInaString {

    public static void main(String[] args) {
        String s1 = "sadbutsad";
        String s2 = "sad";
        System.out.println(strStr(s1, s2));

        String s3 = "mississippi";
        String s4 = "issip";
        System.out.println(strStr(s3, s4));

        String s5 = "uytleetcode";
        String s6 = "leet";
        System.out.println(strStr(s5, s6));

        String s7 = "aaa";
        String s8 = "a";
        System.out.println(strStr(s7, s8));
    }

    public static int strStr(String haystack, String needle) {
        int result = -1;
        for (int i = 0; i + needle.length() <= haystack.length(); i++) {
            for (int k = 0; k < needle.length(); k++) {
                result = i;
                if (haystack.charAt(i + k) != needle.charAt(k)) {
                    result = -1;
                    break;
                }
                if (k == needle.length() - 1) {
                    return result;
                }
            }
        }
        return result;
    }

}
