package ru.bogdanov.flipping_an_image_832;

/**
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * <p>
 * For example, inverting [0,1,1] results in [1,0,0].
 * <p>
 * Example 1:
 * <p>
 * Input: image = [[1,1,0],[1,0,1],[0,0,0]]
 * <p>
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * <p>
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * <p>
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * <p>
 * Example 2:
 * <p>
 * Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * <p>
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * <p>
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * <p>
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * <p>
 * Constraints:
 * <p>
 * n == image.length
 * <p>
 * n == image[i].length
 * <p>
 * 1 <= n <= 20
 * <p>
 * images[i][j] is either 0 or 1.
 */
public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                res[i][j] = image[i][image[i].length - 1 - j] == 0 ? 1 : 0;
            }
        }
        return res;
    }

}
