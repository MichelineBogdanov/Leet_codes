package ru.bogdanov.number_of_steps_to_reduce_a_number_to_zero_1342;

/**
 * Given an integer num, return the number of steps to reduce it to zero.
 * In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 * <p>
 * Example 1:
 * <p>
 * Input: num = 14
 * <p>
 * Output: 6
 * <p>
 * Explanation:
 * <p>
 * Step 1) 14 is even; divide by 2 and obtain 7.
 * <p>
 * Step 2) 7 is odd; subtract 1 and obtain 6.
 * <p>
 * Step 3) 6 is even; divide by 2 and obtain 3.
 * <p>
 * Step 4) 3 is odd; subtract 1 and obtain 2.
 * <p>
 * Step 5) 2 is even; divide by 2 and obtain 1.
 * <p>
 * Step 6) 1 is odd; subtract 1 and obtain 0.
 * <p>
 * Example 2:
 * <p>
 * Input: num = 8
 * <p>
 * Output: 4
 * <p>
 * Explanation:
 * <p>
 * Step 1) 8 is even; divide by 2 and obtain 4.
 * <p>
 * Step 2) 4 is even; divide by 2 and obtain 2.
 * <p>
 * Step 3) 2 is even; divide by 2 and obtain 1.
 * <p>
 * Step 4) 1 is odd; subtract 1 and obtain 0.
 * <p>
 * Example 3:
 * <p>
 * Input: num = 123
 * <p>
 * Output: 12
 */
public class NumberOfStepsToReduceANumberToZero {

    public static void main(String[] args) {

    }

    public static int numberOfSteps(int num) {
        int res = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            res++;
        }
        return res;
    }

}
