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
        ListNode next = start.next;
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
        int i=0;
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode beforestart = dummy,end=head;
        while(end!=null){
            i++;
            if(i%k==0){
                ListNode start=beforestart.next,temp=end.next;
                reverse(start,end);
                beforestart.next=end;
                start.next=temp;
                beforestart=start;
                end=temp;
            }
            else{
                end=end.next;
            }
        }
        return dummy.next;
    }
}