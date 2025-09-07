package ru.bogdanov.find_the_peaks_2951;

import java.util.ArrayList;
import java.util.List;

public class FindThePeaks {

    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i + 1] && mountain[i] > mountain[i - 1]) {
                res.add(i);
            }
        }
        return res;
    }

}
