package ru.bogdanov.valid_palindrome_125;


import java.util.Locale;
import java.util.stream.IntStream;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 * Constraints:
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome3("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome3("race a car"));
        System.out.println(isPalindrome3(" "));
        System.out.println(isPalindrome3("123qwe./>><>?pqsjfds3421"));
        System.out.println(isPalindrome3("0P"));
        System.out.println(isPalindrome3("ab_a"));
    }

    public static boolean isPalindrome(String s) {
        char[] array = s.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]", "").toCharArray();
        return IntStream.range(0, array.length).noneMatch(i -> array[i] != array[array.length - 1 - i]);
    }

    public static boolean isPalindrome2(String s) {
        String ready = s.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]", "");
        StringBuilder reverse = new StringBuilder(s).reverse();
        return ready.contentEquals(reverse);
    }

    private static boolean isPalindrome3(String s) {
        if (s.isEmpty()) {
            return true;
        }
        String sLower = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (!Character.isLetterOrDigit(sLower.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(sLower.charAt(end))) {
                end--;
            } else {
                if (sLower.charAt(start) != sLower.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
