class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int Coin = 0;
        int left = 0;
        int right = piles.length-1;
        while(left<right)
        {
            right--;
            Coin += piles[right];
            right--;
            left++;
        }
        return Coin; 
    }
}