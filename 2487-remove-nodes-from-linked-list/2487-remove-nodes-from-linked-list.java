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
    public ListNode removeNodes(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        ListNode succ;
        while(curr!=null){
            succ=curr.next;
            curr.next=prev;
            prev=curr;
            curr=succ;
        }
        head=prev;
        ListNode currNode=head.next;
        ListNode prevNode=head;
        while(currNode!=null){
            if(currNode.val<prevNode.val){
                prevNode.next=currNode.next;
                currNode=currNode.next;
                continue; //prev will only change if there is no removal
            }
            prevNode=currNode;
            currNode=currNode.next;
        }
        curr=head;
        prev=null;
        while(curr!=null){
            succ=curr.next;
            curr.next=prev;
            prev=curr;
            curr=succ;
        }
        return prev;
    }
}