package ru.bogdanov.divide_a_string_into_groups_of_size_k_2128;

import java.util.Arrays;

/**
 * A string s can be partitioned into groups of size k using the following procedure:
 * The first group consists of the first k characters of the string, the second group consists of the next k
 * characters of the string, and so on. Each element can be a part of exactly one group.
 * For the last group, if the string does not have k characters remaining, a character fill is used to complete the group.
 * Note that the partition is done so that after removing the fill character from the last group (if it exists)
 * and concatenating all the groups in order, the resultant string should be s.
 * <p>
 * Given the string s, the size of each group k and the character fill, return a string array denoting the composition of every group s has been divided into, using the above procedure.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcdefghi", k = 3, fill = "x"
 * <p>
 * Output: ["abc","def","ghi"]
 * <p>
 * Explanation:
 * <p>
 * The first 3 characters "abc" form the first group.
 * The next 3 characters "def" form the second group.
 * The last 3 characters "ghi" form the third group.
 * Since all groups can be completely filled by characters from the string, we do not need to use fill.
 * Thus, the groups formed are "abc", "def", and "ghi".
 * <p>
 * Example 2:
 * <p>
 * Input: s = "abcdefghij", k = 3, fill = "x"
 * <p>
 * Output: ["abc","def","ghi","jxx"]
 * <p>
 * Explanation:
 * <p>
 * Similar to the previous example, we are forming the first three groups "abc", "def", and "ghi".
 * For the last group, we can only use the character 'j' from the string. To complete this group, we add 'x' twice.
 * Thus, the 4 groups formed are "abc", "def", "ghi", and "jxx".
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 100
 * <p>
 * s consists of lowercase English letters only.
 * <p>
 * 1 <= k <= 100
 * <p>
 * fill is a lowercase English letter.
 */
public class DivideAStringIntoGroupsOfSizeK {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divideString("abcdefghi", 3, 'x')));
        System.out.println(Arrays.toString(divideString("abcdefghij", 3, 'x')));
        System.out.println(Arrays.toString(divideString("ctoyjrwtngqwt", 8, 'n')));
    }

    public static String[] divideString(String s, int k, char fill) {
        int size = s.length() / k;
        int lastBatch = s.length() - (s.length() % k);
        if (lastBatch != s.length()) {
            size++;
        }
        String[] res = new String[size];
        for (int i = 0, j = 0; i < size; i++, j += k) {
            if (j == lastBatch) {
                res[i] = s.substring(j) + String.valueOf(fill).repeat(Math.max(0, k - (s.length() - lastBatch)));
            } else {
                res[i] = s.substring(j, j + k);
            }
        }
        return res;
    }

}
