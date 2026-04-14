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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode iter= head;
        ListNode start; //start of curr listNode being reversed
        ListNode last=new ListNode(-1);
        ListNode prev=null;
        int count=0;
        while(iter!=null){ //last Node
            start=iter;
            ListNode next;
            int i=0;
            while(iter!=null && i<k){
                next=iter.next;
                iter.next=prev;
                prev=iter;
                iter=next;
                i++;
            }
            if(i!=k){  //re-reverse the list 
                iter=prev; 
                next=null;
                while(next!=start){
                    prev=iter.next; 
                    iter.next=next; 
                    next=iter; 
                    iter=prev; 
                }
                break;
            }
            last.next=prev;
            count++;
            start.next=iter;
            if(count==1)head=prev;
            last=start;
        
        }
        return head;
    }
}