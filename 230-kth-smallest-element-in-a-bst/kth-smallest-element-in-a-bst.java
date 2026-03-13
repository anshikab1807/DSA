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
class Solution {
    int count = 0;
    TreeNode ans=null;
    public int kthSmallest(TreeNode root,int k) {
        sol(root,k);
        return ans.val;
    }
    private void sol(TreeNode node, int k) {
        if (node==null) return;
        sol(node.left,k); count++;                
        if (count==k) {
           ans=node;
            return;
        }
    sol(node.right,k);
}}