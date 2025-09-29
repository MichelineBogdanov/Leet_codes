package ru.bogdanov.sort_integers_by_the_number_of_1_bits_1356;

import java.util.Arrays;
import java.util.Comparator;

/**
 * You are given an integer array arr. Sort the integers in the array in ascending order by the number
 * of 1's in their binary representation and in case of two or more integers have the same number of
 * 1's you have to sort them in ascending order.
 * Return the array after sorting it.
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [0,1,2,3,4,5,6,7,8]
 * <p>
 * Output: [0,1,2,4,8,3,5,6,7]
 * <p>
 * Explantion: [0] is the only integer with 0 bits.
 * <p>
 * [1,2,4,8] all have 1 bit.
 * <p>
 * [3,5,6] have 2 bits.
 * <p>
 * [7] has 3 bits.
 * <p>
 * The sorted array by bits is [0,1,2,4,8,3,5,6,7]
 * <p>
 * Example 2:
 * <p>
 * Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
 * <p>
 * Output: [1,2,4,8,16,32,64,128,256,512,1024]
 * <p>
 * Explantion: All integers have 1 bit in the binary representation, you should just sort them in ascending order.
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 500
 * <p>
 * 0 <= arr[i] <= 104
 */
public class SortIntegersByTheNumberOf1Bits {

    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.comparingInt(Integer::bitCount).thenComparingInt(o -> o))
                .mapToInt(value -> value)
                .toArray();
    }

}
