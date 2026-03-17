class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] p : prerequisites) {
            int a = p[0];
            int b = p[1];
            graph.get(b).add(a);
        }
        int[] state = new int[numCourses];
        for (int i = 0; i < state.length; i++) {
            if (state[i] == 0) {
                if (dfs(i, graph, state)) {
                    return false;
                }
            }

        }
        return true;
    }

    public static boolean dfs(int node, List<List<Integer>> graph, int[] state) {
        state[node] = 1;
        for (int nei : graph.get(node)) {
            if (state[nei] == 1)
                return true;
            if (state[nei] == 0) {
                if (dfs(nei, graph, state))
                    return true;
            }

        }
        state[node]=2;
        return false;
    }
}