package ru.bogdanov.minimize_string_length_2716;

import java.util.HashSet;

/**
 * Given a string s, you have two types of operation:
 * <p>
 * Choose an index i in the string, and let c be the character in position i. Delete the closest occurrence of c to the left of i (if exists).
 * <p>
 * Choose an index i in the string, and let c be the character in position i. Delete the closest occurrence of c to the right of i (if exists).
 * <p>
 * Your task is to minimize the length of s by performing the above operations zero or more times.
 * <p>
 * Return an integer denoting the length of the minimized string.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "aaabc"
 * <p>
 * Output: 3
 * <p>
 * Explanation:
 * <p>
 * Operation 2: we choose i = 1 so c is 'a', then we remove s[2] as it is closest 'a' character to the right of s[1].
 * s becomes "aabc" after this.
 * <p>
 * Operation 1: we choose i = 1 so c is 'a', then we remove s[0] as it is closest 'a' character to the left of s[1].
 * s becomes "abc" after this.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "cbbd"
 * <p>
 * Output: 3
 * <p>
 * Explanation:
 * <p>
 * Operation 1: we choose i = 2 so c is 'b', then we remove s[1] as it is closest 'b' character to the left of s[1].
 * s becomes "cbd" after this.
 * <p>
 * Example 3:
 * <p>
 * Input: s = "baadccab"
 * <p>
 * Output: 4
 * <p>
 * Explanation:
 * <p>
 * Operation 1: we choose i = 6 so c is 'a', then we remove s[2] as it is closest 'a' character to the left of s[6].
 * s becomes "badccab" after this.
 * <p>
 * Operation 2: we choose i = 0 so c is 'b', then we remove s[6] as it is closest 'b' character to the right of s[0].
 * s becomes "badcca" fter this.
 * <p>
 * Operation 2: we choose i = 3 so c is 'c', then we remove s[4] as it is closest 'c' character to the right of s[3].
 * s becomes "badca" after this.
 * <p>
 * Operation 1: we choose i = 4 so c is 'a', then we remove s[1] as it is closest 'a' character to the left of s[4].
 * s becomes "bdca" after this.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 100
 * <p>
 * s contains only lowercase English letters
 */
public class MinimizeStringLength {

    public int minimizedStringLength(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set.size();
    }

}
