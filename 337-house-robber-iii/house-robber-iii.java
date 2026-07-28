// class Solution {
//     public int rob(TreeNode root) {
//         return sol(root,true);
//     }
//     public int sol(TreeNode root,boolean flag) {
//         if(root==null)
//             return 0;
//         if(flag){
//             int inc=root.val+sol(root.left,false)+sol(root.right,false);
//             int ex=sol(root.left,true)+sol(root.right,true);
//             return Math.max(inc,ex);
//         }
//         return sol(root.left,true)+sol(root.right,true);
//     }
// }
class Solution {
    public int rob(TreeNode root) {
        int dp[]=sol(root);
        return Math.max(dp[0],dp[1]);
    }
    public int[] sol(TreeNode root){
        if(root==null){
            return new int[2];
        } 
        int left[]=sol(root.left);
        int right[]=sol(root.right);
        int dp[]=new int[2];
        dp[0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        dp[1]=root.val+left[0]+right[0];
        return dp;
    }
}