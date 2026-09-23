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

class Solution 
{
    private int maxDepth;
    
    public int maxDepth(TreeNode root) 
    {
       
        
        maxDepth = traverseTree(root);

        return maxDepth;
        
    }

    public int traverseTree(TreeNode node)
    {
        
        //base case
        if(node == null)
        {
            return 0;
        }

        int leftDpeth = traverseTree(node.left);
        int rightDepth = traverseTree(node.right);

        leftDpeth = 1 + leftDpeth;
        rightDepth = 1 + rightDepth;

        return Math.max(leftDpeth,rightDepth );

    }


}
