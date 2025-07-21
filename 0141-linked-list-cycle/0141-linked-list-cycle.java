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

        if(head==null) return false;
        ListNode temp=head;
        ListNode upcoming=head;

        while(temp!=null && upcoming!=null && upcoming.next!=null){
            temp=temp.next;
            upcoming=upcoming.next.next;
            if(temp==upcoming) return true;
        }

        return false;
        
    }
}