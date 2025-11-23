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
    public int gcd(ListNode a, ListNode b){
        int x=a.val;
        int y=b.val;
        while(y !=0){
            int temp=y;
            y=(x)%(y);
            x=temp;
        }
        return x;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head== null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode curr= head;
        while(curr.next!=null){
            int data = gcd(curr,curr.next);
            ListNode temp=new ListNode(data);
            temp.next=curr.next;
            curr.next=temp;

            curr=temp.next;
        }
        return head;

        
    }
}