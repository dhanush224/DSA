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
    public ListNode detectCycle(ListNode head) {

        if(head==null || head.next==null) return null;

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) break;
        }

        // System.out.println("Slow: "+slow.val+", Fast: "+fast.val);

        fast=head;

        while(slow!=null){
            if(slow==fast) return slow;
            slow=slow.next;
            fast=fast.next;
        }

        return null;
        
    }
}