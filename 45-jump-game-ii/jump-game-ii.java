class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int end=0;
        int currentjump=0;
        for(int i=0;i<nums.length-1;i++){
        currentjump = Math.max(currentjump, i+nums[i]);
        if(i==end){
            jump++;
            end=currentjump;
        }
        }
        return jump;
    }}
