// Last updated: 8/13/2026, 11:28:57 AM
class Solution {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeight(root);
        return maxDiameter;
    }

    private int calculateHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Recursively find the height of left and right subtrees
        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        // Path passing through the current node has a length of leftHeight + rightHeight
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // Return the height of the current subtree to the parent call
        return Math.max(leftHeight, rightHeight) + 1;
    }
}