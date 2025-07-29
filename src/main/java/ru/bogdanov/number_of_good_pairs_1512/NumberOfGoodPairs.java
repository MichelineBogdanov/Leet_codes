package ru.bogdanov.number_of_good_pairs_1512;

import java.util.Arrays;

public class NumberOfGoodPairs {

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        System.out.println(numIdenticalPairs(new int[]{1, 1, 1, 1}));
        System.out.println(numIdenticalPairs(new int[]{1, 2, 3}));

        System.out.println(numIdenticalPairs(new int[]{6, 5, 1, 5, 7, 7, 9, 1, 5, 7, 1, 6, 10, 9, 7, 4, 1, 8, 7, 1, 1, 8,
                6, 4, 7, 4, 10, 5, 3, 9, 10, 1, 9, 5, 5, 4, 1, 7, 4, 2, 9, 2, 6, 6, 4, 2, 10, 3, 5, 3, 6, 4, 7, 4, 6, 4,
                4, 6, 3, 4, 10, 1, 10, 6, 10, 4, 9, 6, 6, 4, 8, 6, 9, 5, 4}));

        System.out.println(numIdenticalPairs(new int[]{2, 2, 1, 5, 1, 5, 5, 2, 3, 1, 1, 5, 3, 2, 3, 3, 3, 1, 3, 3, 4, 3,
                1, 3, 1, 4, 5, 5, 2, 2, 1, 3, 5, 2, 2, 4, 3, 2, 5, 3, 1, 1, 3, 3, 2, 5, 2, 1, 2, 4, 3, 4, 4, 3, 2, 4, 4,
                1, 3, 3, 3, 5, 5, 5, 4, 1, 1, 2, 3, 3, 2, 5, 3, 4, 5, 3, 1, 2, 5, 4, 5, 2, 3, 3, 1, 5, 2, 4, 2, 4, 4, 3,
                1, 3}));
    }

    public static int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int countEq = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                countEq++;
            } else {
                res += (countEq * (countEq - 1) / 2);
                countEq = 1;
            }
        }
        return res + (countEq * (countEq - 1) / 2);
    }
}
