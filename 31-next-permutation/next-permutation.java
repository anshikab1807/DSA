/*class Solution {
    public static void main(String[] args){
        int arr[] = {3,4,5,2,1};
        int s[] = new int[arr.length];
        int i = arr.length - 1;
        while(i>0){
            if(arr[i-1] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp; 
                sol(arr,i);              
                break;
            }
            else{
                i--;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    public static int[]sol(int arr[],int i){
    int j=arr.length-1;
     int k = j-i + 1;
        while(i<k) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
  }
}
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n = 34521;
		String s = Integer.toString(n);
		int[] arr = new int[s.length()];
		for(int i = arr.length-1;i>=0;i--){
		    arr[i]=n%10;
		    n/=10;
		}
		int cnt =0;
		int t=0;
	    //System.out.print(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++){
		    for(int j=i+1;j<arr.length;j++){
		        if(i==0){
		        if(arr[i]>arr[j]){
		            arr[i]=arr[i];
		            if(cnt<1){
		            cnt++;
		            }
		        }
		        }
		        else if(i>0){
		            if(cnt<2){
		            if(arr[i]<arr[j]){
		            cnt++;
		            int temp = arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		            t=j;
		            }
		            }
		        }
		      //  else {  //      t=i;
		      //      break;
		      //  }
		          //  if(cnt>=2){
		          //  int temp = arr[i];
		          //  arr[i]=arr[j];
		          //  arr[j]=temp;
		          //  cnt++;
		          //  }
		          
		    }
		}
		System.out.print(Arrays.toString(rev(arr,t)));
		 
		//System.out.print(Arrays.toString(arr1));
	}
	public static int[] rev(int[]arr,int t){
	    for(int j=t;j<arr.length-1;j++){
	        for(int k=j+1;k<arr.length;k++){
	            int temp = arr[j];
	            arr[j]=arr[k];
	            arr[k]=temp;
	        }
	    }
	    return arr  ;
    }}*/
    class Solution {
    public void nextPermutation(int[] nums) {
        int ind1=-1;
        int ind2=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        if(ind1==-1){
            reverse(nums,0);
        }
        else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
            }
            swap(nums,ind1,ind2);
            reverse(nums,ind1+1);
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}