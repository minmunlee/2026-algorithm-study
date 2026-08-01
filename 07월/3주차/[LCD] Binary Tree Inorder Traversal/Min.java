import java.util.*;

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
    static List<Integer> answer;
    public List<Integer> inorderTraversal(TreeNode root) {
        answer = new ArrayList<>();
        dfs(root);
        return answer;
    }

    private static void dfs(TreeNode node) {
        if(node != null) {
            if(node.left != null) dfs(node.left);
            answer.add(node.val);
            if(node.right != null) dfs(node.right);
        }
    }
}