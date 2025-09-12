/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Map<ListNode, Integer> map = new HashMap<>();

        ListNode tempA = headA;
        ListNode tempB = headB;

        while(tempA!=null || tempB!=null){
            if(map.containsKey(tempA)) return tempA;
            else if(map.containsKey(tempB)) return tempB;
            else if(tempA==tempB) return tempA;

            if(tempA!=null){
                map.put(tempA, tempA.val);
                tempA = tempA.next;
            }

            if(tempB!=null){
                map.put(tempB, tempB.val);        
                tempB = tempB.next;
            }
            
        }

        return null;
        
    }
}