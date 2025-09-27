package ru.bogdanov.determine_color_of_a_chessboard_square_1812;

/**
 * You are given coordinates, a string that represents the coordinates of a square of the chessboard.
 * Below is a chessboard for your reference.
 * Return true if the square is white, and false if the square is black.
 * The coordinate will always represent a valid chessboard square. The coordinate will
 * always have the letter first, and the number second.
 * <p>
 * Example 1:
 * <p>
 * Input: coordinates = "a1"
 * <p>
 * Output: false
 * <p>
 * Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.
 * <p>
 * Example 2:
 * <p>
 * Input: coordinates = "h3"
 * <p>
 * Output: true
 * <p>
 * Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.
 * <p>
 * Example 3:
 * <p>
 * Input: coordinates = "c7"
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * coordinates.length == 2
 * <p>
 * 'a' <= coordinates[0] <= 'h'
 * <p>
 * '1' <= coordinates[1] <= '8'
 */
public class DetermineColorOfAChessboardSquare {

    public boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0) - 'a';
        int y = coordinates.charAt(1) - '0';
        return (x + y) % 2 == 0;
    }

}
