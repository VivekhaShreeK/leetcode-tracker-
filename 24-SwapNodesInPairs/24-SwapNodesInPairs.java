// Last updated: 27/07/2026, 10:15:06
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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy, cur = head;
        while (cur != null && cur.next != null) {
            ListNode npn = cur.next.next;
            ListNode second = cur.next;
            second.next = cur;
            cur.next = npn;
            prev.next = second;
            prev = cur;
            cur = npn;
        }
        return dummy.next;        
    }
}