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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // PHASE 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // PHASE 2: Reverse the second half of the list
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null; // Cut the list in half
        
        while (curr != null) {
            ListNode nextTemp = curr.next; // 1. Save the next node
            curr.next = prev;              // 2. Flip the arrow backward
            prev = curr;                   // 3. Move prev forward
            curr = nextTemp;               // 4. Move curr forward
        }

        // PHASE 3: Merge the two halves alternately (Weaving)
        ListNode first = head;
        ListNode second = prev; // Head of the newly reversed second half
        
        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;  // 1 to 5
            second.next = temp1;  // 5 to 2

            first = temp1;        // Advance first half pointer
            second = temp2;       // Advance second half pointer
        }
    }
}
