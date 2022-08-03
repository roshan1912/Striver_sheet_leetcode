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
    public void reverse(ListNode start,ListNode end){
        ListNode prev =null;
        ListNode curr =start;
        ListNode next = curr.next;
        while(prev!=end){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null)
                next=next.next;
        }
    } 
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1)
            return head;
        int steps = k-1;
        ListNode start=head,end=head;
        while(steps!=0){
            end=end.next;
            steps--;
            if(end==null)
                return head;
        }
        ListNode nextHead = reverseKGroup(end.next,k);
        reverse(start,end);
        start.next=nextHead;
        return end;
    }
}