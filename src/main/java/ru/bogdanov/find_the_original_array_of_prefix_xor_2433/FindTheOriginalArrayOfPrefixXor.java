package ru.bogdanov.find_the_original_array_of_prefix_xor_2433;

/**
 * You are given an integer array pref of size n. Find and return the array arr of size n that satisfies:
 * <p>
 * pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
 * Note that ^ denotes the bitwise-xor operation.
 * It can be proven that the answer is unique.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: pref = [5,2,0,3,1]
 * <p>
 * Output: [5,7,2,3,2]
 * <p>
 * Explanation: From the array [5,7,2,3,2] we have the following:
 * <p>
 * - pref[0] = 5.
 * <p>
 * - pref[1] = 5 ^ 7 = 2.
 * <p>
 * - pref[2] = 5 ^ 7 ^ 2 = 0.
 * <p>
 * - pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
 * <p>
 * - pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.
 * <p>
 * Example 2:
 * <p>
 * Input: pref = [13]
 * <p>
 * Output: [13]
 * <p>
 * Explanation: We have pref[0] = arr[0] = 13.
 * <p>
 * Constraints:
 * <p>
 * 1 <= pref.length <= 105
 * <p>
 * 0 <= pref[i] <= 106
 */
public class FindTheOriginalArrayOfPrefixXor {

    public static void main(String[] args) {

    }

    public int[] findArray(int[] pref) {
        for (int i = pref.length - 1; i >= 1; i--) {
            pref[i] = pref[i] ^ pref[i - 1];
        }
        return pref;
    }
}
