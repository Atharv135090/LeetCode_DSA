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
        ListNode prev=null;
        ListNode next;
        ListNode curr=head;
        int count=1;

        if(head==null || left==right)
        {
            return head;
        }

        while(count<left)
        {
            prev=curr;
            curr=curr.next;
            count++;
        }

        ListNode leftprev=prev;
        ListNode leftNode=curr;

        while(count<=right)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }

        if(leftprev!=null)
        {
            leftprev.next=prev;
        }
        else
        {
            head=prev;
        }
        leftNode.next=curr;
        return head;

    }
}