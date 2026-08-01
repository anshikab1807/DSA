class Solution {
    public boolean predictTheWinner(int[] nums) {
        return sol(nums,0,nums.length-1)>=0;
    }
    private int sol(int[] nums,int i,int j) {
        if(i==j) 
            return nums[i];
        int l=nums[i]-sol(nums,i+1,j);
        int r=nums[j]-sol(nums,i,j-1);
        return Math.max(l,r);
    }
}