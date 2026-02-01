class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int MOD = 1_000_000_007;
        int[] sorted = nums1.clone();
        Arrays.sort(sorted);
        long sum=0;
        int mg=0;
        for (int i = 0; i<nums1.length; i++) {

            int diff = Math.abs(nums1[i] - nums2[i]);
            sum = (sum +diff) % MOD;

            int idx = Arrays.binarySearch(sorted, nums2[i]);
            if (idx < 0) idx = -idx - 1;

            if (idx < sorted.length) {
                mg = Math.max(
                    mg,
                    diff - Math.abs(sorted[idx] - nums2[i])
                );
            }
            if (idx > 0) {
                mg = Math.max(
                    mg,
                    diff - Math.abs(sorted[idx - 1] - nums2[i])
                );
            }
        }

        return (int)((sum - mg + MOD) % MOD);
    }
}
