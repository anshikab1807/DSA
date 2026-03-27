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
        HashSet<Integer> set=new HashSet<>();
        for(int x : nums) set.add(x);
        ListNode curr=head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        while(curr!=null){
            if(set.contains(curr.val)){
                prev.next=curr.next;
            }
            else{
                prev=curr;
                
            }
            curr=curr.next;
        }
        return dummy.next;
    }
}