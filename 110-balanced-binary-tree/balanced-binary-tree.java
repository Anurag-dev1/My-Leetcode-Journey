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

    private int hight(TreeNode root){
        if(root == null)
        return 0;

        int left = hight(root.left);
        int right = hight(root.right);

        return 1+Math.max(left,right);
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null)
        return true;

        int L = hight(root.left);
        int R = hight(root.right);

        if(Math.abs(L-R) > 1)
        return false;

        return (isBalanced(root.left) && isBalanced(root.right));
    }
}