/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) 
    {
      return traverseTree(p,q );

    }

    private boolean traverseTree(TreeNode pNode, TreeNode qNode)
    {
        //base case 1 : both null
        if(pNode == null && qNode ==null)
        {
            return true;
        }
        //base case 2 : one null and other not:
        if( (pNode != null && qNode == null) || (pNode == null && qNode != null)   )
        {
            return false;
        }

        // Both equal traverse left and right and see.

        //this.val = val;

       if(pNode.val != qNode.val)
       {
            return false;
       }

       return traverseTree(pNode.left, qNode.left) &&
       traverseTree(pNode.right,qNode.right);


        



        
    }
}

