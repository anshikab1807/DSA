class Solution {
    int[][][] dp;
    int m,n;
    int maxK;
    public int dfs(int r,int c,int k,int[][] grid){
        if(k>maxK) return -10000000;
        if(r<0 || c<0) return -10000000;
        if (r == 0 && c == 0) {
            int cost = (grid[0][0] == 0) ? 0 : 1;
            if (k + cost > maxK) return -10000000;
            return grid[0][0];
        }

        if(dp[r][c][k]!=-2) return dp[r][c][k];        
        if(grid[r][c]==0){
            return dp[r][c][k] = Math.max(dfs(r-1,c,k,grid),dfs(r,c-1,k,grid));
        }
        return dp[r][c][k] = grid[r][c] + Math.max(dfs(r-1,c,k+1,grid),dfs(r,c-1,k+1,grid));
    }
    
    
    public int maxPathScore(int[][] grid, int k) {
        maxK = k;
        m = grid.length;
        n = grid[0].length;
        dp = new int[m][n][maxK+1];
        for(int[][] r:dp){
            for(int[] rr:r)Arrays.fill(rr,-2);
        }
        int ans = dfs(m-1,n-1,0,grid);
        return ans>=0?ans:-1;
    }
}