package ru.bogdanov.add_binary_67;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * Constraints:
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 */
public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("111", "1"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int k = 0; k <= Math.max(a.length() - 1, b.length() - 1) || carry == 1; k++) {
            carry += Character.digit((a.length() - 1 - k) >= 0 ? a.charAt(a.length() - 1 - k) : '0', 2);
            carry += Character.digit((b.length() - 1 - k) >= 0 ? b.charAt(b.length() - 1 - k) : '0', 2);
            result.append(carry % 2);
            carry /= 2;
        }
        return result.reverse().toString();
    }

}
