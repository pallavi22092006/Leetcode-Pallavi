// Last updated: 8/13/2026, 11:27:31 AM
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();
            double sum = 0;

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                sum += node.val;

                if (node.left != null)
                    q.offer(node.left);

                if (node.right != null)
                    q.offer(node.right);
            }

            ans.add(sum / size);
        }

        return ans;
    }
}