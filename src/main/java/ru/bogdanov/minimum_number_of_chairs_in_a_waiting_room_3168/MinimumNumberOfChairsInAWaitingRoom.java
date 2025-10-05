package ru.bogdanov.minimum_number_of_chairs_in_a_waiting_room_3168;

/**
 * You are given a string s. Simulate events at each second i:
 * <p>
 * If s[i] == 'E', a person enters the waiting room and takes one of the chairs in it.
 * If s[i] == 'L', a person leaves the waiting room, freeing up a chair.
 * Return the minimum number of chairs needed so that a chair is available for every person who enters the waiting room given that it is initially empty.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "EEEEEEE"
 * <p>
 * Output: 7
 * <p>
 * Explanation:
 * <p>
 * After each second, a person enters the waiting room and no person leaves it. Therefore, a minimum of 7 chairs is needed.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "ELELEEL"
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * <p>
 * Let's consider that there are 2 chairs in the waiting room. The table below shows the state of the waiting room at each second.
 * <p>
 * Second	Event	People in the Waiting Room	Available Chairs
 * <p>
 * 0	Enter	1	1
 * <p>
 * 1	Leave	0	2
 * <p>
 * 2	Enter	1	1
 * <p>
 * 3	Leave	0	2
 * <p>
 * 4	Enter	1	1
 * <p>
 * 5	Enter	2	0
 * <p>
 * 6	Leave	1	1
 * <p>
 * Example 3:
 * <p>
 * Input: s = "ELEELEELLL"
 * <p>
 * Output: 3
 * <p>
 * Explanation:
 * <p>
 * Let's consider that there are 3 chairs in the waiting room. The table below shows the state of the waiting room at each second.
 * <p>
 * Second	Event	People in the Waiting Room	Available Chairs
 * <p>
 * 0	Enter	1	2
 * <p>
 * 1	Leave	0	3
 * <p>
 * 2	Enter	1	2
 * <p>
 * 3	Enter	2	1
 * <p>
 * 4	Leave	1	2
 * <p>
 * 5	Enter	2	1
 * <p>
 * 6	Enter	3	0
 * <p>
 * 7	Leave	2	1
 * <p>
 * 8	Leave	1	2
 * <p>
 * 9	Leave	0	3
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 50
 * <p>
 * s consists only of the letters 'E' and 'L'.
 * <p>
 * s represents a valid sequence of entries and exits.
 */
public class MinimumNumberOfChairsInAWaitingRoom {

    public int minimumChairs(String s) {
        int res = 0;
        int temp = 0;
        for (char c : s.toCharArray()) {
            if (c == 'E') {
                temp++;
            } else if (c == 'L') {
                temp--;
            }
            res = Math.max(temp, res);
        }
        return res;
    }

}

