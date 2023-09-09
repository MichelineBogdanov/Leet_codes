package ru.bogdanov.arrays101;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * only 12 and 7896 contain an even number of digits.
 */

import java.util.Arrays;

public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        FindNumbersWithEvenNumberOfDigits findNumbersWithEvenNumberOfDigits = new FindNumbersWithEvenNumberOfDigits();
        int[] ints = {12, 345, 2, 6, 7896, 11};
        int numbers = findNumbersWithEvenNumberOfDigits.findNumbers(ints);
        System.out.println(numbers);
    }

    public int findNumbers(int[] nums) {
        return Arrays.stream(nums).filter(num -> String.valueOf(num).length() % 2 == 0).toArray().length;
    }
}
