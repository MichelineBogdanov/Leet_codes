package ru.bogdanov.first_letter_to_appear_twice_2351;

import java.util.HashSet;

/**
 * Given a string s consisting of lowercase English letters, return the first letter to appear twice.
 * <p>
 * Note:
 * <p>
 * A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
 * s will contain at least one letter that appears twice.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abccbaacz"
 * <p>
 * Output: "c"
 * <p>
 * Explanation:
 * <p>
 * The letter 'a' appears on the indexes 0, 5 and 6.
 * <p>
 * The letter 'b' appears on the indexes 1 and 4.
 * <p>
 * The letter 'c' appears on the indexes 2, 3 and 7.
 * <p>
 * The letter 'z' appears on the index 8.
 * <p>
 * The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "abcdd"
 * <p>
 * Output: "d"
 * <p>
 * Explanation:
 * <p>
 * The only letter that appears twice is 'd' so we return 'd'.
 * <p>
 * Constraints:
 * <p>
 * 2 <= s.length <= 100
 * <p>
 * s consists of lowercase English letters.
 * <p>
 * s has at least one repeated letter.
 */
public class FirstLetterToAppearTwice {

    public static void main(String[] args) {

    }

    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
            } else {
                return c;
            }
        }
        return 'a';
    }
}
