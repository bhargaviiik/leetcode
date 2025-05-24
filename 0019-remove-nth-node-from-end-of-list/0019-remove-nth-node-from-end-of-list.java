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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i=0;
        if(head.next==null){
            head=null;
            return head;
        }
        ListNode temp=head;//traverse through head
        while(temp!=null){
            i++; //1 based size
            temp=temp.next;
        }
        if(n==i){
            return head.next;
        }
        int node=i-n-1; //2
        int c=0;
        temp=head;
        while(c!=node){
            temp=temp.next;
            c++;
        }
        temp.next=temp.next.next;
        return head;
    }
}