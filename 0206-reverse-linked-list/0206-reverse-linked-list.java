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
    public ListNode reverseList(ListNode head) {

        if(head==null || head.next==null) return head;

        ListNode temp = head;
        if(temp.next!=null) {
            ListNode newHead = reverseList(temp.next);
            ListNode front = temp.next;
            if(temp.next==newHead){
                temp.next=null;
                newHead.next=temp;
            } 
            else{
                front.next=temp;
                temp.next=null;
            } 
            return newHead;
        }

        return temp;

       

        
        
    }
}