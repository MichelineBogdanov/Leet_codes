package ru.bogdanov.palindrome_number_9;

import java.util.ArrayList;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * ---
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * ---
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * ---
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * ---
 * Constraints:
 * -2^31<=x<=(2^31)-1
 */

public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome3(121));
        System.out.println(palindromeNumber.isPalindrome3(522));
        System.out.println(palindromeNumber.isPalindrome3(1234));
        System.out.println(palindromeNumber.isPalindrome3(55676));
        System.out.println(palindromeNumber.isPalindrome3(12345678));
        System.out.println(palindromeNumber.isPalindrome3(123));
        System.out.println(palindromeNumber.isPalindrome3(-121));
        //System.out.println(palindromeNumber.isPalindrome(-321));
    }

    public boolean isPalindrome(int x) {
        int temp = x;
        if (x == 10 || x < 0) {
            return false;
        }
        double numbersCount = Math.ceil(Math.log10(x));
        if (numbersCount == 1 || x == 1) {
            return true;
        }
        for (int i = 0; i < numbersCount; i++) {
            x -= ((temp % 10) * Math.pow(10, numbersCount - i - 1));
            temp = temp / 10;
        }
        return x == 0;
    }

    public boolean isPalindrome2(int x) {
        return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
    }

    public boolean isPalindrome3(int x) {
        if (x == 10 || x < 0 || x == 100) {
            return false;
        }
        double numbersCount = Math.ceil(Math.log10(x));
        if (numbersCount == 1 || x == 1) {
            return true;
        }
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < numbersCount; i++) {
            ints.add(x % 10);
            x /= 10;
        }
        for (int i = 0; i < numbersCount / 2; i++) {
            if (ints.get(i) != (ints.get(((int) numbersCount) - 1 - i))) {
                return false;
            }
        }
        return true;
    }

}
