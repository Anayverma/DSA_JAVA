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
        if( head == null ) return head;
        ListNode cur = head , prev = null , nex = head.next;
        while( nex != null ) {
            cur.next = prev;
            prev = cur;
            cur = nex;
            nex = nex.next;
        }
        cur.next = prev;
        return cur;
    }
}
