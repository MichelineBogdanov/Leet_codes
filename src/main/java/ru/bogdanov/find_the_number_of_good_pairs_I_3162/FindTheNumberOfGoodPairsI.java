package ru.bogdanov.find_the_number_of_good_pairs_I_3162;

/**
 * You are given 2 integer arrays nums1 and nums2 of lengths n and m respectively. You are also given a positive integer k.
 * A pair (i, j) is called good if nums1[i] is divisible by nums2[j] * k (0 <= i <= n - 1, 0 <= j <= m - 1).
 * Return the total number of good pairs.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,3,4], nums2 = [1,3,4], k = 1
 * <p>
 * Output: 5
 * <p>
 * Explanation:
 * <p>
 * The 5 good pairs are (0, 0), (1, 0), (1, 1), (2, 0), and (2, 2).
 * <p>
 * Example 2:
 * <p>
 * Input: nums1 = [1,2,4,12], nums2 = [2,4], k = 3
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * <p>
 * The 2 good pairs are (3, 0) and (3, 1).
 * <p>
 * Constraints:
 * <p>
 * 1 <= n, m <= 50
 * <p>
 * 1 <= nums1[i], nums2[j] <= 50
 * <p>
 * 1 <= k <= 50
 */
public class FindTheNumberOfGoodPairsI {

    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int res = 0;
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 % (num2 * k) == 0) {
                    res++;
                }
            }
        }
        return res;
    }

}
