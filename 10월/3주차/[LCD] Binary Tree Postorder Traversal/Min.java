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
    static List<Integer> list;
    public List<Integer> postorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        dfs(root);
        return list;
    }

    private static void dfs(TreeNode node) {
        if(node == null) return;
        dfs(node.left);
        dfs(node.right);
        list.add(node.val);
    }
}