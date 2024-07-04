package ru.bogdanov.duplicate_zeros_1081;

import java.util.Arrays;

/**
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * Note that elements beyond the length of the original array are not written.
 * Do the above modifications to the input array in place and do not return anything.
 * Example 1:
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2:
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 * Constraints:
 * 1 <= arr.length <= 104
 * 0 <= arr[i] <= 9
 */
public class DuplicateZeros {

    public static void main(String[] args) {
        //int[] arr = {8, 4, 5, 0, 1, 0, 0, 7};
        //duplicateZeros(arr);
        //System.out.println(Arrays.toString(arr));

        int[] arr1 = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {8, 0, 0, 2, 0, 0, 0};
        duplicateZeros(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void duplicateZeros(int[] arr) {
        int zeros = 0;
        for (int num : arr) {
            if (num == 0) {
                zeros++;
            }
        }
        if (zeros == 0) {
            return;
        }
        int predictLength = arr.length + zeros;
        for (int i = arr.length - 1, j = predictLength - 1; j > i; i--, j--) {
            if (arr[i] == 0) {
                if (j < arr.length) {
                    arr[j] = arr[i];
                }
                j--;
                if (j < arr.length) {
                    arr[j] = arr[i];
                }
            } else {
                if (j < arr.length) {
                    arr[j] = arr[i];
                }
            }
        }
    }

}
