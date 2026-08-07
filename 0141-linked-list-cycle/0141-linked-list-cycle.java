/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode high=head;

        while(high!=null && high.next!=null)
        {
            high=high.next.next;
            slow=slow.next;
            if(high==slow)
            {
                return true;
            }
        }return false;
        
    }
}