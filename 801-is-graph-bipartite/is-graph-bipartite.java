class Solution {
    public boolean isBipartite(int[][] graph) {
       int n=graph.length;
       int [] c=new int[n];
       Arrays.fill(c,-1);
       for(int i=0;i<n;i++){
        if(c[i]==-1){
            if(!bfs(i,graph,c)) return false;
        }
       }
       return true;
    }
    public static boolean bfs(int s,int[][] graph,int[] c){
        Queue<Integer> q=new LinkedList<>();
        c[s]=0;
        q.offer(s);
        while(!q.isEmpty()){
            int node=q.poll();
            for(int ne:graph[node]){
                if(c[ne]==-1){
                    c[ne]=1-c[node];
                    q.offer(ne);
                }
                else if(c[ne]==c[node]) return false;
            }}
            return true;
    }}