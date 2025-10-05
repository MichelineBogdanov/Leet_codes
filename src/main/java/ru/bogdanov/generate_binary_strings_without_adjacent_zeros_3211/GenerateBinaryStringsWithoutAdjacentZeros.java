package ru.bogdanov.generate_binary_strings_without_adjacent_zeros_3211;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a positive integer n.
 * A binary string x is valid if all substrings of x of length 2 contain at least one "1".
 * Return all valid strings with length n, in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 3
 * <p>
 * Output: ["010","011","101","110","111"]
 * <p>
 * Explanation:
 * <p>
 * The valid strings of length 3 are: "010", "011", "101", "110", and "111".
 * <p>
 * Example 2:
 * <p>
 * Input: n = 1
 * <p>
 * Output: ["0","1"]
 * <p>
 * Explanation:
 * <p>
 * The valid strings of length 1 are: "0" and "1".
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 18
 */
public class GenerateBinaryStringsWithoutAdjacentZeros {

    public static void main(String[] args) {
        GenerateBinaryStringsWithoutAdjacentZeros zeros = new GenerateBinaryStringsWithoutAdjacentZeros();
        System.out.println(zeros.validStrings(3));
        System.out.println(zeros.validStrings(1));
    }

    public List<String> validStrings(int n) {
        List<String> strings = List.of("0", "1");
        for (int i = 0; i < n - 1; i++) {
            strings = generate(strings);
        }
        return strings;
    }

    private List<String> generate(List<String> strings) {
        ArrayList<String> res = new ArrayList<>();
        for (String string : strings) {
            if (string.charAt(string.length() - 1) == '1') {
                res.add(string + "0");
                res.add(string + "1");
            } else if (string.charAt(string.length() - 1) == '0') {
                res.add(string + "1");
            }
        }
        return res;
    }

}
