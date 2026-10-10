// Last updated: 10/10/2026, 9:50:37 AM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node prev;
6    public Node next;
7    public Node child;
8};
9*/
10
11class Solution {
12    public Node flatten(Node head) {
13        if (head == null)
14            return null;
15
16        flattenList(head);
17        return head;
18    }
19
20    private Node flattenList(Node node) {
21        Node curr = node;
22        Node last = null;
23
24        while (curr != null) {
25            Node next = curr.next;
26
27            if (curr.child != null) {
28                Node child = curr.child;
29
30                Node childLast = flattenList(child);
31
32                curr.next = child;
33                child.prev = curr;
34
35                curr.child = null;
36
37                if (next != null) {
38                    childLast.next = next;
39                    next.prev = childLast;
40                }
41
42                last = childLast;
43            } else {
44                last = curr;
45            }
46
47            curr = next;
48        }
49
50        return last;
51    }
52}