package ru.bogdanov.climbing_stairs_70;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * ---
 * Example 1:
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * ---
 * Example 2:
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        ClimbingStairs stairs = new ClimbingStairs();
        System.out.println(stairs.climbStairs(1));
        System.out.println(stairs.climbStairs(2));
        System.out.println(stairs.climbStairs(3));
        System.out.println(stairs.climbStairs(4));
        System.out.println(stairs.climbStairs(5));
        System.out.println(stairs.climbStairs(6));
        System.out.println(stairs.climbStairs(7));
    }

    public int climbStairs(int n) {
        int prev = 0;
        int cur = 1;
        int rez = 0;
        for (int i = 0; i < n; i++) {
            rez = prev + cur;
            prev = cur;
            cur = rez;
        }
        return rez;
    }

}
