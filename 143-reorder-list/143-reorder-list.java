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
        ListNode M = mid(head);
        ListNode rev = reverse(M.next);
        M.next = null;
        ListNode p1 =  head ,p1Next;    
        while(p1!=null && rev!=null){
            p1Next =  p1.next;                                    
			p1.next =  rev;
			           
            p1 =  rev;
            rev=p1Next;                        
        }              
        
    }
    public ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode m){
        ListNode prev=null;
        ListNode curr=m;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}