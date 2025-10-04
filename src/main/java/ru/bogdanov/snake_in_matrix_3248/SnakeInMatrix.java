package ru.bogdanov.snake_in_matrix_3248;

import java.util.List;

/**
 * There is a snake in an n x n matrix grid and can move in four possible directions.
 * Each cell in the grid is identified by the position: grid[i][j] = (i * n) + j.
 * The snake starts at cell 0 and follows a sequence of commands.
 * You are given an integer n representing the size of the grid and an array of strings
 * commands where each command[i] is either "UP", "RIGHT", "DOWN", and "LEFT".
 * It's guaranteed that the snake will remain within the grid boundaries throughout its movement.
 * Return the position of the final cell where the snake ends up after executing commands.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 2, commands = ["RIGHT","DOWN"]
 * <p>
 * Output: 3
 * <p>
 * Example 2:
 * <p>
 * Input: n = 3, commands = ["DOWN","RIGHT","UP"]
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * 2 <= n <= 10
 * <p>
 * 1 <= commands.length <= 100
 * <p>
 * commands consists only of "UP", "RIGHT", "DOWN", and "LEFT".
 * <p>
 * The input is generated such the snake will not move outside of the boundaries.
 */
public class SnakeInMatrix {

    public int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0;
        int y = 0;
        for (String command : commands) {
            switch (command) {
                case "UP" -> y--;
                case "RIGHT" -> x++;
                case "DOWN" -> y++;
                case "LEFT" -> x--;
            }
        }
        return y * n + x;
    }

}
