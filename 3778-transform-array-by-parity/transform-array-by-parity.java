class Solution {
    public int[] transformArray(int[] nums) {
        int[]result=new int[nums.length];
        int even=0;
        int odd=0;
        for(int i:nums){
            if(i%2==0) even++;
            else odd ++;
        }
        for(int i=0;i<even;i++){
            result[i]=0;

        }
        for(int i=even;i<nums.length;i++){
            result[i]=1;
        }
        return result;
    }
}