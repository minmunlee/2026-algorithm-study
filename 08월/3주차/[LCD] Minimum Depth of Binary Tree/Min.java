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
    static int answer;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        answer = 100001;
        dfs(1, root);
        return answer;
    }

    private static void dfs(int depth, TreeNode node) {
        if(node == null) return;
        if(node.left == null && node.right == null) {
            answer = Math.min(answer, depth);
            return;
        }

        dfs(depth + 1, node.left);
        dfs(depth + 1, node.right);
    }

}
