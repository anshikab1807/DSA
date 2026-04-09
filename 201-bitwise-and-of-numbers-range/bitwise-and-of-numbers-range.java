class Solution {
    int c=0;
    public int rangeBitwiseAnd(int left, int right) {
    //    int sum=left; 
    //      for(int i=left+1;i<=right;i++)
    //     {
    //          sum=sum & i;
    //     }
    //    return sum;
    while(left < right){
        left=left >> 1;
        right =right >> 1;
        c++;
        
    }
    return left<<c;
    }
}