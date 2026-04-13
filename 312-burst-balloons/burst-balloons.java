class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+2];
        dp[0]=1;
        dp[n+1]=1; 
        int[][] dp1=new int[n+2][n+2];
        for (int i=0;i<n;i++) 
        dp[i+1]=nums[i];
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=n;j++){
                if(i>j) continue;
                int max=Integer.MIN_VALUE;
            for(int k=i;k<=j;k++){
                int cost=dp[i-1]*dp[k]*dp[j+1]+dp1[i][k-1]+dp1[k+1][j];
                    max=Math.max(max,cost);
                }
                 dp1[i][j]=max;
            }
        }
        return dp1[1][n];
    }}
