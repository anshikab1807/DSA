class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<List<Integer>> rev=new ArrayList<>();
        for(int i=0;i<n;i++) rev.add(new ArrayList<>());
        int[] out=new int[n];
        for(int i=0;i<n;i++) {
            out[i]=graph[i].length;
            for(int v:graph[i]) {
                rev.get(v).add(i);
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++) {
            if(out[i]==0) q.add(i);
        }
        boolean[] safe=new boolean[n];
        while (!q.isEmpty()) {
            int node=q.poll();
            safe[node]=true;
            for(int parent:rev.get(node)) {
                out[parent]--;
                if(out[parent]==0) {
                    q.add(parent);
                }
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int i=0;i<n;i++) {
            if(safe[i]) ans.add(i);
        }
        return ans;
    }
}