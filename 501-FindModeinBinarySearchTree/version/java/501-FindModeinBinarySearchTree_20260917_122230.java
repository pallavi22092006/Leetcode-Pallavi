// Last updated: 9/17/2026, 12:22:30 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    java.util.HashMap<Integer,Integer> map=new java.util.HashMap<>();
18    public int[] findMode(TreeNode root) {
19        countValues(root);
20        int max=0;
21        for(int count:map.values()){
22            max=Math.max(max,count);
23        }
24        java.util.ArrayList<Integer> result=new java.util.ArrayList<>();
25        for(int key:map.keySet()){
26            if(map.get(key)==max){
27                result.add(key);
28            }
29        }
30        int[] answer=new int[result.size()];
31        for(int i=0;i<result.size();i++){
32            answer[i]=result.get(i);
33        }
34        return answer;
35    }
36    private void countValues(TreeNode root){
37        if(root == null){
38            return;
39        }
40        map.put(root.val,map.getOrDefault(root.val,0)+1);
41        countValues(root.left);
42        countValues(root.right);
43    }
44}