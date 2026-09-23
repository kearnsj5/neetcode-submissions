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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        TreeNode solution = lca(root, p, q);
        return solution;
    }

    private TreeNode lca(TreeNode currNode, TreeNode p, TreeNode q)
    {
        // both less than so go left.
        if( (p.val < currNode.val) && (q.val < currNode.val) )
        {
            return lca(currNode.left, p, q);
        }

        if( (p.val > currNode.val) && (q.val > currNode.val) )
            {
                return lca(currNode.right, p, q);
            }

            return currNode;


    }
}
