class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack <Integer> st=new Stack<>();
        int[]ans=new int[nums.length];
        for(int i=0;i<2*nums.length;i++){
           int index=i%nums.length;
            while(!st.isEmpty() && nums[st.peek()]<nums[index]){
                ans[st.pop()]=nums[index];
            }
            if(i<nums.length){
                st.push(index);
            }
        }
        while(!st.isEmpty()){
        ans[st.pop()]=-1;
        }
        return ans;
    }
}