/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Step 1: Find the length of the linked list
        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Step 2: If the first node has to be removed
        if (n == len) {
            return head.next;
        }

        // Step 3: Find the node just before the one to delete
        int pos = len - n;

        temp = head;

        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        // Step 4: Delete the nth node from the end
        temp.next = temp.next.next;

        return head;
    }
}