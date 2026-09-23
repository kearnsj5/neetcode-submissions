
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
    
    public ListNode reverseList(ListNode head) 
    {
        ListNode curent = head;

        ListNode prev = null;
        ListNode next;

        while(curent != null)
        {
            next = curent.next; // store then next node - could even be null;

            curent.next = prev;

            prev = curent;
            curent = next;

        }

        return prev;
    }
}

