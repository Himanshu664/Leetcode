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
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode forr=null;
        if(head==null || head.next==null){
            return head;
        }
        while(curr!=null){
            forr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forr;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null || l2==null){
            return l1!=null?l1:l2;
        }
        ListNode C1=reverse(l1);
        ListNode C2=reverse(l2);
        ListNode head=new ListNode(-1);
        ListNode itr=head;
        int carry=0;
        while(C1!=null || C2!=null || carry!=0){
            int sum=carry+(C1!=null?C1.val:0)+(C2!=null?C2.val:0);
            int ld=sum%10;
            carry=sum/10;
            itr.next=new ListNode(ld);
            itr=itr.next;
            if(C1!=null){
                C1=C1.next;
            }
            if(C2!=null){
                C2=C2.next;
            }
        }
        return reverse(head.next);
    }
}