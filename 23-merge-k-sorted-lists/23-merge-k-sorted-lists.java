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
    public ListNode merge(ListNode[] lists,int si,int ei) {
        if(si>ei){
            return null;
        }
        if(si==ei){
            return lists[si];
        }
        int mid=(si+ei)/2;
        
        ListNode l1=merge(lists,si,mid);
        ListNode l2=merge(lists,mid+1,ei);
        return mergeTwoLists(l1,l2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        return merge(lists,0,lists.length-1);
    }
}