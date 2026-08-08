class Solution {

    public boolean hasCycle;

    private void DFS(Map<Integer, List<Integer>> adj, int u, boolean[] visited, Stack<Integer> st,
            boolean[] inRecursion) {
        visited[u] = true;
        inRecursion[u] = true;

        List<Integer> neighbours = adj.get(u);
        if (neighbours != null) {
            for (int v : neighbours) {
                if (inRecursion[v]) {
                    hasCycle = true;
                    return;
                }
                if (!visited[v]) {
                    DFS(adj, v, visited, st, inRecursion);
                }
            }
        }
        st.push(u);
        inRecursion[u] = false;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adj = new HashMap<>();

        boolean[] inRecursion = new boolean[numCourses];
        boolean[] visited = new boolean[numCourses];

        hasCycle = false;

        for (int[] vec : prerequisites) {
            int a = vec[0];
            int b = vec[1];

            adj.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                DFS(adj, i, visited, st, inRecursion);
            }
        }

        if (hasCycle) {
            return new int[0];
        }

        int[] result = new int[numCourses];
        int idx = 0;

        while (!st.isEmpty()) {
            result[idx++] = st.pop();
        }

        return result;
    }
}