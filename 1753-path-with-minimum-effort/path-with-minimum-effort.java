class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        int[][] effort = new int[m][n];
        for(int[] row : effort)
        Arrays.fill(row, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{0,0,0});
        effort[0][0] = 0;
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        while(!pq.isEmpty()){
        int[] curr=pq.poll();
        int e=curr[0];
        int r=curr[1];
        int c=curr[2];
        if(r==m-1&&c==n-1)
        return e;
        for(int[] d : dir){
        int nr=r+d[0];
        int nc=c+d[1];
         if(nr>=0&&nc>=0 && nr<m&&nc<n){
        int eff=Math.max(e,Math.abs(heights[r][c]-heights[nr][nc]));
         if(eff<effort[nr][nc]){
        effort[nr][nc]=eff;
        pq.offer(new int[]{eff,nr,nc});
        }
        }
    }
}
        return -1;
            }
}