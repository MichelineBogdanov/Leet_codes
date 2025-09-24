package ru.bogdanov.count_the_digits_that_divide_a_number_2520;

/**
 * Given an integer num, return the number of digits in num that divide num.
 * An integer val divides nums if nums % val == 0.
 * <p>
 * Example 1:
 * <p>
 * Input: num = 7
 * <p>
 * Output: 1
 * <p>
 * Explanation: 7 divides itself, hence the answer is 1.
 * <p>
 * Example 2:
 * <p>
 * Input: num = 121
 * <p>
 * Output: 2
 * <p>
 * Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
 * <p>
 * Example 3:
 * <p>
 * Input: num = 1248
 * <p>
 * Output: 4
 * <p>
 * Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
 * <p>
 * Constraints:
 * <p>
 * 1 <= num <= 10^9
 * <p>
 * num does not contain 0 as one of its digits.
 */
public class CountTheDigitsThatDivideANumber {

    public int countDigits(int num) {
        int res = 0;
        int checkNum = num;
        while (checkNum > 0) {
            int div = checkNum % 10;
            if (num % div == 0) {
                res++;
            }
            checkNum /= 10;
        }
        return res;
    }

}
