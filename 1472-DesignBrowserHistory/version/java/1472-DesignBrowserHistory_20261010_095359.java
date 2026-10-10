// Last updated: 10/10/2026, 9:53:59 AM
1
2class BrowserHistory {
3    class Node {
4        String url;
5        Node prev, next;
6
7        Node(String url) {
8            this.url = url;
9        }
10    }
11
12    Node current;
13
14    public BrowserHistory(String homepage) {
15        current = new Node(homepage);
16    }
17
18    public void visit(String url) {
19        Node newNode = new Node(url);
20        current.next = newNode;
21        newNode.prev = current;
22        current = newNode;
23    }
24
25    public String back(int steps) {
26        while (steps > 0 && current.prev != null) {
27            current = current.prev;
28            steps--;
29        }
30        return current.url;
31    }
32
33    public String forward(int steps) {
34        while (steps > 0 && current.next != null) {
35            current = current.next;
36            steps--;
37        }
38        return current.url;
39    }
40}
41
42/**
43 * Your BrowserHistory object will be instantiated and called as such:
44 * BrowserHistory obj = new BrowserHistory(homepage);
45 * obj.visit(url);
46 * String param_2 = obj.back(steps);
47 * String param_3 = obj.forward(steps);
48 */