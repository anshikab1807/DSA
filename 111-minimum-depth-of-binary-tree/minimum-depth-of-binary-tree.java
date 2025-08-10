class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)  return 0;
        int ld = minDepth(root.left);
        int rd = minDepth(root.right);
        if(root.left == null && root.right == null)
            return 1;
        if(root.left == null)
            return 1 + rd;
        if(root.right == null)
            return 1 + ld;
        return Math.min(ld,rd) + 1; 
    }
}