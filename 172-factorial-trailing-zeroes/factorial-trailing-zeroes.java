class Solution {
    public int trailingZeroes(int n) {
    int d=0;
    while(n>0) {
        n/=5;
        d+=n;
    }
    return d;
}}