class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.contains(nums[i]) == false) {
                hm.add(nums[i]);
            } else {
                return nums[i];
            }
        }
        return -1;
    }
}