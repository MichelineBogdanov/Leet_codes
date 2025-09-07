package ru.bogdanov.find_maximum_number_of_string_pairs_2744;

import java.util.Arrays;
import java.util.HashSet;

/**
 * You are given a 0-indexed array words consisting of distinct strings.
 * The string words[i] can be paired with the string words[j] if:
 * The string words[i] is equal to the reversed string of words[j].
 * 0 <= i < j < words.length.
 * Return the maximum number of pairs that can be formed from the array words.
 * Note that each string can belong in at most one pair.
 * <p>
 * Example 1:
 * <p>
 * Input: words = ["cd","ac","dc","ca","zz"]
 * <p>
 * Output: 2
 * <p>
 * Explanation: In this example, we can form 2 pair of strings in the following way:
 * <p>
 * - We pair the 0th string with the 2nd string, as the reversed string of word[0] is "dc" and is equal to words[2].
 * <p>
 * - We pair the 1st string with the 3rd string, as the reversed string of word[1] is "ca" and is equal to words[3].
 * <p>
 * It can be proven that 2 is the maximum number of pairs that can be formed.
 * <p>
 * Example 2:
 * <p>
 * Input: words = ["ab","ba","cc"]
 * <p>
 * Output: 1
 * <p>
 * Explanation: In this example, we can form 1 pair of strings in the following way:
 * <p>
 * - We pair the 0th string with the 1st string, as the reversed string of words[1] is "ab" and is equal to words[0].
 * <p>
 * It can be proven that 1 is the maximum number of pairs that can be formed.
 * <p>
 * Example 3:
 * <p>
 * Input: words = ["aa","ab"]
 * <p>
 * Output: 0
 * <p>
 * Explanation: In this example, we are unable to form any pair of strings.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 50
 * <p>
 * words[i].length == 2
 * <p>
 * words consists of distinct strings.
 * <p>
 * words[i] contains only lowercase English letters.
 */
public class FindMaximumNumberOfStringPairs {

    public static void main(String[] args) {
        System.out.println(maximumNumberOfStringPairs(new String[]{"cd", "ac", "dc", "ca", "zz"}));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        Arrays.sort(words);
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            StringBuilder builder = new StringBuilder(words[i]);
            String string = builder.reverse().toString();
            if (Arrays.binarySearch(words, i + 1, words.length, string) >= 0) {
                res++;
            }
        }
        return res;
    }

    public static int maximumNumberOfStringPairs2(String[] words) {
        HashSet<String> set = new HashSet<>();
        int res = 0;
        for (String word : words) {
            StringBuilder builder = new StringBuilder(word);
            String string = builder.reverse().toString();
            if (set.contains(string)) {
                res++;
            } else {
                set.add(string);
            }
        }
        return res;
    }

}
