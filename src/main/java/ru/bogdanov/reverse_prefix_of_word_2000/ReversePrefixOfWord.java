package ru.bogdanov.reverse_prefix_of_word_2000;

/**
 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends
 * at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
 * <p>
 * For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and
 * ends at 3 (inclusive). The resulting string will be "dcbaefd".
 * Return the resulting string.
 * <p>
 * Example 1:
 * <p>
 * Input: word = "abcdefd", ch = "d"
 * <p>
 * Output: "dcbaefd"
 * <p>
 * Explanation: The first occurrence of "d" is at index 3.
 * Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
 * <p>
 * Example 2:
 * <p>
 * Input: word = "xyxzxe", ch = "z"
 * <p>
 * Output: "zxyxxe"
 * <p>
 * Explanation: The first and only occurrence of "z" is at index 3.
 * Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
 * <p>
 * Example 3:
 * <p>
 * Input: word = "abcd", ch = "z"
 * <p>
 * Output: "abcd"
 * <p>
 * Explanation: "z" does not exist in word.
 * You should not do any reverse operation, the resulting string is "abcd".
 */
public class ReversePrefixOfWord {

    public static void main(String[] args) {

    }

    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index > 0) {
            return new StringBuilder(word.substring(0, index + 1))
                    .reverse()
                    .append(word.substring(index + 1))
                    .toString();
        }
        return word;
    }
}
