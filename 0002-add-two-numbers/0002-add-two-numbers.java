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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode start = new ListNode();
        start.next= new ListNode();
        ListNode ans= start;
        int carry=0;
        while(l1!=null || l2!=null ){
            ans=ans.next;
            int sum= ((l1!=null)?l1.val:0) + ((l2==null)?0:l2.val)+ carry;
            carry= sum/10;
            sum=sum%10;
            ans.val=sum;
            ans.next= new ListNode();
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        if(carry!=0){
            ans.next.val=carry;
            ans=ans.next;
        }
        ans.next= null;
        return start.next;
    }
}