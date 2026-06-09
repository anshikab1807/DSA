class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        int ans=0;
        int max=0;
        for (int i=0;i<arr1.length;i++) {
            count=0;   
         for (int j=0;j<arr2.length;j++) {  
                ans=Math.abs(arr1[i]-arr2[j]);
                if(ans > d) {
                    count++;
                }
            }
            if(count==arr2.length) {
                max++;
            }
        }
        return max;
    }
}