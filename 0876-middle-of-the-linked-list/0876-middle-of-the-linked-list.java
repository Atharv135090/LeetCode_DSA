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
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}





/*class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode temp=head;
        ListNode next;

        while(temp!=null)
        {   
            temp=temp.next;
            count++;
        }
        int mid=(count/2)+1;
        int curr=1;
        temp=head;
        while(curr<mid)
        {
            temp=temp.next;
            curr++;
            
        }return temp;
    }
}*/