package ru.bogdanov.divisible_and_non_divisible_sums_difference_2894;

public class DivisibleAndNonDivisibleSumsDifference {

    public static void main(String[] args) {
        System.out.println(differenceOfSums(10, 3));
    }

    public static int differenceOfSums(int n, int m) {
        return ((n * (1 + n)) / 2) - 2 * ((((n - (n % m)) / m) * (m + (n - (n % m)))) / 2);
    }

}
