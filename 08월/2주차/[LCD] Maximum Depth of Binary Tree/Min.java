class Solution {
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
    public int maxDepth(TreeNode root) {
        answer = 0;
        dfs(root, 1);
        return answer;
        
    }

    private static void dfs(TreeNode node, int depth) {
        if(node == null) return;

        answer = Math.max(answer, depth);
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }
}