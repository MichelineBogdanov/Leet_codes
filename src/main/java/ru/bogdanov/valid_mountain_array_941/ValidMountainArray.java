package ru.bogdanov.valid_mountain_array_941;

/**
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * Recall that arr is a mountain array if and only if:
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * Example 1:
 * Input: arr = [2,1]
 * Output: false
 * Example 2:
 * Input: arr = [3,5,5]
 * Output: false
 * Example 3:
 * Input: arr = [0,3,2,1]
 * Output: true
 * Constraints:
 * 1 <= arr.length <= 104
 * 0 <= arr[i] <= 104
 */
public class ValidMountainArray {

    public static void main(String[] args) {
        int[] arr = {0, 3, 2, 1, 5, 8};
        System.out.println(validMountainArray2(arr));

        int[] arr1 = {0, 3, 2};
        System.out.println(validMountainArray2(arr1));

        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(validMountainArray2(arr2));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3 || arr[0] > arr[1]) {
            return false;
        }
        boolean peak = false;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i + 1] < arr[i]) {
                peak = true;
            }
            if (peak && arr[i] < arr[i + 1] || arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return peak;
    }

    public static boolean validMountainArray2(int[] arr) {
        if (arr.length < 3 || arr[0] > arr[1]) {
            return false;
        }
        int i = 0;
        int j = arr.length - 1;

        while (i < j && arr[i] < arr[i + 1]) {
            i++;
        }
        while (j > 0 && arr[j] < arr[j - 1]) {
            j--;
        }
        return i == j && i < arr.length - 1 && j > 0;
    }

}
