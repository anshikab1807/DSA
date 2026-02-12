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
// class Solution {
//     int d=0;
//     public int diameterOfBinaryTree(TreeNode root) {
//         height(root);
//         return d;
//     } public int height(TreeNode node){
//         if(node==null) return 0;
//         int left=height(node.left);
//         int right=height(node.right);
//         d=Math.max(d,left+right);
//         return 1+Math.max(left,right);
//     }
// }

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh= height(root.left);
        int rh= height(root.right);
        int d1=diameterOfBinaryTree(root.left);
        int d2=diameterOfBinaryTree(root.right);
        return Math.max((lh+rh),Math.max(d1,d2));
    }
    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
    return Math.max(height(node.left),height(node.right))+1;
    }
}