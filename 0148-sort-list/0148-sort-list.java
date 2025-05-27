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
    public ListNode sortList(ListNode head) {
        return sort(head);
    }
    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode head1,ListNode head2){
        ListNode dummy = new ListNode();
        ListNode temp=dummy; /*variable to traverse our new list since we cant change our actual
        head ie dummy*/ 
        temp=dummy;
        
        while(head1!=null && head2!=null){ //&& with !=
            if(head1.val>head2.val){
                temp.next=head2;
                head2=head2.next;
            }
            else{
                temp.next=head1;
                head1=head1.next;
            }
            temp=temp.next;
        }
        //for remaining ele's in either of the two arrays
        if(head1!=null){
            temp.next=head1; //no loop since this is ll
        }
        else{
            temp.next=head2;
        }
        return dummy.next; //head of our merged list
    }
    public ListNode sort(ListNode head){
        if(head==null||head.next==null){// one ele is always sorted
            return head;
        }
        //merge sort 
        ListNode middle=mid(head);
        ListNode rh=middle.next;
        middle.next=null; //left halve broken 
        //left halve
        ListNode left=sort(head);
        //right halve
        ListNode right=sort(rh);
        return merge(left,right);
    }
}