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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (true) {
            ListNode send = cur.next;
            ListNode des = cur.next;
            int count = 0;
            while (des != null && count < k) {
                des = des.next;
                count++;
            }
            if (count == k) {
                // Reverse k nodes
                cur.next = reverse(send, k);
                send.next = des;
                cur = send;
            } else {
                break;
            }
        }
        
        return dummy.next;
    }
    
    private ListNode reverse(ListNode head, int k) {
        ListNode pre = null, cur = head, nex;
        
        while (k > 0) {
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
            k--;
        }
        
        return pre;
    }
}
