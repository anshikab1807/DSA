class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);  
        while(low<high){
            int mid=low+(high-low)/2;
            if(time(mid,piles,h)){
                high=mid;
            }
            else
                low=mid+1;
        }
        return low;
    }
    public boolean time(int max,int[] piles,int h){
        int hours=0;
        for(int i:piles){
            int time=i/max;
            hours+=time;
            if(i%max!=0)
             hours++;
        }  
     if(hours<=h){
        return true;
     }
     return false;
    }
    public int max(int[] piles){
        int max= 0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        return max;
    }
}