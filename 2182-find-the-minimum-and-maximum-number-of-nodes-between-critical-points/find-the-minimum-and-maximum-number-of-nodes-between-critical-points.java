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
    public boolean isCritical(ListNode prev){
        if(prev.next!=null && prev.next.next!=null){
            if(prev.val<prev.next.val && prev.next.next.val<prev.next.val){
                return true;
            }
            else if(prev.val>prev.next.val && prev.next.next.val>prev.next.val){
                return true;
            }
            else return false;
        }
        return false;
    }
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr=new int[2];
        ListNode curr=head;
        int cnt=1;
        arr[0]=-1;
        arr[1]=-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(curr!=null){
            if(isCritical(curr)){
                if(arr[0]==-1){//if empty first index
                    arr[0]=cnt;
                }
                //if first filled
                else{
                    if(arr[1]!=-1){
                        if(cnt-arr[1]<min){
                            min=cnt-arr[1];
                           
                        }
                         arr[1]=cnt;
                    }
                    else{//if empty 2nd index
                        arr[1]=cnt;
                        min=arr[1]-arr[0];
                    }
                }
            }
            curr=curr.next;
            cnt++;
        }
        //max
        cnt=1;
        curr=head;
        arr[0]=-1;
        arr[1]=-1;
         while(curr!=null){
            if(isCritical(curr)){
                if(arr[0]==-1){
                    arr[0]=cnt;
                }
                else{
                    if(arr[1]!=-1){
                        if(cnt-arr[0]>max){
                            arr[1]=cnt;
                            max=arr[1]-arr[0];
                        }
                    }
                    else{
                        arr[1]=cnt;
                        max=arr[1]-arr[0];
                    }
                }
            }
            curr=curr.next;
            cnt++;
        }
        if(min == Integer.MAX_VALUE){
    return new int[]{-1, -1};
}
        arr[0]=min;
        arr[1]=max;
        return arr;
    } 
}