package ru.bogdanov.find_if_digit_game_can_be_won_3232;

/**
 * You are given an array of positive integers nums.
 * Alice and Bob are playing a game. In the game, Alice can choose either all single-digit
 * numbers or all double-digit numbers from nums, and the rest of the numbers are given to Bob.
 * Alice wins if the sum of her numbers is strictly greater than the sum of Bob's numbers.
 * Return true if Alice can win this game, otherwise, return false.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4,10]
 * <p>
 * Output: false
 * <p>
 * Explanation:
 * <p>
 * Alice cannot win by choosing either single-digit or double-digit numbers.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4,5,14]
 * <p>
 * Output: true
 * <p>
 * Explanation:
 * <p>
 * Alice can win by choosing single-digit numbers which have a sum equal to 15.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [5,5,5,25]
 * <p>
 * Output: true
 * <p>
 * Explanation:
 * <p>
 * Alice can win by choosing double-digit numbers which have a sum equal to 25.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * <p>
 * 1 <= nums[i] <= 99
 */
public class FindIfDigitGameCanBeWon {

    public boolean canAliceWin(int[] nums) {
        int first = 0;
        int second = 0;
        for (int num : nums) {
            if (num < 10) {
                first += num;
            } else {
                second += num;
            }
        }
        return first != second;
    }

}
