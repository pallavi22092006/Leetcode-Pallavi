// Last updated: 10/6/2026, 10:33:05 AM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17}
18*/
19
20class Solution {
21    public List<Integer> postorder(Node root) {
22        List<Integer> result=new ArrayList<>();
23        if(root==null){
24            return result;
25        }
26        for(Node child:root.children)
27            result.addAll(postorder(child));
28        result.add(root.val);
29        return result;
30    }
31}