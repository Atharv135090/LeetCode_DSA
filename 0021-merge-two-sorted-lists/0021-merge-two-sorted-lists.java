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
        ListNode dummy=new ListNode(0);
        ListNode ptr=dummy;
        ListNode first=list1;
        ListNode second=list2;
        while(first!=null && second!=null)
        {
            if(first.val<=second.val)
            {
                ptr.next=first;
                first=first.next;
            }
            else
            {
                ptr.next=second;
                second=second.next;
            }
            ptr=ptr.next;
        }
        if(first!=null)
        {
            ptr.next=first;
        }
        if(second!=null)
        {
            ptr.next=second;
        }
        return dummy.next;
    }
}