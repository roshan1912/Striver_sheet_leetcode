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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode dummy = new ListNode(-1);
        ListNode end=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                end.next=list1;
                end=list1;
                list1=list1.next;
            }else{
                end.next=list2;
                end=list2;
                list2=list2.next;
            }
        }
        if(list1==null){
            end.next=list2;
        }
        if(list2==null){
            end.next=list1;
        }
        return dummy.next;
    }
}