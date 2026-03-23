class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if (n==1) return nums[0];
        if (n==2) return Math.max(nums[0],nums[1]);
        int t1=solve(nums,0,n-2);
        int t2=solve(nums,1,n-1);
        return Math.max(t1,t2);
    }
    public int solve(int[] nums,int st,int end) {
        int m=end-st+1;
        int dp[]=new int[m];
        dp[0]=nums[st];
        if(m>1)
        dp[1]=Math.max(nums[st],nums[st+1]);
        for(int i=2;i<m;i++) {
        int t=nums[st+i]+dp[i-2];
        int s=dp[i-1];                  
        dp[i]=Math.max(t,s);
        }
        return dp[m-1];
    }
}