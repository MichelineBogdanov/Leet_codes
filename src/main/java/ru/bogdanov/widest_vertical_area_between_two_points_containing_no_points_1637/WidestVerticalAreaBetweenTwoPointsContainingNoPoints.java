package ru.bogdanov.widest_vertical_area_between_two_points_containing_no_points_1637;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given n points on a 2D plane where points[i] = [xi, yi], Return the widest vertical area between two points
 * such that no points are inside the area.
 * A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height).
 * The widest vertical area is the one with the maximum width.
 * Note that points on the edge of a vertical area are not considered included in the area.
 * <p>
 * Example 1:
 * <p>
 * Input: points = [[8,7],[9,9],[7,4],[9,7]]
 * <p>
 * Output: 1
 * <p>
 * Explanation: Both the red and the blue area are optimal.
 * <p>
 * Example 2:
 * <p>
 * Input: points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
 * <p>
 * Output: 3
 * <p>
 * Constraints:
 * <p>
 * n == points.length
 * <p>
 * 2 <= n <= 105
 * <p>
 * points[i].length == 2
 * <p>
 * 0 <= xi, yi <= 109
 */
public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {

    public int maxWidthOfVerticalArea(int[][] points) {
        int res = 0;
        List<int[]> toSort = new ArrayList<>(Arrays.asList(points));
        toSort.sort(Comparator.comparingInt(o -> o[0]));
        List<Integer> yDots = new ArrayList<>();
        for (int[] ints : toSort) {
            Integer anInt = ints[0];
            yDots.add(anInt);
        }
        for (int i = 1; i < yDots.size(); i++) {
            res = Math.max(res, yDots.get(i) - yDots.get(i - 1));
        }
        return res;
    }

    public int maxWidthOfVerticalArea2(int[][] points) {
        int res = 0;
        int[] yDots = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            yDots[i] = points[i][0];
        }
        Arrays.sort(yDots);
        for (int i = 1; i < yDots.length; i++) {
            res = Math.max(res, yDots[i] - yDots[i - 1]);
        }
        return res;
    }

}
