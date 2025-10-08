package ru.bogdanov.find_center_of_star_graph_1791;

/**
 * There is an undirected star graph consisting of n nodes labeled from 1 to n.
 * A star graph is a graph where there is one center node and exactly n - 1 edges
 * that connect the center node with every other node.
 * You are given a 2D integer array edges where each edges[i] = [ui, vi]
 * indicates that there is an edge between the nodes ui and vi. Return the center of the given star graph.
 * <p>
 * Example 1:
 * <p>
 * Input: edges = [[1,2],[2,3],[4,2]]
 * <p>
 * Output: 2
 * <p>
 * Explanation: As shown in the figure above, node 2 is connected to every other node, so 2 is the center.
 * <p>
 * Example 2:
 * <p>
 * Input: edges = [[1,2],[5,1],[1,3],[1,4]]
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * 3 <= n <= 105
 * <p>
 * edges.length == n - 1
 * <p>
 * edges[i].length == 2
 * <p>
 * 1 <= ui, vi <= n
 * <p>
 * ui != vi
 * <p>
 * The given edges represent a valid star graph.
 */
public class FindCenterOfStarGraph {

    public int findCenter(int[][] edges) {
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        } else {
            return edges[0][1];
        }
    }

}
