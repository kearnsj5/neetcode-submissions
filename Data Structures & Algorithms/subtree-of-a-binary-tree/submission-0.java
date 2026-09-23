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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) 
    {
       return traverseTree(root, subRoot);
    }

    
    private boolean traverseTree(TreeNode rootNode, TreeNode subRootNode)
    {
        if(rootNode == null)
        {
            return false;
        }

        if (sameTree(rootNode, subRootNode))
        {
            return true;
        }

       return  traverseTree(rootNode.left, subRootNode) || 
       traverseTree(rootNode.right, subRootNode);



    }
    
    private boolean sameTree(TreeNode rootNode, TreeNode subRootNode)
    {
        //base case 1 : both null
        if(rootNode == null && subRootNode ==null)
            {
                return true;
            }
            //base case 2 : one null and other not:
            if( (rootNode != null && subRootNode == null) || (rootNode == null && subRootNode != null)   )
            {
                return false;
            }
            //base case 3 : find a value in the nodes that aren't equal.
           if(rootNode.val != subRootNode.val)
           {
                return false;
           }
           
           // recursion keeping the result of the left and right subtree so no overwrites.
           return sameTree(rootNode.left, subRootNode.left) &&
           sameTree(rootNode.right,subRootNode.right);
    }
}
