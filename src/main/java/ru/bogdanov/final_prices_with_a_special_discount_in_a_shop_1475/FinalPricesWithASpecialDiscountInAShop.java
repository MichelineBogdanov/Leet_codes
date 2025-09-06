package ru.bogdanov.final_prices_with_a_special_discount_in_a_shop_1475;

import java.util.Arrays;

/**
 * You are given an integer array prices where prices[i] is the price of the ith item in a shop.
 * There is a special discount for items in the shop. If you buy the ith item, then you will receive a
 * discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i].
 * Otherwise, you will not receive any discount at all.
 * Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop,
 * considering the special discount.
 * <p>
 * Example 1:
 * <p>
 * Input: prices = [8,4,6,2,3]
 * <p>
 * Output: [4,2,4,2,3]
 * <p>
 * Explanation:
 * <p>
 * For item 0 with price[0]=8 you will receive a discount equivalent to prices[1]=4, therefore, the final price you will pay is 8 - 4 = 4.
 * <p>
 * For item 1 with price[1]=4 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 4 - 2 = 2.
 * <p>
 * For item 2 with price[2]=6 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 6 - 2 = 4.
 * <p>
 * For items 3 and 4 you will not receive any discount at all.
 * <p>
 * Example 2:
 * <p>
 * Input: prices = [1,2,3,4,5]
 * <p>
 * Output: [1,2,3,4,5]
 * <p>
 * Explanation: In this case, for all items, you will not receive any discount at all.
 * <p>
 * Example 3:
 * <p>
 * Input: prices = [10,1,1,6]
 * <p>
 * Output: [9,0,1,6]
 * <p>
 * Constraints:
 * <p>
 * 1 <= prices.length <= 500
 * <p>
 * 1 <= prices[i] <= 1000
 */
public class FinalPricesWithASpecialDiscountInAShop {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(finalPrices(new int[]{8, 4, 6, 2, 3})));
        System.out.println(Arrays.toString(finalPrices(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(finalPrices(new int[]{10, 1, 1, 6})));
    }

    public static int[] finalPrices(int[] prices) {
        int length = prices.length;
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            int next = i + 1;
            while (next < length && prices[next] > prices[i]) {
                next++;
            }
            res[i] = next == length ? prices[i] : prices[i] - prices[next];
        }
        return res;
    }

}
