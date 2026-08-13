// Last updated: 8/13/2026, 11:21:19 AM
class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (q.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                q.add(q.poll());   // move front to back
            }

            q.poll();              // remove kth person
        }

        return q.peek();
    }
}