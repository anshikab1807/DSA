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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder=new ArrayList<>();
        inorderTraversal(root,inorder);
        return sol(inorder,0,inorder.size()-1);
    }
    private void inorderTraversal(TreeNode root, List<Integer> list){
        if(root == null) return;
        inorderTraversal(root.left,list);
        list.add(root.val);
        inorderTraversal(root.right,list);
    }
    private TreeNode sol(List<Integer> list, int left, int right){
        if(left>right) return null;
        int mid=left+(right-left)/2;
        TreeNode node=new TreeNode(list.get(mid));
        node.left=sol(list,left,mid-1);
        node.right=sol(list,mid+1,right);
        return node;
    }
}