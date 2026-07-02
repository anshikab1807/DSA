class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for (int c=1;c<=n;++c) {
            if(c==sol(nums,n,c)) {
                return c;
            }
        }
        return -1;
    }
    private int sol(int[] nums,int n,int cur) {
        int l=0,r=n-1;
        int f=n;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]>=cur){
                f=m;
                r=m-1;
            }else{
            l=m+1;
            }
        }
        return n-f;
    }
}