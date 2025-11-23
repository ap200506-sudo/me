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
    public ListNode deleteMiddle(ListNode head) {
        int count=0;
        ListNode curr=head;
        for(count =0;curr!=null;count ++){
            curr=curr.next;
        }
        if(count == 1){
            return null;
        }
        int mid = count/2;
        curr=head;
        for(int i=0;i<mid-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
        
    }
}