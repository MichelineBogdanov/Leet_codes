package ru.bogdanov.score_of_a_string_3110;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.
 * Return the score of s.
 * Example 1:
 * Input: s = "hello"
 * Output: 13
 * Explanation:
 * The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111.
 * So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.
 * Example 2:
 * Input: s = "zaz"
 * Output: 50
 * Explanation:
 * The ASCII values of the characters in s are: 'z' = 122, 'a' = 97.
 * So, the score of s would be |122 - 97| + |97 - 122| = 25 + 25 = 50.
 * Constraints:
 * 2 <= s.length <= 100
 * s consists only of lowercase English letters.
 */
public class ScoreOfAString {

    public static void main(String[] args) {
        System.out.println(scoreOfString3("zaz"));
    }

    public static int scoreOfString(String s) {
        int[] arr = new int[s.length() - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return Arrays.stream(arr).sum();
    }

    public static int scoreOfString2(String s) {
        return IntStream.range(0, s.length() - 1).parallel().map(i -> Math.abs(s.charAt(i) - s.charAt(i + 1))).sum();
    }

    public static int scoreOfString3(String s) {
        int curSum = 0;
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length - 1; i++) {
            curSum += Math.abs(bytes[i] - bytes[i + 1]);
        }
        return curSum;
    }

}
