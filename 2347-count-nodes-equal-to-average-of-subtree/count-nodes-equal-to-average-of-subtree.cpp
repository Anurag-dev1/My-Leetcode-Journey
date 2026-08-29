class Solution {
public:

    int result;

    pair<int, int> Solve(TreeNode* root){
        if(!root){
            return {0,0};
        }

        auto P1 = Solve(root->left);
        auto P2 = Solve(root->right);

        int totalSum = P1.first + P2.first + root->val;
        int totalCount = P1.second + P2.second + 1;

        int avg = totalSum / totalCount;

        if(avg == root->val)
            result++;

        return {totalSum , totalCount};
    }

    int averageOfSubtree(TreeNode* root) {
        result = 0;

        Solve(root);

        return result;
    }
};