class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sol(nums, 0, nums.length - 1); 
    }
    public TreeNode sol(int[] nums, int start, int end) {
        if (start > end) return null; 
        int mid = (start + end) / 2; 
        TreeNode root = new TreeNode(nums[mid]); 
        root.left =sol(nums, start, mid - 1);  
        root.right =sol(nums, mid + 1, end);  
        return root; 
    }
}