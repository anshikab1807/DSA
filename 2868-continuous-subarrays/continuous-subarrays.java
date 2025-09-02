class Solution {
    public long continuousSubarrays(int[] nums) {
        long count = 0;
        int j = 0; 
        int min = nums[0], max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            while (max - min > 2) {
                j++;
                min = nums[j];
                max = nums[j];
                for (int k = j; k <= i; k++) {
                    min = Math.min(min, nums[k]);
                    max = Math.max(max, nums[k]);
                }
            }
            count += (i - j + 1);
        }

        return count;
    }
}