package ru.bogdanov.check_if_n_and_its_double_exist_1346;

import java.util.Arrays;

public class CheckIfNAndItsDoubleExist {

    public static void main(String[] args) {
        int[] arr = {0, 0};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (Arrays.binarySearch(arr, i + 1, arr.length, 0) >= 0){
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
