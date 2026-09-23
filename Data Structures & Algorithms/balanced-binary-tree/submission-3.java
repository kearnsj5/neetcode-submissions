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
    public boolean isBalanced(TreeNode root) 
    {
       if (isBalancedRecursive(root) == -1) 
        {
        return false;
       }

       return true;
    }
    
    private int isBalancedRecursive(TreeNode node)
    {
        //base case:
        if(node == null)
        {
            return 0;
        }

        int leftSubTree = isBalancedRecursive(node.left);
        int rightSubTree = isBalancedRecursive(node.right);

        if(leftSubTree == -1 || rightSubTree == -1)
{
    return -1;
}

        int absValue = Math.abs(leftSubTree - rightSubTree);
        if(absValue > 1)
        {
            return -1;
        }
       return 1 + Math.max(leftSubTree, rightSubTree);
    }
}
