package ru.bogdanov.longest_common_prefix_14;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * ---
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * ---
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strings = {"dog", "racecar", "car"};
        String s = longestCommonPrefix.longestCommonPrefix2(strings);
        System.out.println(s);
    }

    public String longestCommonPrefix1(String[] strs) {
        String result = "";
        if (strs.length == 0) {
            return result;
        }
        if (strs.length == 1) {
            return strs[0];
        }
        strs = Arrays.stream(strs).sorted(Comparator.comparingInt(String::length)).toArray(String[]::new);
        result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String check = strs[i];
            int end = result.length();
            while (end >= result.length()) {
                if (result.equals(check.substring(0, end))) {
                    break;
                } else {
                    result = result.substring(0, end - 1);
                    end--;
                }
            }
        }
        return result;
    }

    public String longestCommonPrefix2(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                result.append(first.charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }

}
