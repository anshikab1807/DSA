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
    int count=0;
    int max=0;
    Integer prev = null;
    List<Integer> result = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] ans = new int[result.size()];
        for (int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (prev==null||root.val!=prev) {
            count=1;
        }else{
            count++;
        }
        if(count>max) {
            max=count;
            result.clear();
            result.add(root.val);
        } else if (count==max){
            result.add(root.val);
        }
        prev=root.val;
        inorder(root.right);
    }
}