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
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        Collections.sort(list);
        ListNode dummy=new ListNode();
        ListNode dummy_head=dummy;
        for(int i=0;i<list.size();i++){
            ListNode p=new ListNode();
            p.val=list.get(i);
            dummy.next=p;
            dummy=dummy.next;
        }
        return dummy_head.next;
    }
}