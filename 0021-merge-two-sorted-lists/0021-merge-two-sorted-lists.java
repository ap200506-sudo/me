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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=null;
        ListNode curr=null;
        ListNode a=null;
        ListNode b=null;
        if(list1 == null){
            return list2;
        }
        else if(list2 == null){
            return list1;
        }
        else if(list1.val<list2.val){
            head=list1;
            curr=list1;
            a=head.next;
            b=list2;
        }
        else{
            head=list2;
            curr=list2;
            b=head.next;
            a=list1;
        }
        
        while(a!=null && b!=null){
            if(a.val<b.val){
                curr.next=a;
                curr=a;
                a=a.next;
                
            }
            else{
                curr.next=b;
                curr=b;
                b=b.next;
            }
        }
        if(b==null){
            curr.next=a;
        }
        else{
            curr.next=b;
        }
        return head;

    
        
    }
}