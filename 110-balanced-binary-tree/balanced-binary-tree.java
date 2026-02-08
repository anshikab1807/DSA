class Solution {
    public boolean isBalanced(TreeNode root) {
    return sol(root) != -1;
    } private int sol(TreeNode node) {
        if(node==null) {
         return 0;
        }
        int leftHeight=sol(node.left);
        if(leftHeight==-1)
         return -1;
        int rightHeight=sol(node.right);
        if(rightHeight==-1) 
        return -1;
        if(Math.abs(leftHeight-rightHeight)>1)
         return -1;
        return Math.max(leftHeight,rightHeight)+1;
    }
}