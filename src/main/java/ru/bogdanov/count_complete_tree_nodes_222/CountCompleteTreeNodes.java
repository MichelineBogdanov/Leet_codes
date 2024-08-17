package ru.bogdanov.count_complete_tree_nodes_222;

/**
 * Given the root of a complete binary tree, return the number of the nodes in the tree.
 * According to Wikipedia, every level, except possibly the last, is completely filled
 * in a complete binary tree, and all nodes in the last level are as far left as possible.
 * It can have between 1 and 2h nodes inclusive at the last level h.
 * Design an algorithm that runs in less than O(n) time complexity.
 * Example 1:
 * Input: root = [1,2,3,4,5,6]
 * Output: 6
 * Example 2:
 * Input: root = []
 * Output: 0
 * Example 3:
 * Input: root = [1]
 * Output: 1
 * Constraints:
 * The number of nodes in the tree is in the range [0, 5 * 104].
 * 0 <= Node.val <= 5 * 104
 * The tree is guaranteed to be complete.
 */
public class CountCompleteTreeNodes {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1,
                new TreeNode(2), null);
        System.out.println(countNodes(treeNode1));

        TreeNode treeNode2 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4), new TreeNode(5)),
                new TreeNode(3,
                        null, null));
        System.out.println(countNodes(treeNode2));

        TreeNode treeNode3 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4), new TreeNode(5)),
                new TreeNode(3,
                        new TreeNode(6), null));
        System.out.println(countNodes(treeNode3));

        TreeNode treeNode4 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(8), new TreeNode(9)),
                        new TreeNode(5,
                                new TreeNode(10), new TreeNode(11))),
                new TreeNode(3,
                        new TreeNode(6,
                                new TreeNode(12), new TreeNode(13)),
                        new TreeNode(7,
                                null, null)));
        System.out.println(countNodes(treeNode4));

        TreeNode treeNode5 = null;
        System.out.println(countNodes(treeNode5));

        TreeNode treeNode6 = new TreeNode(1, null, null);
        System.out.println(countNodes(treeNode6));

        TreeNode treeNode7 = new TreeNode(1,
                new TreeNode(2,
                        null, null),
                new TreeNode(3,
                        new TreeNode(6), new TreeNode(7)));
        System.out.println(countNodes(treeNode7));
    }

    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int hl = getHeight(root, true);
        int hr = getHeight(root, false);
        if (hl == hr) {
            return (1 << hl) - 1;
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    private static int getHeight(TreeNode root, boolean isLeft) {
        int count = 1;
        while (isLeft ? root.left != null : root.right != null) {
            count++;
            root = isLeft ? root.left : root.right;
        }
        return count;
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
