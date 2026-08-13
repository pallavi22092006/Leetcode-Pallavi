// Last updated: 8/13/2026, 11:31:48 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public void reorderList(ListNode head) {
13        if(head==null || head.next==null)
14            return;
15        ListNode slow=head;
16        ListNode fast=head;
17        // find middle
18        while(fast!=null && fast.next!=null){
19            slow=slow.next;
20            fast=fast.next.next;
21        } 
22        // reverse the second half
23        ListNode second =slow.next;
24        slow.next=null;
25        ListNode prev=null;
26        while(second!=null){
27            ListNode next=second.next;
28            second.next=prev;
29            prev=second;
30            second=next;
31        }
32        //merge the 2 
33        ListNode first=head;
34        second=prev;
35
36        while(second!=null){
37            ListNode temp1=first.next;
38            ListNode temp2=second.next;
39
40            first.next=second;
41            second.next=temp1;
42
43            first=temp1;
44            second=temp2;
45        }
46    }
47}