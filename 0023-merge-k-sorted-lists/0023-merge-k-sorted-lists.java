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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq= new PriorityQueue<>((a,b)->a.val-b.val);
        ListNode head= new ListNode();
        ListNode tail=head;
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null)pq.add(lists[i]);
        }
        while(!pq.isEmpty()){
            ListNode curr=pq.poll();
            if(curr!=null){
                tail.next=curr;
                tail=tail.next;
                if(curr.next!=null){
                    pq.add(curr.next);
                }
            }
        }
        return head.next;
    }
}