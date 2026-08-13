// Last updated: 8/13/2026, 11:36:24 AM
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0), large = new ListNode(0);
        ListNode s = small, l = large;
        while (head != null) {
            if (head.val < x) {
                s.next = head;
                s = s.next;
            } else {
                l.next = head;
                l = l.next;
            }
            head = head.next;
        }
        l.next = null;
        s.next = large.next;
        return small.next;
    }
}