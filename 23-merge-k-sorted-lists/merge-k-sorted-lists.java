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
    public ListNode mergeKLists(ListNode[] lists) {
        int arr[]=new int [100000];
        for(int i=0;i<lists.length;i++){
            ListNode head=lists[i];
            while(head!=null){
                arr[head.val+10000]++;
                head=head.next;
            }
        }
        ListNode MainHead=new ListNode();
        ListNode cur=MainHead;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                count++;
                ListNode l=new ListNode(i-10000);
                cur.next=l;
                cur=cur.next;
            }
        }
        if (count==0){
            return null;
        }
        return MainHead.next;
    }
}