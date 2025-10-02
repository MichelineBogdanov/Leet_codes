package ru.bogdanov.earliest_time_to_finish_one_task_3683;

/**
 * You are given a 2D integer array tasks where tasks[i] = [si, ti].
 * Each [si, ti] in tasks represents a task with start time si that takes ti units of time to finish.
 * Return the earliest time at which at least one task is finished.
 * <p>
 * Example 1:
 * <p>
 * Input: tasks = [[1,6],[2,3]]
 * <p>
 * Output: 5
 * <p>
 * Explanation:
 * <p>
 * The first task starts at time t = 1 and finishes at time 1 + 6 = 7. The second task finishes at time 2 + 3 = 5. You can finish one task at time 5.
 * <p>
 * Example 2:
 * <p>
 * Input: tasks = [[100,100],[100,100],[100,100]]
 * <p>
 * Output: 200
 * <p>
 * Explanation:
 * <p>
 * All three tasks finish at time 100 + 100 = 200.
 * <p>
 * Constraints:
 * <p>
 * 1 <= tasks.length <= 100
 * <p>
 * tasks[i] = [si, ti]
 * <p>
 * 1 <= si, ti <= 100
 */
public class EarliestTimeToFinishOneTask {

    public int earliestTime(int[][] tasks) {
        int res = tasks[0][0] + tasks[0][1];
        for (int[] task : tasks) {
            res = Math.min(task[0] + task[1], res);
        }
        return res;
    }

}
