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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ListNode temp = new ListNode(-1,head);
        ListNode dummy=head;
        ListNode prev=temp;
        while(dummy!=null){
            if(set.contains(dummy.val)) prev.next=dummy.next;
            else prev=dummy;
            dummy=dummy.next;
        }
        return temp.next;
    }
}