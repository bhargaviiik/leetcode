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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        ListNode dummy=head;
        int len=0;
        while(dummy.next!=null){
            dummy=dummy.next;
            len++;
        }
        len++;
        k=k%len;
        dummy.next=head;
        dummy=head;
        for(int i=0;i<len-k-1;i++){
            dummy=dummy.next;
        }
        ListNode ans=dummy.next;
        dummy.next=null;
        return ans;
    }
}