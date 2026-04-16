class TreeAncestor {
    int[][] dp;
    int LOG;
    public TreeAncestor(int n, int[] parent) {
        LOG = (int)(Math.log(n) / Math.log(2)) + 1;
        dp = new int[LOG][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = parent[i];
        }
        for (int i = 1; i < LOG; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i - 1][j] == -1) {
                    dp[i][j] = -1;
                } else {
                    dp[i][j] = dp[i - 1][dp[i - 1][j]];
                }
            }
        }
    }

    public int getKthAncestor(int node, int k) {
        for (int j = 0; j < LOG; j++) {
            if ((k & (1 << j)) != 0) {
                node = dp[j][node];
                if (node == -1) return -1;
            }
        }
        return node;
    }
}