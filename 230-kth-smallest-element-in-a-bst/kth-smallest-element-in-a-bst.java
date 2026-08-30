class Solution {
    int preordered = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
        return -1;
        //left
        if(root.left !=null){
            int leftAns = kthSmallest(root.left , k);
            if(leftAns != -1)
            return leftAns;
        }
        //root check
        if(preordered + 1 == k )
        return root.val;

        preordered++;

        //right
        if(root.right !=null){
            int rightAns = kthSmallest(root.right , k);
            if(rightAns != -1)
            return rightAns;
        }

        return -1;
    }
}