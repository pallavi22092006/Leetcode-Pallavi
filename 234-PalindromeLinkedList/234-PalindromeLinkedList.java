// Last updated: 8/13/2026, 11:32:23 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> l=new ArrayList<>();
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
        int i=0,j=l.size()-1;
        while(i<j){
            if(!l.get(i).equals(l.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}