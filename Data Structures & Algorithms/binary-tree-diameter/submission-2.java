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

    private int maxDiameter;
    public int diameterOfBinaryTree(TreeNode root) 
    {

        getDepth(root);

        return maxDiameter;
        
    }

    private int getDepth(TreeNode node)
    {
        int currDiameter = 0;

        //base case:
        if(node == null)
        {
            return 0;
        }

        int leftSubTree = getDepth(node.left);
        int rightSubTree = getDepth(node.right);

        currDiameter = leftSubTree + rightSubTree;
        
        if (currDiameter > maxDiameter) 
        {
            maxDiameter = currDiameter;
        }

        return 1 + Math.max(leftSubTree, rightSubTree);
        


    }
}
