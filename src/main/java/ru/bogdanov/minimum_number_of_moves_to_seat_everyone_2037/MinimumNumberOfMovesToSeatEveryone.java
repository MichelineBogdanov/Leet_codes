package ru.bogdanov.minimum_number_of_moves_to_seat_everyone_2037;

import java.util.Arrays;

/**
 * There are n availabe seats and n students standing in a room. You are given an array seats of length n,
 * where seats[i] is the position of the ith seat. You are also given the array students of length n,
 * where students[j] is the position of the jth student.
 * You may perform the following move any number of times:
 * Increase or decrease the position of the ith student by 1 (i.e., moving the ith student from position x to x + 1 or x - 1)
 * Return the minimum number of moves required to move each student to a seat such that no two students are in the same seat.
 * <p>
 * Note that there may be multiple seats or students in the same position at the beginning.
 * <p>
 * Example 1:
 * <p>
 * Input: seats = [3,1,5], students = [2,7,4]
 * <p>
 * Output: 4
 * <p>
 * Explanation: The students are moved as follows:
 * <p>
 * - The first student is moved from position 2 to position 1 using 1 move.
 * <p>
 * - The second student is moved from position 7 to position 5 using 2 moves.
 * <p>
 * - The third student is moved from position 4 to position 3 using 1 move.
 * <p>
 * In total, 1 + 2 + 1 = 4 moves were used.
 * Example 2:
 * <p>
 * Input: seats = [4,1,5,9], students = [1,3,2,6]
 * <p>
 * Output: 7
 * <p>
 * Explanation: The students are moved as follows:
 * <p>
 * - The first student is not moved.
 * <p>
 * - The second student is moved from position 3 to position 4 using 1 move.
 * <p>
 * - The third student is moved from position 2 to position 5 using 3 moves.
 * <p>
 * - The fourth student is moved from position 6 to position 9 using 3 moves.
 * <p>
 * In total, 0 + 1 + 3 + 3 = 7 moves were used.
 * <p>
 * Example 3:
 * <p>
 * Input: seats = [2,2,6,6], students = [1,3,2,6]
 * <p>
 * Output: 4
 * <p>
 * Explanation: Note that there are two seats at position 2 and two seats at position 6.
 * <p>
 * The students are moved as follows:
 * <p>
 * - The first student is moved from position 1 to position 2 using 1 move.
 * <p>
 * - The second student is moved from position 3 to position 6 using 3 moves.
 * <p>
 * - The third student is not moved.
 * <p>
 * - The fourth student is not moved.
 * <p>
 * In total, 1 + 3 + 0 + 0 = 4 moves were used.
 * <p>
 * Constraints:
 * <p>
 * n == seats.length == students.length
 * <p>
 * 1 <= n <= 100
 * <p>
 * 1 <= seats[i], students[j] <= 100
 */
public class MinimumNumberOfMovesToSeatEveryone {

    public static void main(String[] args) {

    }

    public int minMovesToSeat(int[] seats, int[] students) {
        int res = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            res += (Math.abs(seats[i] - students[i]));
        }
        return res;
    }

}
