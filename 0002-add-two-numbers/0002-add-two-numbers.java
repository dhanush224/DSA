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
    ListNode head = null;
    ListNode node = head;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode();
        int sum=0;
        while(l1!=null || l2!=null){
            if(l1==null){
                sum+=l2.val;
                if(sum>9){
                    ret.val=sum-10;
                    sum/=10;
                }
                else{
                    ret.val=sum;
                    sum=0;
                }
            }else if(l2==null){
                sum+=l1.val;
                if(sum>9){
                    ret.val=sum-10;
                    sum/=10;
                }
                else{
                    ret.val=sum;
                    sum=0;
                }
            }else{
                sum+=l1.val+l2.val;
                if(sum>9){
                    ret.val=sum-10;
                    sum/=10;
                }
                else{
                    ret.val=sum;
                    sum=0;
                } 
            }

            if(head==null){ 
                head = new ListNode(ret.val,null);
                node=head;
            }
            else{
                node.next=new ListNode(ret.val,null);
                node=node.next;                
            } 

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }    
        if(sum!=0){
            node.next=new ListNode(sum,null);
            node=node.next; 
        }
        node.next=null;           
        return head;
    }
}