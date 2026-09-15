// Last updated: 9/15/2026, 4:25:11 PM
class Solution {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int left = Math.max(0, dfs(node.left));
        int right = Math.max(0, dfs(node.right));

        // Path passing through current node
        int current = node.val + left + right;

        maxSum = Math.max(maxSum, current);

        // Return one side to parent
        return node.val + Math.max(left, right);
    }
}