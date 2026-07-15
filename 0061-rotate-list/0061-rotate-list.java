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
        ListNode curr=head;
        if(curr==null || curr.next==null){
            return curr;
        }
        int size=0;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        curr=head;
        k=k%size;
        while(k>0){
            while(curr!=null && curr.next!=null && curr.next.next!=null){
                curr=curr.next;
            }
            ListNode last= curr.next;
            curr.next=null;
            last.next=head;
            head=last;
            curr=head;
            k--;
        }
        return head;
        
    }
}