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
        ListNode temp =head;

        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        temp=head;
        int count1=0;
        while(temp!=null){
            count1++;
            if(count1==(count/2)+1) return temp;
            temp=temp.next;
        }

        return null;

    }
}