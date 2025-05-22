/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Boolean flag=false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                flag=true;
                slow=head;
                break;
            }
            
        }
        if(flag==false){
            return null;
        }
        ListNode prev=null;
            while(fast!=slow){
                slow=slow.next;
                fast=fast.next;
            }
            return fast;
    }
}