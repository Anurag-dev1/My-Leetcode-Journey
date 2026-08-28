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

    private boolean isIdentical(TreeNode root ,TreeNode subRoot ){
        if(root == null && subRoot == null)
        return true;

        if(root == null || subRoot == null)
        return false;

        if(root.val != subRoot.val )
        return false;

        return isIdentical(root.left,subRoot.left) &&  isIdentical(root.right,subRoot.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || root == null)
        return root == subRoot ? true :false;

        if((root.val == subRoot.val) && isIdentical(root,subRoot))
        return true;

        return isSubtree(root.left , subRoot) || isSubtree(root.right, subRoot);
    }
}