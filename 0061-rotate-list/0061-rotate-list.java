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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        if( head == null ) return head;
        int i = k;
        while (i>0){
            if(temp.next == null){
                temp = head;
            }
            else temp = temp.next;
            i--;
        }
        if( temp.next == null ) return null;
        else{
            ListNode temp2 = temp.next, head2 = temp.next ;
            temp.next = null;
            while( temp2.next != null ) temp2 = temp2.next ;
            temp2.next = head;
            return head2;
        }
    }
}