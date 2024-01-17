package ru.bogdanov.longest_substring_without_repeating_characters_3;

import java.util.*;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * ---
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * ---
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * ---
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * ---
 * Constraints:
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstring {

    public static void main(String[] args) {
        LongestSubstring ls = new LongestSubstring();
        System.out.println(ls.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(ls.lengthOfLongestSubstring("bbbbb"));
        System.out.println(ls.lengthOfLongestSubstring("pwwkew"));
        System.out.println(ls.lengthOfLongestSubstring("abcd378^klfhlv;adf"));
        System.out.println(ls.lengthOfLongestSubstring("aab"));
        System.out.println(ls.lengthOfLongestSubstring("dvdf"));
    }

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int rez = 0;
        HashSet<Character> charsSet = new HashSet<>();
        ArrayDeque<Character> charsStack = new ArrayDeque<>();
        for (char aChar : chars) {
            if (charsSet.add(aChar)) {
                charsStack.addLast(aChar);
                rez = Math.max(rez, charsStack.size());
            } else {
                char c = charsStack.getFirst();
                do {
                    charsSet.remove(c);
                } while ((c = charsStack.removeFirst()) != aChar);
                charsSet.add(aChar);
                charsStack.addLast(aChar);
            }
        }
        return rez;
    }

}
