class Solution {
public:
    vector<vector<int>> res; 
    void Solve(vector<int>& nums , int i , int n,vector<int> &temp){
        if(i >= n){
            res.push_back(temp);
            return;
        }

        temp.push_back(nums[i]);
        Solve(nums, i+1 , n , temp);
        temp.pop_back();
        Solve(nums , i + 1 , n, temp);
    }
    vector<vector<int>> subsets(vector<int>& nums) {
        int n = nums.size();
        vector<int> temp;
        Solve(nums ,0 , n , temp );
        
        return res;
    }
};