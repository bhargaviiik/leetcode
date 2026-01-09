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
        if(k==0) return head;
        if(head==null || head.next==null) return head;
        Info ans= reverse(head);
        head=ans.head;
        int size=ans.size;
        ListNode head1;
        ListNode dummy=head;
        k=k%size;
        if(k==0) return reverse(head).head;
        int i=1;
        while(i++<k){
            dummy=dummy.next;
        }
        head1=dummy.next;
        dummy.next=null;
        head=reverse(head).head;
        head1=reverse(head1).head;
        dummy=head;
        while(dummy.next!=null){
            dummy=dummy.next;
        }
        dummy.next=head1;
        return head;
    }
    Info reverse(ListNode head){
        ListNode prev= null;
        ListNode curr=head;
        ListNode next;
        int count=0;
        while(curr!=null){  //reverse the entire list
            count++;
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return new Info(prev,count);
    }
    class Info{
        ListNode head;
        int size;
        Info(ListNode head,int size){
            this.head=head;
            this.size=size;
        }
    }
}