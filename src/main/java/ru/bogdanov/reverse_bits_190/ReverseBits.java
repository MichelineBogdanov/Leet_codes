package ru.bogdanov.reverse_bits_190;

/**
 * Reverse bits of a given 32 bits unsigned integer.
 * <p>
 * Note:
 * <p>
 * Note that in some languages, such as Java, there is no unsigned integer type.
 * In this case, both input and output will be given as a signed integer type.
 * They should not affect your implementation, as the integer's internal binary representation
 * is the same, whether it is signed or unsigned.
 * In Java, the compiler represents the signed integers using 2's complement notation.
 * Therefore, in Example 2 below, the input represents the signed integer -3 and the output
 * represents the signed integer -1073741825.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 43261596
 * <p>
 * Output: 964176192
 * <p>
 * Explanation:
 * <p>
 * Integer	    Binary
 * <p>
 * 43261596	    00000010100101000001111010011100
 * <p>
 * 964176192	00111001011110000010100101000000
 * <p>
 * Example 2:
 * <p>
 * Input: n = 2147483644
 * <p>
 * Output: 1073741822
 * <p>
 * Explanation:
 * <p>
 * Integer	    Binary
 * <p>
 * 2147483644	01111111111111111111111111111100
 * <p>
 * 1073741822	00111111111111111111111111111110
 * <p>
 * Constraints:
 * <p>
 * 0 <= n <= 231 - 2
 * n is even.
 * <p>
 * Follow up: If this function is called many times, how would you optimize it?
 */
public class ReverseBits {

    public static void main(String[] args) {
        System.out.println(reverseBits2(43261596));
        System.out.println(reverseBits2(2147483644));
    }

    public static int reverseBits(int n) {
        return Integer.parseInt(new StringBuilder(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0')).reverse().toString(), 2);
    }

    public static int reverseBits2(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append(n % 2);
            n /= 2;
        }
        return Integer.parseInt(sb.toString(), 2);
    }

}
