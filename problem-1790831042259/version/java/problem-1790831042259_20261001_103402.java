// Last updated: 10/1/2026, 10:34:02 AM
1class Solution {
2    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
3        if (root == null)
4            return false;
5
6        if (sameTree(root, subRoot))
7            return true;
8
9        return isSubtree(root.left, subRoot) ||
10               isSubtree(root.right, subRoot);
11    }
12
13    boolean sameTree(TreeNode a, TreeNode b) {
14        if (a == null && b == null)
15            return true;
16
17        if (a == null || b == null)
18            return false;
19
20        if (a.val != b.val)
21            return false;
22
23        return sameTree(a.left, b.left) &&
24               sameTree(a.right, b.right);
25    }
26}