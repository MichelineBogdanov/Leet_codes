package ru.bogdanov.binary_tree_inorder_traversal_94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * Example 1:
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
 * Example 2:
 * Input: root = []
 * Output: []
 * Example 3:
 * Input: root = [1]
 * Output: [1]
 * Constraints:
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 */
public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {
        List<Integer> integers = inorderTraversal(new TreeNode(1, null, null));
        System.out.println(integers);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.add(root);
                root = root.left;
            } else {
                root = stack.pop();
                res.add(root.val);
                root = root.right;
            }
        }
        return res;
    }
}

//Definition for a binary tree node.
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
