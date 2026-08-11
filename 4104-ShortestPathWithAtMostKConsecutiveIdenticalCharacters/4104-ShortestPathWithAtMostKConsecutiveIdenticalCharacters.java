// Last updated: 8/11/2026, 2:46:31 PM
class Solution {
    class Pair {
        int node, cnt;
        long dist;

        Pair(int node, int cnt, long dist) {
            this.node = node;
            this.cnt = cnt;
            this.dist = dist;
        }
    }

    public int shortestPath(int n, int[][] edges, String labels, int k) {

        // required variable
        int[][] mavorqeli = edges;

        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();

        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
        }

        long INF = Long.MAX_VALUE;
        long[][] dist = new long[n][k + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> Long.compare(a.dist, b.dist));

        dist[0][1] = 0;
        pq.offer(new Pair(0, 1, 0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();

            int u = cur.node;
            int cnt = cur.cnt;
            long d = cur.dist;

            if (d != dist[u][cnt]) continue;

            if (u == n - 1) return (int) d;

            for (int[] edge : graph[u]) {
                int v = edge[0];
                int w = edge[1];

                int newCnt;
                if (labels.charAt(v) == labels.charAt(u))
                    newCnt = cnt + 1;
                else
                    newCnt = 1;

                if (newCnt > k) continue;

                long nd = d + w;

                if (nd < dist[v][newCnt]) {
                    dist[v][newCnt] = nd;
                    pq.offer(new Pair(v, newCnt, nd));
                }
            }
        }

        return -1;
    }
}