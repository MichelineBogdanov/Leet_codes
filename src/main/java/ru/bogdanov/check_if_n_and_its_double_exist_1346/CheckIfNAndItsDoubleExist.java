package ru.bogdanov.check_if_n_and_its_double_exist_1346;

import java.util.Arrays;

/**
 * Given an array arr of integers, check if there exist two indices i and j such that :
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 * Example 1:
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 * Example 2:
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: There is no i and j that satisfy the conditions.
 * Constraints:
 * 2 <= arr.length <= 500
 * -103 <= arr[i] <= 103
 */
public class CheckIfNAndItsDoubleExist {

    public static void main(String[] args) {
        int[] arr = {0, 0};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (Arrays.binarySearch(arr, i + 1, arr.length, 0) >= 0) {
                    return true;
                }
            } else {
                if (Arrays.binarySearch(arr, 2 * arr[i]) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

}
