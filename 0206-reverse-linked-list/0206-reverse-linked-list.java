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
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode dummy = new ListNode(-1);
        helper(head,dummy).next=null;
        return dummy.next;
    }
    public ListNode helper(ListNode head, ListNode dummy){
        if(head.next==null){dummy.next=head;return head;}
        helper(head.next,dummy).next=head;
        return head;
    }
}