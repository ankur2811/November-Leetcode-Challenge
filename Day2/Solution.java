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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(-1),curr=head;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            ListNode prev=dummy;
            ListNode nxt=dummy.next;
            
            while(nxt!=null)
            {
               if(curr.val<nxt.val)
                   break;
                
                 prev = nxt;
                nxt = nxt.next;
            }
            prev.next=curr;
            curr.next=nxt;
            curr=temp;
            
        }    
        return dummy.next;
    }
}