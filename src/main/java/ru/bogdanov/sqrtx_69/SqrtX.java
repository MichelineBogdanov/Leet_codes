package ru.bogdanov.sqrtx_69;

/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 * You must not use any built-in exponent function or operator.
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * ---
 * Example 1:
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 * ---
 * Example 2:
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 */
public class SqrtX {

    public static void main(String[] args) {
        SqrtX sqrtX = new SqrtX();
        System.out.println(sqrtX.mySqrt(3));
        System.out.println(sqrtX.mySqrt(8));
        System.out.println(sqrtX.mySqrt(64));
    }

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        double rez = 1;
        double e = 0.5;
        while (Math.abs(rez * rez - x) > e) {
            rez = (rez + x / rez) / 2;
        }
        return (int) rez;
    }

}
