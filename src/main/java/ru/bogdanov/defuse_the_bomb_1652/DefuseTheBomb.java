package ru.bogdanov.defuse_the_bomb_1652;

import java.util.Arrays;

/**
 * You have a bomb to defuse, and your time is running out! Your informer will provide you with a circular array code of length of n and a key k.
 * To decrypt the code, you must replace every number. All the numbers are replaced simultaneously.
 * <p>
 * If k > 0, replace the ith number with the sum of the next k numbers.
 * <p>
 * If k < 0, replace the ith number with the sum of the previous k numbers.
 * <p>
 * If k == 0, replace the ith number with 0.
 * <p>
 * As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].
 * Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!
 * <p>
 * Example 1:
 * <p>
 * Input: code = [5,7,1,4], k = 3
 * <p>
 * Output: [12,10,16,13]
 * <p>
 * Explanation: Each number is replaced by the sum of the next 3 numbers. The decrypted code is [7+1+4, 1+4+5, 4+5+7, 5+7+1]. Notice that the numbers wrap around.
 * <p>
 * Example 2:
 * <p>
 * Input: code = [1,2,3,4], k = 0
 * <p>
 * Output: [0,0,0,0]
 * <p>
 * Explanation: When k is zero, the numbers are replaced by 0.
 * <p>
 * Example 3:
 * <p>
 * Input: code = [2,4,9,3], k = -2
 * <p>
 * Output: [12,5,6,13]
 * <p>
 * Explanation: The decrypted code is [3+9, 2+3, 4+2, 9+4]. Notice that the numbers wrap around again. If k is negative, the sum is of the previous numbers.
 * <p>
 * Constraints:
 * <p>
 * n == code.length
 * <p>
 * 1 <= n <= 100
 * <p>
 * 1 <= code[i] <= 100
 * <p>
 * -(n - 1) <= k <= n - 1
 */
public class DefuseTheBomb {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(decrypt(new int[]{5, 7, 1, 4}, 3)));
        System.out.println(Arrays.toString(decrypt(new int[]{1, 2, 3, 4}, 0)));
        System.out.println(Arrays.toString(decrypt(new int[]{2, 4, 9, 3}, -2)));
    }

    public static int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        if (k == 0) {
            return res;
        } else {
            for (int i = 0; i < res.length; i++) {
                int val = 0;
                for (int j = 1; j <= Math.abs(k); j++) {
                    int index;
                    if (k > 0) {
                        index = i + j >= code.length ? Math.abs(code.length - i - j) : i + j;
                    } else {
                        index = i - j >= 0 ? i - j : code.length + i - j;
                    }
                    val += code[Math.abs(index)];
                }
                res[i] = val;
            }
        }
        return res;
    }

}
