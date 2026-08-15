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
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }

        ListNode curr = head;
        Map<Integer, ListNode> ht = new HashMap<>();
        while(!ht.containsKey(curr.val)) {
            ht.put(curr.val, curr);
            if(curr.next == null) {
                break;
            }
            curr = curr.next;
        }
        if(curr.next == null) {
            return false;
        }
        return true;

    }
}
