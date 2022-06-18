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
        if(list1==null || list2==null){
            return list1!=null?list1:list2;
        }
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        ListNode C1=list1;
        ListNode C2=list2;
        
        while(C1!=null && C2!=null){
            if(C1.val<C2.val){
                prev.next=C1;
                C1=C1.next; 
            }else{
                prev.next=C2;
                C2=C2.next;
            }
            prev=prev.next;
        }
        prev.next=C1!=null?C1:C2;
        return dummy.next;
    }
}