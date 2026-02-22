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
import java.util.*;
class Solution {
    private List<Integer> arr;
    private Random rand;
    public Solution(ListNode head) {
        arr=new ArrayList<>();
        rand=new Random();
        ListNode temp=head;
        while(temp != null) {
            arr.add(temp.val);
            temp=temp.next;
        }
    }
    public int getRandom() {
        int r=rand.nextInt(arr.size());
        return arr.get(r);
    }
}