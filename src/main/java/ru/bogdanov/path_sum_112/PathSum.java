package ru.bogdanov.path_sum_112;

import java.util.Stack;

/**
 * Given the root of a binary tree and an integer targetSum, return true
 * if the tree has a root-to-leaf path such that adding up all the values
 * along the path equals targetSum.
 * A leaf is a node with no children.
 * Example 1:
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * Output: true
 * Explanation: The root-to-leaf path with the target sum is shown.
 * Example 2:
 * Input: root = [1,2,3], targetSum = 5
 * Output: false
 * Explanation: There two root-to-leaf paths in the tree:
 * (1 --> 2): The sum is 3.
 * (1 --> 3): The sum is 4.
 * There is no root-to-leaf path with sum = 5.
 * Example 3:
 * Input: root = [], targetSum = 0
 * Output: false
 * Explanation: Since the tree is empty, there are no root-to-leaf paths.
 * Constraints:
 * The number of nodes in the tree is in the range [0, 5000].
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
 */
public class PathSum {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4, new TreeNode(1), null)));
        System.out.println(hasPathSum(treeNode1, 22));

        TreeNode treeNode2 = new TreeNode(1, new TreeNode(2), null);
        System.out.println(hasPathSum(treeNode2, 1));

        TreeNode treeNode3 = new TreeNode(9,
                new TreeNode(6),
                new TreeNode(-3,
                        new TreeNode(-6),
                        new TreeNode(2,
                                new TreeNode(2
                                        , new TreeNode(-6, new TreeNode(-6), null)
                                        , new TreeNode(-6))
                                , null)));
        System.out.println(hasPathSum(treeNode3, 4));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        int check = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode last = null;
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.add(root);
                check += root.val;
                root = root.left;
            } else {
                TreeNode peeked = stack.peek();
                if (peeked.right != null && last != peeked.right) {
                    root = peeked.right;
                } else {
                    if (targetSum == check) {
                        if (peeked.right == null && peeked.left == null) {
                            return true;
                        }
                    }
                    check -= peeked.val;
                    last = stack.pop();
                }
            }
        }
        return false;
    }

}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
