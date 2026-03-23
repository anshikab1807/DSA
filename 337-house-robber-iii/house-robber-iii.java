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
// class Solution{
//     public int rob(TreeNode root) {
//         if (root==null) return 0;
//         int ans=0;
//         if(root.left!=null) {
//         ans+=rob(root.left.left)+rob(root.left.right);
//         }
//         if(root.right!=null){
//             ans+=rob(root.right.left)+rob(root.right.right);
//         }
//         return Math.max(ans+root.val,rob(root.left)+rob(root.right));
//     }
// }
class Solution {
    public int rob(TreeNode root) {
        int dp[]=robHouse(root);
        return Math.max(dp[0],dp[1]);
    }
    public int[] robHouse(TreeNode root){
        if(root==null){
            return new int[2];
        } 
        int left[]=robHouse(root.left);
        int right[]=robHouse(root.right);
        int dp[] = new int[2];
        dp[0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        dp[1]=root.val+left[0]+right[0];
        return dp;
    }
}
