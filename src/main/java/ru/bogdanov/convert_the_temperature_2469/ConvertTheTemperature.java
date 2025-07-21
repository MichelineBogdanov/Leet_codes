package ru.bogdanov.convert_the_temperature_2469;

import java.util.Arrays;

public class ConvertTheTemperature {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.50)));
        System.out.println(Arrays.toString(convertTemperature(122.11)));
    }

    public static double[] convertTemperature(double celsius) {
        double[] doubles = new double[2];
        doubles[0] = celsius + 273.15000;
        doubles[1] = celsius * 1.80000 + 32.00000;
        return doubles;
    }

}
