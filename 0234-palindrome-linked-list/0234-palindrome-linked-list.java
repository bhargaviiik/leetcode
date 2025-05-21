/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode turtle = head, hare = head;
        //base cases
        if(head.next==null){
            return true;
        }
        //find midListNode:slow fast approach
        while (hare != null && hare.next != null) { //even=>null,odd=>null.next
            turtle = turtle.next;//+1
            hare = hare.next.next;//+2
        }
        ListNode prev = null;
        ListNode curr = turtle;
        ListNode succ;
        while (curr != null) {
            succ = curr.next;
            curr.next = prev;
            prev = curr; //end at curr so last ListNode stored at prev
            curr = succ;
        }
        while (prev != null) {
            if (head.val != prev.val) {
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
}