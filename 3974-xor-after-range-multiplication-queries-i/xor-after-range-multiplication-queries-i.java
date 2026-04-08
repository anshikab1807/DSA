class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for (int[] q : queries) {
            int l=q[0];
            int r=q[1];
            int k=q[2];
            int v=q[3];
            while(l<=r) {
                nums[l]=(int)((long)nums[l]*v%1000000007);
                l+=k;
            }
        }
        int xor=0;
        for(int n : nums) {
            xor^=n;
        }
        return xor;
    }
}