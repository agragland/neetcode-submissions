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
    public ListNode reverseList(ListNode head) {
      //nodes will point to this
        if(head == null) {
            return null;
        }
        ListNode current = head;
        ListNode prev = null;
        ListNode next;
        while(current != null) {
            //next node is the next in the line after head
            next = current.next;
            //set current node next to prev; 
            current.next = prev;
            //prev becomes the current node
            prev = current;
            //current becomes the next node
            current = next;
        }
        return prev;
    }
}
