
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
    
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        
        return mergeTwoListsRecursive(list1, list2);
    }

    private ListNode mergeTwoListsRecursive(ListNode currNode1, ListNode currNode2)
    {
        if(currNode1 == null)
        {
            return currNode2;
        }
        if(currNode2 == null)
        {
            return currNode1;
        }

        if(currNode1.val <= currNode2.val)
        {
            currNode1.next = mergeTwoListsRecursive(currNode1.next, currNode2);
            return currNode1;
        }

        else
            {
                currNode2.next = mergeTwoListsRecursive(currNode1, currNode2.next);
                return currNode2;
            }



    }
}
