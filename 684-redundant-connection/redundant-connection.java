class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent=new int[edges.length+1];
        for(int i=1;i<=edges.length;i++) {
            parent[i]=i;
        }
        for(int[] edge : edges) {
            int u=edge[0];
            int v=edge[1];
            int pu=sol(parent, u);
            int pv=sol(parent, v);
            if(pu==pv) {
                return edge;
            }
            parent[pu]=pv;
        }
        return new int[]{};
    }
    private int sol(int[] parent, int x) {
        if(parent[x]!=x) {
            parent[x]=sol(parent,parent[x]);
        }
        return parent[x];
    }
}