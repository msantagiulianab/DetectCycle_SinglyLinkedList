/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while (slow != fast) {
            
            if (fast == null || fast.next == null) {
            // If 'fast' reaches the end of the LinkedList, it is NOT a cycle
                return false;
            }
            
            // if neither 'fast' nor 'fast.next' are at the end of the LinkedList, it means I can keep traversing the list
            slow = slow.next;
            fast = fast.next.next;
        }
        // 'slow' and 'fast' are now equal, therefor it is a cycle
        return true;
    }
}
