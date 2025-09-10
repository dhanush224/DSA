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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null || head.next==null){
            return null;
        }

        ListNode temp = head;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int nth = count-n;
        count = 0;

        temp=head;

        if(nth==0){
            return head.next;
        }

        while(temp!=null){
            count++;
            // System.out.println(nth+";"+count);
            if(count==nth){
                // System.out.println(temp.val);
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }

        return head;
        
    }
}