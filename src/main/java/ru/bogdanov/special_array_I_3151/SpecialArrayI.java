package ru.bogdanov.special_array_I_3151;

/**
 * An array is considered special if the parity of every pair of adjacent elements is different.
 * In other words, one element in each pair must be even, and the other must be odd.
 * You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1]
 * <p>
 * Output: true
 * <p>
 * Explanation:
 * <p>
 * There is only one element. So the answer is true.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [2,1,4]
 * <p>
 * Output: true
 * <p>
 * Explanation:
 * <p>
 * There is only two pairs: (2,1) and (1,4), and both of them contain numbers with different parity. So the answer is true.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [4,3,1,6]
 * <p>
 * Output: false
 * <p>
 * Explanation:
 * <p>
 * nums[1] and nums[2] are both odd. So the answer is false.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * <p>
 * 1 <= nums[i] <= 100
 */
public class SpecialArrayI {

    public static void main(String[] args) {
        System.out.println(isArraySpecial(new int[]{2, 1, 4}));
    }

    public static boolean isArraySpecial(int[] nums) {
        boolean isOdd = nums[0] % 2 == 0;
        for (int i = 1; i < nums.length; i++) {
            boolean check = nums[i] % 2 == 0;
            if (isOdd) {
                if (check) {
                    return false;
                }
            } else {
                if (!check) {
                    return false;
                }
            }
            isOdd = check;
        }
        return true;
    }

}
