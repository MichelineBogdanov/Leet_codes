package ru.bogdanov.fibonacci_number_509;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number
 * is the sum of the two preceding ones, starting from 0 and 1. That is,
 * <p>
 * F(0) = 0, F(1) = 1
 * <p>
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * <p>
 * Given n, calculate F(n).
 * <p>
 * Example 1:
 * <p>
 * Input: n = 2
 * <p>
 * Output: 1
 * <p>
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 3
 * <p>
 * Output: 2
 * <p>
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 * <p>
 * Example 3:
 * <p>
 * Input: n = 4
 * <p>
 * Output: 3
 * <p>
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 * <p>
 * Constraints:
 * <p>
 * 0 <= n <= 30
 */
public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
    }

    public static int fib(int n) {
        int prev = 0;
        int cur = 1;
        for (int i = 0; i < n; i++) {
            int next = prev + cur;
            prev = cur;
            cur = next;
        }
        return prev;
    }

}
