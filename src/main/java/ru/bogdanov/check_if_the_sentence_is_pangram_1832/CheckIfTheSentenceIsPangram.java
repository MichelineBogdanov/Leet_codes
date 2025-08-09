package ru.bogdanov.check_if_the_sentence_is_pangram_1832;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram,
 * or false otherwise.
 * <p>
 * Example 1:
 * <p>
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * <p>
 * Output: true
 * <p>
 * Explanation: sentence contains at least one of every letter of the English alphabet.
 * <p>
 * Example 2:
 * <p>
 * Input: sentence = "leetcode"
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * 1 <= sentence.length <= 1000
 * sentence consists of lowercase English letters.
 */
public class CheckIfTheSentenceIsPangram {

    public static void main(String[] args) {

    }

    public boolean checkIfPangram(String sentence) {
        return sentence.chars().boxed().collect(Collectors.toSet()).size() == 26;
    }

    public boolean checkIfPangram2(String sentence) {
        HashSet<Integer> integers = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            integers.add((int) c);
        }
        return integers.size() == 26;
    }
}
