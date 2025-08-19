// import java.util.Arrays;
class Solution {
//     public int countPairs(int[] nums, int target) {
    //     Arrays.sort(nums);
    //     int low = 0, high = nums.length - 1, pairs = 0;
    //     while (low < high) {
    //         if (nums[low] + nums[high] < target) {
    //             pairs += high - low;
    //             low++;
    //         } else {
    //             high--;
    //         }
    //     }
    //     return pairs;
    // // }
    // class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int pairs=0;
        for(int i=0; i<nums.size(); i++){
            for(int j= i+1; j<nums.size(); j++){  

            if(nums.get(i) + nums.get(j)< target){    
                pairs++;
            }
            }
        }
        return pairs;
    }
}