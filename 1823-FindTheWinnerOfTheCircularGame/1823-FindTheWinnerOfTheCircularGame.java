// Last updated: 9/15/2026, 4:17:03 PM
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