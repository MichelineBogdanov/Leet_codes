package ru.bogdanov.minimum_operations_to_make_array_sum_divisible_by_k_3512;

/**
 * You are given an integer array nums and an integer k. You can perform the following operation any number of times:
 * Select an index i and replace nums[i] with nums[i] - 1.
 * Return the minimum number of operations required to make the sum of the array divisible by k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,9,7], k = 5
 * <p>
 * Output: 4
 * <p>
 * Explanation:
 * <p>
 * Perform 4 operations on nums[1] = 9. Now, nums = [3, 5, 7].
 * The sum is 15, which is divisible by 5.
 * Example 2:
 * <p>
 * Input: nums = [4,1,3], k = 4
 * <p>
 * Output: 0
 * <p>
 * Explanation:
 * <p>
 * The sum is 8, which is already divisible by 4. Hence, no operations are needed.
 * Example 3:
 * <p>
 * Input: nums = [3,2], k = 6
 * <p>
 * Output: 5
 * <p>
 * Explanation:
 * <p>
 * Perform 3 operations on nums[0] = 3 and 2 operations on nums[1] = 2. Now, nums = [0, 0].
 * The sum is 0, which is divisible by 6.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * 1 <= nums[i] <= 1000
 * 1 <= k <= 100
 */
public class MinimumOperationsToMakeArraySumDivisibleByK {

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{3, 9, 7}, 5));
        System.out.println(minOperations(new int[]{4, 1, 3}, 4));
        System.out.println(minOperations(new int[]{3, 2}, 6));
    }

    public static int minOperations(int[] nums, int k) {
        int res = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0, j = 0; j < sum % k; ) {
            if (nums[i] > 0) {
                nums[i]--;
                sum--;
                res++;
            } else {
                i++;
            }
        }
        return res;
    }
}
