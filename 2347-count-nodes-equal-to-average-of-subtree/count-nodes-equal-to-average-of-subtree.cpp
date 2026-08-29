/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int res ;
    int count;
    int countSum(TreeNode* root){
        if(root == NULL)
        return 0;

        count++;

        int sum = root->val; 

        sum+=countSum(root->left);
        sum+=countSum(root->right);

        return sum;
    }

    void solve(TreeNode* root){
        if(root == NULL)
        return;

        count = 0;
        int sum = countSum(root);

        if(root->val == (sum/count))
        res++;

        solve(root->left);
        solve(root->right);
    }

    int averageOfSubtree(TreeNode* root) {
        res = 0;
        solve(root);

        return res;
    }
};