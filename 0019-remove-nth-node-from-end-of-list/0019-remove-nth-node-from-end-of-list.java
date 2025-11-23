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
        int count =0;
        ListNode curr=head;

        while(curr!=null){
            curr=curr.next;
            count++;
        }
        
        if(count == n ){
            return head.next;
            
            
        }
        
        int count2=1;
        curr=head;
        while(count2 < count-n){
            curr=curr.next;
            count2++;
        }

        curr.next=curr.next.next;
    
        
        return head;
        
    }
}