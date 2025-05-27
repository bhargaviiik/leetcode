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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1); //dummy can be treated as our head variable of new list
        dummy.next=head;//list connected
        ListNode curr=dummy.next;
        ListNode prev=dummy;
        while(curr!=null){
            if(curr.val==val){
                prev.next=curr.next;
                curr=curr.next;
                //in case of node removal prev does not have to be incremented
            }
            else{
                curr=curr.next;
                prev=prev.next;
            }

        }
        return dummy.next;
    }
}