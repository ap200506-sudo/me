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
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        if(count == 1){
            return head;
        }
        int mid=count/2 ;
        int i=1;
        curr=head;
        while(i<mid){
            curr=curr.next;
            i++;
        }
        return curr.next;
        
    }
}