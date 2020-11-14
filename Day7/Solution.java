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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      int n1=0;
        ListNode temp=l1;
        while(temp!=null){
            temp=temp.next;
            n1++;
        }
        int n2=0;
        temp=l2;
         while(temp!=null){
            temp=temp.next;
            n2++;
        }
     
        ListNode ans=new ListNode();
        
        int c=addTwo(l1,l2,n1,n2,ans);
        
        if(c>0)
        {
              temp=ans.next;
        ListNode n=new ListNode(c,temp);
            ans.next=n;
        }
        
        if(ans.val==0)
            ans=ans.next;
        
        return ans;
        
    }
    
    public int addTwo(ListNode l1, ListNode l2, int n1,int n2,ListNode ans)
    {
        if(n1==0 && n2==0){
          return 0;
      }
        if(n1==n2)
        {
            int c=addTwo(l1.next,l2.next,n1-1,n2-1,ans);
             int num=l1.val+l2.val+c;
            ListNode temp=ans.next;
        ListNode n=new ListNode(num%10,temp);
            ans.next=n;
          return num/10;
        }
        
        if(n1<n2)
        {
             int c=addTwo(l1,l2.next,n1,n2-1,ans);
             int num=l2.val+c;
            ListNode temp=ans.next;
        ListNode n=new ListNode(num%10,temp);
            ans.next=n;
          return num/10;
        }
        
        else
        {
            int c=addTwo(l1.next,l2,n1-1,n2,ans);
             int num=l1.val+c;
            ListNode temp=ans.next;
        ListNode n=new ListNode(num%10,temp);
            ans.next=n;
          return num/10;
        }
    }
}