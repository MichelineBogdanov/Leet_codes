package ru.bogdanov.number_of_even_and_odd_bits_2595;

import java.util.Arrays;

/**
 * You are given a positive integer n.
 * Let even denote the number of even indices in the binary representation of n with value 1.
 * Let odd denote the number of odd indices in the binary representation of n with value 1.
 * Note that bits are indexed from right to left in the binary representation of a number.
 * Return the array [even, odd].
 * <p>
 * Example 1:
 * <p>
 * Input: n = 50
 * <p>
 * Output: [1,2]
 * <p>
 * Explanation:
 * <p>
 * The binary representation of 50 is 110010.
 * <p>
 * It contains 1 on indices 1, 4, and 5.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 2
 * <p>
 * Output: [0,1]
 * <p>
 * Explanation:
 * <p>
 * The binary representation of 2 is 10.
 * <p>
 * It contains 1 only on index 1.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 1000
 */
public class NumberOfEvenAndOddBits {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenOddBit(5)));
        System.out.println(Arrays.toString(evenOddBit(50)));
    }

    public static int[] evenOddBit(int n) {
        int[] res = new int[2];
        String binaryString = Integer.toBinaryString(n);
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                if ((binaryString.length() - i) % 2 == 0) {
                    res[1]++;
                } else {
                    res[0]++;
                }
            }
        }
        return res;
    }

}
