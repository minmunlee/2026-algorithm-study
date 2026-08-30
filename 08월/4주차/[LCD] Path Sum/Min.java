class Min {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, 0, targetSum);
    }

    private static boolean dfs(TreeNode root, int sum, int targetSum) {
        if(root == null) return false;

        sum += root.val;

        if(root.left == null && root.right == null) {
            return sum == targetSum;
        }

        boolean left = dfs(root.left, sum, targetSum);
        if(left) return true;

        boolean right = dfs(root.right, sum, targetSum);
        if(right) return right;

        return false;
    }
}