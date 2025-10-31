package ru.bogdanov.the_two_sneaky_numbers_of_digitville_3289;

/**
 * In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1.
 * Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked
 * in an additional time, making the list longer than usual.
 * As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing
 * the two numbers (in any order), so peace can return to Digitville.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [0,1,1,0]
 * <p>
 * Output: [0,1]
 * <p>
 * Explanation:
 * <p>
 * The numbers 0 and 1 each appear twice in the array.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [0,3,2,1,3,2]
 * <p>
 * Output: [2,3]
 * <p>
 * Explanation:
 * <p>
 * The numbers 2 and 3 each appear twice in the array.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [7,1,5,4,3,4,6,0,9,5,8,2]
 * <p>
 * Output: [4,5]
 * <p>
 * Explanation:
 * <p>
 * The numbers 4 and 5 each appear twice in the array.
 * <p>
 * Constraints:
 * <p>
 * 2 <= n <= 100
 * <p>
 * nums.length == n + 2
 * <p>
 * 0 <= nums[i] < n
 * <p>
 * The input is generated such that nums contains exactly two repeated elements.
 */
public class TheTwoSneakyNumbersOfDigitville {

    public int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2];
        int[] check = new int[100];
        int i = 0;
        for (int num : nums) {
            check[num]++;
            if (check[num] == 2) {
                res[i] = num;
                i++;
            }
        }
        return res;
    }

}
