class Solution {
    public int totalSteps(int[] nums) {
        int n=nums.length;
        int ans=0;
        Stack<Integer> st=new Stack<>();
        int [] dp=new int[n];
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
        while(!st.isEmpty() && nums[i]>nums[st.peek()]){
            dp[i]=Math.max(dp[i]+1,dp[st.peek()]);
            st.pop();
        }
        ans=Math.max(ans,dp[i]);
        st.push(i);
    }
    return ans;
}
}