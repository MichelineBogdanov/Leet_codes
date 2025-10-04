package ru.bogdanov.reverse_integer_7;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * <p>
 * Example 1:
 * <p>
 * Input: x = 123
 * <p>
 * Output: 321
 * <p>
 * Example 2:
 * <p>
 * Input: x = -123
 * <p>
 * Output: -321
 * <p>
 * Example 3:
 * <p>
 * Input: x = 120
 * <p>
 * Output: 21
 * <p>
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(1230));
        System.out.println(reverse(-2147483412));
    }

    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int last = x % 10;
            x /= 10;
            if (res > 0 && (Integer.MAX_VALUE - last) / 10 < res
                    || res < 0 && (Integer.MIN_VALUE - last) / 10 > res) {
                return 0;
            }
            res = res * 10 + last;
        }
        return res;
    }

    public int reverse2(int x) {
        boolean isPositive = x > 0;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(Math.abs(x)));
        stringBuilder.reverse();
        try {
            int reversed = Integer.parseInt(stringBuilder.toString());
            return isPositive ? reversed : -reversed;
        } catch (RuntimeException e) {
            return 0;
        }

    }

}
