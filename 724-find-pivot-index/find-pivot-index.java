class Solution {
    public int pivotIndex(int[] nums) {
        int t=0;
        for (int num : nums) t+=num;
        int l=0; 
        for(int i=0;i<nums.length;i++) {
            int r=t-l-nums[i];
            if(l==r) return i; 
            l+=nums[i]; 
        }
        return -1; 
    }
}