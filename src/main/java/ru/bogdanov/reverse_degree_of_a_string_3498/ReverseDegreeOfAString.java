package ru.bogdanov.reverse_degree_of_a_string_3498;

import java.util.stream.IntStream;

public class ReverseDegreeOfAString {

    public static void main(String[] args) {
        System.out.println(reverseDegree("abc"));
        System.out.println(reverseDegree("zaza"));
    }

    public static int reverseDegree(String s) {
        return IntStream.range(1, s.length() + 1)
                .map(operand -> operand * (26 - (s.charAt(operand - 1) - 'a')))
                .sum();
    }

    public static int reverseDegree2(String s) {
        int sum = 0;
        int bound = s.length() + 1;
        for (int operand = 1; operand < bound; operand++) {
            int i = operand * (26 - (s.charAt(operand - 1) - 'a'));
            sum += i;
        }
        return sum;
    }

}
