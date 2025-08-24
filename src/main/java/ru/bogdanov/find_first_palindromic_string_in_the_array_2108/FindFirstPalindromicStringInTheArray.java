package ru.bogdanov.find_first_palindromic_string_in_the_array_2108;

/**
 * Given an array of strings words, return the first palindromic string in the array.
 * If there is no such string, return an empty string "".
 * A string is palindromic if it reads the same forward and backward.
 * <p>
 * Example 1:
 * <p>
 * Input: words = ["abc","car","ada","racecar","cool"]
 * <p>
 * Output: "ada"
 * <p>
 * Explanation: The first string that is palindromic is "ada".
 * <p>
 * Note that "racecar" is also palindromic, but it is not the first.
 * <p>
 * Example 2:
 * <p>
 * Input: words = ["notapalindrome","racecar"]
 * <p>
 * Output: "racecar"
 * <p>
 * Explanation: The first and only string that is palindromic is "racecar".
 * <p>
 * Example 3:
 * <p>
 * Input: words = ["def","ghi"]
 * <p>
 * Output: ""
 * <p>
 * Explanation: There are no palindromic strings, so the empty string is returned.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 100
 * <p>
 * 1 <= words[i].length <= 100
 * <p>
 * words[i] consists only of lowercase English letters.
 */
public class FindFirstPalindromicStringInTheArray {

    public static void main(String[] args) {

    }

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
