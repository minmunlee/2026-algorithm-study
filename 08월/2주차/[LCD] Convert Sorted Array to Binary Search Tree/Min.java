class Solution {
 public static class TreeNode {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return setTree(0, nums.length - 1, nums);
    }

    private static TreeNode setTree(int start, int end, int[] nums) {
        if(start > end) return null;
        
        int mid = (start + end) / 2;

        TreeNode node = new TreeNode(nums[mid]);
        node.left = setTree(start, mid - 1, nums);
        node.right = setTree(mid + 1, end, nums);

        return node;
    }
}