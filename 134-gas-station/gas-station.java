class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tG=0,tC=0;
        for(int i=0;i<gas.length;i++) {
            tG+=gas[i];
            tC+=cost[i];
        }
        if(tG<tC){
            return -1;
        }
        int curr=0;
        int start=0;
        for(int i=0;i<gas.length;i++) {
            curr+=gas[i]-cost[i];
            if(curr<0) {
                curr=0;
                start=i+1;
            }
        }
        return start;        
    }
}