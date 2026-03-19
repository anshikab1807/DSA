// class Solution{
//     public int lengthOfLIS(int[] nums) {
//         return sol(nums,nums.length-1,-1);
//     }
//     private int sol(int[] nums,int i,int prev) {
//         if (i<0) return 0;
//         int nt=sol(nums,i-1,prev);
//         int t=0;
//         if (prev==-1||nums[i]<nums[prev])
//         t=1+sol(nums,i-1,i);
//         return Math.max(t,nt);
//         }
//     }
class Solution 
{
    public int lengthOfLIS(int[] nums) 
    {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i])
                    dp[i]=Math.max(dp[i],dp[j]+1);
            }
        }
        int max=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(max<dp[i])
            max=dp[i];
        }
        return max;
    }
}