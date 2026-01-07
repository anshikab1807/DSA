class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        // int[] dp = new int[nums.length];
        // dp[0]=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     int mul=1;
        //     for(int j=0;j<=i;j++){
        //         mul=mul*nums[i-j];
        //         dp[i]=Math.max(dp[i],mul);
        //     }
        // }
        // int max=0;
        // for(int i=0;i<dp.length;i++){
        //     if(dp[i]>max){
        //         max=dp[i];
        //     }
        // }
        // return max;

        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     int p=1;
        //     for(int j=i;j>=0;j--){
        //         p=p*nums[j];
        //         max=Math.max(max,p);
        //     }
        // }
        // return max;
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            int mul=1;
            for(int j=0;j<=i;j++){
                mul=mul*nums[i-j];
                max=Math.max(max,mul);
            }
        }
        return max;
    }
}