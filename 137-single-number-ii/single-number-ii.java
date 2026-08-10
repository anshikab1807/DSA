import java.util.Arrays;
class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length<2)
            return nums[0];
        Arrays.sort(nums);
        int ans=-1;
        if(nums[0]!=nums[1])
        ans=nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2])
            ans=nums[nums.length-1];
        for(int i=1;i<nums.length-1;i++) {
            if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1])
                ans=nums[i];
        }
        return ans;
    }
}