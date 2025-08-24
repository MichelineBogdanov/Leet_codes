package ru.bogdanov.merge_strings_alternately_1768;

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other, append the additional letters onto the
 * end of the merged string.
 * <p>
 * Return the merged string.
 * <p>
 * Example 1:
 * <p>
 * Input: word1 = "abc", word2 = "pqr"
 * <p>
 * Output: "apbqcr"
 * <p>
 * Explanation: The merged string will be merged as so:
 * <p>
 * word1:  a   b   c
 * <p>
 * word2:    p   q   r
 * <p>
 * merged: a p b q c r
 * <p>
 * Example 2:
 * <p>
 * Input: word1 = "ab", word2 = "pqrs"
 * <p>
 * Output: "apbqrs"
 * <p>
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * <p>
 * word1:  a   b
 * <p>
 * word2:    p   q   r   s
 * <p>
 * merged: a p b q   r   s
 * <p>
 * Example 3:
 * <p>
 * Input: word1 = "abcd", word2 = "pq"
 * <p>
 * Output: "apbqcd"
 * <p>
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * <p>
 * word1:  a   b   c   d
 * <p>
 * word2:    p   q
 * <p>
 * merged: a p b q c   d
 * <p>
 * Constraints:
 * <p>
 * 1 <= word1.length, word2.length <= 100
 * word1 and word2 consist of lowercase English letters.
 */
public class MergeStringsAlternately {

    public static void main(String[] args) {

    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        int max = Math.max(word1.length(), word2.length());
        for (int i = 0; i < max; i++) {
            if (i < word1.length()) {
                builder.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                builder.append(word2.charAt(i));
            }
        }
        return builder.toString();
    }

}
