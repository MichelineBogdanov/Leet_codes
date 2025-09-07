package ru.bogdanov.sum_of_digits_in_base_k_1837;

/**
 * Given an integer n (in base 10) and a base k, return the sum of the digits of n after converting n from base 10 to base k.
 * After converting, each digit should be interpreted as a base 10 number, and the sum should be returned in base 10.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 34, k = 6
 * <p>
 * Output: 9
 * <p>
 * Explanation: 34 (base 10) expressed in base 6 is 54. 5 + 4 = 9.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 10, k = 10
 * <p>
 * Output: 1
 * <p>
 * Explanation: n is already in base 10. 1 + 0 = 1.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 100
 * <p>
 * 2 <= k <= 10
 */
public class SumOfDigitsInBaseK {

    public int sumBase(int n, int k) {
        String string = Integer.toString(n, k);
        int res = 0;
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c)) {
                res += (int) c - '0';
            }
        }
        return res;
    }

}
