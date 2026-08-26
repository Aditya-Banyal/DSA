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
        if(list1==null) return list2;
        if(list2==null) return list1;
        if(list2.val<list1.val){
            ListNode first=list2;
            list2=list2.next;
            first.next=list1;
            list1=first;
            
        }
        ListNode curr1=list1;
        ListNode curr2=list2;
        while(curr1!=null && curr2!=null){
            if(curr1.next==null){
                curr1.next=curr2;
                break;
            }
            if(curr1.next.val<curr2.val){
                curr1=curr1.next;
            }
            else{
                ListNode newNode=curr2;
                curr2=curr2.next;
                newNode.next=curr1.next;
                curr1.next=newNode;
                curr1=newNode;
            }
        }
        return list1;
    }
}