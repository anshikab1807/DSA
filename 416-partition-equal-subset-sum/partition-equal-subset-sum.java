class Solution {
public static boolean canPartition(int[] nums) {
int sum = 0;
for (int num : nums) sum += num;
if (sum % 2 != 0) return false;
int target = sum / 2;
boolean[] dp = new boolean[target + 1];
dp[0] = true;
for (int num : nums) {
for (int j = target; j >= num; j--) {
dp[j] = dp[j] || dp[j - num];
}
}
return dp[target];
}
public static void main(String[] args) {
int[] arr1 = {15, 5, 20, 10, 35, 15, 10};
System.out.println(canPartition(arr1)); // true
int[] arr2 = {15, 5, 20, 10, 35};
System.out.println(canPartition(arr2)); // false
}
}