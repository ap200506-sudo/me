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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode ans=head;
        ListNode curr= head;
        ListNode tail=head;
        int size=1;
        if(head==null || head.next==null){
            return head;
        }
        while(curr.next != null){
            curr=curr.next;
            size++;
        }

        if(k>=size){
            k=k%size;
        }
        if(k==0){
            return head;
        }
        for(int i=0;i<size-k-1;i++){
            tail=tail.next;
        }
        curr.next=head;
        ans=tail.next;
        tail.next=null;
        return ans;
        
    }
}