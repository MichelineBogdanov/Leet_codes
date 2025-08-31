package ru.bogdanov.calculate_money_in_leetcode_bank_1716;

public class CalculateMoneyInLeetcodeBank {

    public static void main(String[] args) {
        System.out.println(totalMoney(4));
        System.out.println(totalMoney(10));
        System.out.println(totalMoney(20));
    }

    public static int totalMoney(int n) {
        int sum = 0;
        int weeks = n / 7;
        int days = 0;
        for (int i = 0; i <= weeks; i++) {
            for (int j = i + 1; j <= 7 + i && days < n; j++) {
                sum += j;
                days++;
            }
        }
        return sum;
    }

}
