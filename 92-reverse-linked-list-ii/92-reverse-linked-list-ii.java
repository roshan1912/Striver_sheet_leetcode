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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        ListNode pre = null;
        for(int i=0;i<left;i++){
            pre = curr;
            curr = curr.next;
        }
        ListNode pre2 = pre;
        ListNode curr2 = curr;
        ListNode temp;
        for(int i=left;i<=right;i++){
            temp = curr2.next;
            curr2.next = pre2;
            pre2 = curr2;
            curr2 = temp;
        }
        pre.next = pre2;
        curr.next = curr2;
        return dummy.next;
    }
}