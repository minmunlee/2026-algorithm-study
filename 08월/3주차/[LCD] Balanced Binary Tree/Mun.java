/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Mun {
    public boolean isBalanced(TreeNode root) {
        return findHeight(root) != -1;
    }

    private int findHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = findHeight(node.left);

        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = findHeight(node.right);

        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}