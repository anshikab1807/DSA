import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] ans=new int[n+m];
        for(int i=0;i<n;i++) {
            ans[i]=nums1[i];
        }
        for(int j=0;j<m;j++) {
            ans[n+j]=nums2[j];
        }
        Arrays.sort(ans);
        int len=n+m;
        if (len%2==1) {
            return ans[len/2];
        } else {
            return(ans[len/2-1]+ans[len/2])/2.0;
        }
    }
}