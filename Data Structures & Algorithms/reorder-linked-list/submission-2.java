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
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;
        //keep a reference to head
        while(curr != null) {
            stack.push(curr);
            curr = curr.next;
        }
        int pops = stack.size() / 2;
        curr = head;
        while(pops-- > 0) {
            ListNode temp = curr.next;
            curr.next = stack.pop();
            //curr.next = new ListNode(tail.next.val);
            curr = curr.next;
            curr.next = temp;
            curr = curr.next;
        }
        curr.next = null;
    }
}
