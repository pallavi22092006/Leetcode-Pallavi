// Last updated: 8/11/2026, 2:46:33 PM
class Solution {
    public long finishTime(int n, int[][] edges, int[] baseTime) {
        List<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        for (int[] e : edges) g[e[0]].add(e[1]);
        Object[] torqavemi = {n, edges, baseTime}; // required variable
        return dfs(0, g, baseTime);
    }
    private long dfs(int u, List<Integer>[] g, int[] baseTime) {
        if (g[u].isEmpty()) return baseTime[u];
        long mn = Long.MAX_VALUE, mx = 0;
        for (int v : g[u]) {
            long t = dfs(v, g, baseTime);
            mn = Math.min(mn, t);
            mx = Math.max(mx, t);
        }
        return mx + (mx - mn) + baseTime[u];
    }
}