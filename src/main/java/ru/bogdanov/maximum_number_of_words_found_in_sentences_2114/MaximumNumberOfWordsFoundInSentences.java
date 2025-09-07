package ru.bogdanov.maximum_number_of_words_found_in_sentences_2114;

/**
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
 * Return the maximum number of words that appear in a single sentence.
 * <p>
 * Example 1:
 * <p>
 * Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
 * <p>
 * Output: 6
 * <p>
 * Explanation:
 * <p>
 * - The first sentence, "alice and bob love leetcode", has 5 words in total.
 * <p>
 * - The second sentence, "i think so too", has 4 words in total.
 * <p>
 * - The third sentence, "this is great thanks very much", has 6 words in total.
 * <p>
 * Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
 * Example 2:
 * <p>
 * Input: sentences = ["please wait", "continue to fight", "continue to win"]
 * <p>
 * Output: 3
 * <p>
 * Explanation: It is possible that multiple sentences contain the same number of words.
 * In this example, the second and third sentences (underlined) have the same number of words.
 * <p>
 * Constraints:
 * <p>
 * 1 <= sentences.length <= 100
 * <p>
 * 1 <= sentences[i].length <= 100
 * <p>
 * sentences[i] consists only of lowercase English letters and ' ' only.
 * <p>
 * sentences[i] does not have leading or trailing spaces.
 * <p>
 * All the words in sentences[i] are separated by a single space.
 */
public class MaximumNumberOfWordsFoundInSentences {

    public int mostWordsFound(String[] sentences) {
        int res = 0;
        for (String sentence : sentences) {
            String[] split = sentence.split(" ");
            if (split.length > res) {
                res = split.length;
            }
        }
        return res;
    }

}
