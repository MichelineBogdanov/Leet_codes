package ru.bogdanov.gcd_of_odd_and_even_sums_3658;

/**
 * You are given an integer n. Your task is to compute the GCD (greatest common divisor) of two values:
 * sumOdd: the sum of the first n odd numbers.
 * sumEven: the sum of the first n even numbers.
 * Return the GCD of sumOdd and sumEven.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 4
 * <p>
 * Output: 4
 * <p>
 * Explanation:
 * <p>
 * Sum of the first 4 odd numbers sumOdd = 1 + 3 + 5 + 7 = 16
 * <p>
 * Sum of the first 4 even numbers sumEven = 2 + 4 + 6 + 8 = 20
 * <p>
 * Hence, GCD(sumOdd, sumEven) = GCD(16, 20) = 4.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 5
 * <p>
 * Output: 5
 * <p>
 * Explanation:
 * <p>
 * Sum of the first 5 odd numbers sumOdd = 1 + 3 + 5 + 7 + 9 = 25
 * Sum of the first 5 even numbers sumEven = 2 + 4 + 6 + 8 + 10 = 30
 * Hence, GCD(sumOdd, sumEven) = GCD(25, 30) = 5.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 100
 */
public class GCDOfOddAndEvenSums {

    public int gcdOfOddEvenSums(int n) {
        int first = 0;
        int second = 0;
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 != 0) {
                first++;
            } else {
                second++;
            }
        }
        return gcd(first, second);
    }

    private int gcd(int first, int second) {
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }

    public int gcdOfOddEvenSums2(int n) {
        return n;
    }

}
