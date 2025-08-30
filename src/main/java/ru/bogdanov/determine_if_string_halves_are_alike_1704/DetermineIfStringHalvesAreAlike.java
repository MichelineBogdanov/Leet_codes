package ru.bogdanov.determine_if_string_halves_are_alike_1704;

/**
 * You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the
 * first half and b be the second half.
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
 * Notice that s contains uppercase and lowercase letters.
 * Return true if a and b are alike. Otherwise, return false.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "book"
 * <p>
 * Output: true
 * <p>
 * Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "textbook"
 * <p>
 * Output: false
 * <p>
 * Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
 * <p>
 * Notice that the vowel o is counted twice.
 * <p>
 * Constraints:
 * <p>
 * 2 <= s.length <= 1000
 * <p>
 * s.length is even.
 * <p>
 * s consists of uppercase and lowercase letters.
 */
public class DetermineIfStringHalvesAreAlike {

    public static void main(String[] args) {

    }

    public boolean halvesAreAlike(String s) {
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);
        int c1 = 0;
        int c2 = 0;
        for (char c : s1.toCharArray()) {
            if (isVowel(c)) {
                c1++;
            }
        }
        for (char c : s2.toCharArray()) {
            if (isVowel(c)) {
                c2++;
            }
        }
        return c1 == c2;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

}
