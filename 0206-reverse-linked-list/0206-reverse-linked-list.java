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
        ListNode curr=head;
        ListNode prev=null;
        ListNode succ;

        while(curr!=null){
            succ=curr.next;
            curr.next=prev;
            prev=curr;
            curr=succ; //now curr variable will point to the succeding node
        }
        head=prev;
        return head;
        
    }
}